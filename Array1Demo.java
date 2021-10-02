package Chap05;

import java.util.Scanner;

public class Array1Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		System.out.println("ЦђБе=" +	sum / 5.0);
		
	}
}

package _9_6;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0;
		do {
			n=sc.nextInt();
			if(n%2==0) {
				s+=n;
			}
		} while (n>0);
		System.out.println(s);
	}
}
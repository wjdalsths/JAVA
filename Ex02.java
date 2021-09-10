package _9_6;

import java.util.Scanner;

public class Ex02 {
	public static int factorial(int n) {
		int re = 1;
		while (n > 0) {
			re *= n;
			n -= 1;
		}
		return re;
	}

	public static int factorial(int n, int n1) {
		int re = 1;
		while (n <= n1) {
			re *= n;
			n += 1;
		}
		return re;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println(result);
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
}

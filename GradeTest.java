package Chap06v2;

import java.util.Scanner;

class Grade {
	int math, kor, eng;

	public Grade(int n, int n2, int n3) {
		this.math = n;
		this.kor = n2;
		this.eng = n3;
	}

	int sum() {
		return math + kor + eng;
	}

	double avg() {
		return (double)sum() / 3;
	}
}


public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n2, n3;
		n = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		Grade g = new Grade(n, n2, n3);
		System.out.println("점수 합계: " + g.sum());
		System.out.printf("점수 평균: %.1f", g.avg());
	}
}

package _9_6;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int re=1,n;
		n=sc.nextInt();
		while(n>0) {
			re*=n;
			n-=1;
		}
		System.out.println(re);
	}
}

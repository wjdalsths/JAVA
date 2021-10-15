package ½Ê_½Ê¿À;

import java.util.Scanner;

public class NumofCount {
	public static void main(String[] args) {
		int num[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			num[i]=sc.nextInt();
		}
		int cnt=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(num[j]==i) {
					cnt++;
				}
			}
			System.out.print(i+": ");
			for(int k=0;k<cnt;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			cnt=0;
		}
	}
	
}

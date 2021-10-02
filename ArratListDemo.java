package Chap05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArratListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> scores=new ArrayList<>();
		int data;
		int sum=0;
		
		while((data=sc.nextInt())>=0)
			scores.add(data);
		
		for(int i=0;i<scores.size();i++)
			sum+=scores.get(i);
		
		System.out.println("ЦђБе= "+(double)sum/scores.size());
	}
}

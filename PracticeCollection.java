package Chap11_Collection;

import java.util.ArrayList;
import java.util.Collections;


public class PracticeCollection {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		
		System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i)+" ");
		}System.out.println();
		
		l.remove(0); //0번째 삭제
		System.out.println(l);
		
		System.out.println(l.contains(5));
		
		Collections.shuffle(l); //섞기
		System.out.println(l);
		Collections.reverse(l); //역순 정렬
		System.out.println(l);
		Collections.sort(l); //정렬
		System.out.println(l);
		
		System.out.println(Collections.binarySearch(l, 5));
	}
}

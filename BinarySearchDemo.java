package Chap11_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo{
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			li.add(i);
		}
		Collections.shuffle(li);
		System.out.println(li);
		System.out.println(Collections.binarySearch(li, 5));

		Collections.sort(li);
		System.out.println(li);
		System.out.println(Collections.binarySearch(li, 5));
	}
}

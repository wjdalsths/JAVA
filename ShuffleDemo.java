package Chap11_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {
	public static void main(String[] args) {
		List<Character>list = new ArrayList<>();
		
		for(char c='A'; c<='G';c++) {
			list.add(c);
		}
		System.out.println("�ּ� ����Ʈ: \t"+list);
		Collections.rotate(list, 1);
		System.out.println("���� ����Ʈ: \t"+list);
		Collections.shuffle(list);
		System.out.println("���� ����Ʈ: \t"+list);
		
	}
}

package Exception;

import java.util.Scanner;

public class TryCatch1Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		Scanner s = new Scanner(System.in);
		System.out.println("�� ��° ���ڸ� ����Ͻðڽ��ϱ�? : ");
		int input = s.nextInt();

		try {
			System.out.println(array[input]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ұ� �������� �ʴ´�.");
		} 
		finally {
			System.out.println("���� ���Դϴ�.");
		}

	}
}

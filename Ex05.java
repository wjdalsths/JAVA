package _9_6;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rank=sc.nextInt();
		switch(rank){
		case 1:System.out.println("���� ����");break;
		case 2:
		case 3:System.out.println("������");break;
		case 4:
		case 5:
		case 6:System.out.println("�����Դϴ�");break;
		default:System.out.println("����ϼ���");break;
			
		}
	}
}

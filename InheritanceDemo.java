package Chap6;

public class InheritanceDemo {
	public static void main(String[] args) {
		 Circle c1=new Circle();
		 Ball c2=new Ball("������");
		 
		 System.out.print("��: ");
		 //c1.secret();
		 c1.findRadius();
		 c1.findArea();
		 
		 System.out.print("��: ");
		 c2.findRadius(); //��ӹ���
		 //c2.findcolor(); 
		 c2.findArea(); //�޼��� �������̵�: �θ�Ŭ������ �޼��尡 �ڽ�Ŭ�������� �����ϴٸ� �״�� ��밡�� 
		 //������ �������� �ʴٸ� �ڽ� Ŭ������ �������� �޼��带 �ڽſ��� �µ��� �����ؾ� �Ѵ�.
		 c2.findVolume();
	}
}

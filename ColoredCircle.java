package Chap6;

public class ColoredCircle extends Circle1{
	String color;
	
	
	public ColoredCircle(int radius,String color) {
		super(radius);//�θ������ 
		this.color=color;
	}

	/*
	 * void show() { System.out.println("�������� " + radius + "�� " + color + "�� ���̴�");
	 * }
	 */
}

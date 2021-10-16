package chal;

class Circle{
	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	void show() {
		System.out.println("�������� "+radius+"�� ���̴�.");
	}
}


class ColoredCircle extends Circle{
	String color;
	public ColoredCircle(int radius,String color) {
		super(radius);
		this.color=color;
	}
	
	void show() {
		System.out.println("�������� "+radius+"�� "+color+"�� ���̴�.");
	}
}


public class CircleTest {
	public static void main(String[] args) {
		Circle c=new Circle(5);
		ColoredCircle co=new ColoredCircle(10, "����");
		c.show();
		co.show();
	}
}

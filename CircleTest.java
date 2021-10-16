package chal;

class Circle{
	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}
}


class ColoredCircle extends Circle{
	String color;
	public ColoredCircle(int radius,String color) {
		super(radius);
		this.color=color;
	}
	
	void show() {
		System.out.println("반지름이 "+radius+"인 "+color+"색 원이다.");
	}
}


public class CircleTest {
	public static void main(String[] args) {
		Circle c=new Circle(5);
		ColoredCircle co=new ColoredCircle(10, "빨간");
		c.show();
		co.show();
	}
}

package Abstruct_Interface;

abstract class Shape{
	double pi=3.14;
	
	abstract void draw();
	
	public double findArea() {
		return 0.0;
	}
}

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그리다.");
	}
	
	public double findArea() {
		return pi*radius*radius;
	}
}
class Rectangle {
	int width;
	int height;
	
	public Rectangle(int i, int j) {
		width=i;
		height=j;
	}

	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	
	public double findArea() {
		return width*height;
	}
}
public class Sec01 {
	public static void main(String[] args) {
		//Shape s=new Shape(); 생성자를 사용해 객체를 생성할 수 업다.
		Circle c=new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n",c.findArea());
		
		Rectangle r=new Rectangle(3,4);
		r.draw();
		System.out.printf("사각형의 넓이는 %.1f\n",r.findArea());
		
		
	}
}

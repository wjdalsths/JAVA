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
		System.out.println("���� �׸���.");
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
		System.out.println("�簢���� �׸���.");
	}
	
	public double findArea() {
		return width*height;
	}
}
public class Sec01 {
	public static void main(String[] args) {
		//Shape s=new Shape(); �����ڸ� ����� ��ü�� ������ �� ����.
		Circle c=new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n",c.findArea());
		
		Rectangle r=new Rectangle(3,4);
		r.draw();
		System.out.printf("�簢���� ���̴� %.1f\n",r.findArea());
		
		
	}
}

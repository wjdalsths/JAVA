package Chap04;

//this. �� this()
class Circle{
	 double radius;
	 String color;
	 
	  public Circle () {
		 
	 }
	  
	 public Circle(double radius, String color) {
		 this.radius=radius;
		 this.color=color;
	}
	 
	public Circle(double radius) {
//		this.radius=radius;
		this(radius,"�ʷ�");
	}
	
	public Circle(String color) {
		//this.color=color;
		this(1,color);
	}

	void print() {
		 System.out.println(radius+"�������� ���� "+color+"�� ��");
	 }
}
public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(/* 0,null */);
		c1.radius=5.0;
		c1.color="��";
		c1.print();
		
		Circle c2=new Circle(10.0,"���");
		c2.print();
		
		Circle c3=new Circle(7.0);
		//c3.color="�Ķ�";
		c3.print();
		
		Circle c4=new Circle("gray");
		//c4.radius=1;
		c4.print();
		
	}
}

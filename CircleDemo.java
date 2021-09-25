package Chap04;

//this. 과 this()
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
		this(radius,"초록");
	}
	
	public Circle(String color) {
		//this.color=color;
		this(1,color);
	}

	void print() {
		 System.out.println(radius+"반지름을 가진 "+color+"색 공");
	 }
}
public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(/* 0,null */);
		c1.radius=5.0;
		c1.color="빨";
		c1.print();
		
		Circle c2=new Circle(10.0,"노랑");
		c2.print();
		
		Circle c3=new Circle(7.0);
		//c3.color="파란";
		c3.print();
		
		Circle c4=new Circle("gray");
		//c4.radius=1;
		c4.print();
		
	}
}

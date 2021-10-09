package Chap06;

public class Circle11Test {
	public static void main(String[] args) {
		Circle11 c1=new Circle11(10,5);
		Cylinder c2=new Cylinder(10,5);
		Ball11 c3=new Ball11(10,5);
		Cone c4=new Cone(10,5);
		
		c1.findArea();
		c2.findArea();
		c3.findArea();
		c4.findArea();
	}
}

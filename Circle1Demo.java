package Chap04;

//private_������(getter) ������(setter)
class Circle1{
	private double radius;
	
//	public void setter(double radius) {
//		this.radius=radius;
//	}
//	public double getter() {
//		return radius;
//	}
	
	double findArea() {
		return radius*radius*3.14;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	void show(double radius,double area) {
		System.out.printf("������: %.1f ���� ����: %.1f",radius,area);
	}
}

public class Circle1Demo {
	public static void main(String[] args) {
		Circle1 cir=new Circle1();
//		cir.radius=10.0; error
		cir.setRadius(10.0);
//		cir.show();
		
		cir.show(cir.getRadius(),cir.findArea());
		
	}
}

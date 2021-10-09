package Chap06;

public class Cylinder extends Circle11 {

	public Cylinder(int r, int h) {
		super(r, h);
	}

	public void findArea() {
		System.out.println("실린더의 넓이는 " + (2*f*r*r + 2*f*r*h));
	}
}

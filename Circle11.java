package Chap06;

public class Circle11 {
	int r;
	int h;
	double f=3.14;
	
	public Circle11(int r,int h) {
		this.r=r;
		this.h=h;
	}
	
	public void findArea() {
		System.out.println("원의 넓이는 "+ f*r*r);
	}
	
}

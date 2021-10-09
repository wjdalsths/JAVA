package Chap06;

public class Ball11 extends Circle11 {

	public Ball11(int r, int h) {
		super(r, h);
	}

	public void findArea() {
		System.out.println("구의 넓이는 " + 4*f*r*r);
	}
}

package Chap06;

public class Cone extends Circle11{

	public Cone(int r, int h) {
		super(r, h);
	}
	
	public void findArea() {
		System.out.println("cone�� ���̴� "+ Math.round(f*r*Math.sqrt(r*r+h*h)+f*r*r));
	}

}

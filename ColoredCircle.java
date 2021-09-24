package Chap6;

public class ColoredCircle extends Circle1{
	String color;
	
	
	public ColoredCircle(int radius,String color) {
		super(radius);//부모생성자 
		this.color=color;
	}

	/*
	 * void show() { System.out.println("반지름이 " + radius + "인 " + color + "색 공이다");
	 * }
	 */
}

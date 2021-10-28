package Chap07;

abstract class Human{
	public abstract void sleep();
	public abstract void say();
	
}

class MinJun extends Human{
	public void sleep() {
		System.out.println("πŒ¡ÿ¿Ã∞° ¿‹¥Ÿ.");
	}
	public void say() {
		System.out.println("πŒ¡ÿ¿Ã∞° ∏ª«—¥Ÿ.");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		MinJun min=new MinJun();
		
		min.say();
		min.sleep();
	}
}

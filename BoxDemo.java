package Chap06;
class Box{
	public Box() {
		System.out.println("orange");
	}
}
class ColoredBox extends Box{
	public ColoredBox() {
		System.out.println("apple");
	}
}
public class BoxDemo {
	public static void main(String[] args) {
		ColoredBox cb=new ColoredBox();
	}
}



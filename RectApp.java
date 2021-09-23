package mi;

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}
public class RectApp {
	public static void main(String[] args) {
		Rectangle re=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.print("width: ");
		re.width=sc.nextInt();
		System.out.print("height: ");
		re.height=sc.nextInt();
		System.out.println("≥–¿Ã: "+re.getArea());
		
	}
}

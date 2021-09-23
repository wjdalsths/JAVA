package mi;

public class Circles {
	int radius;
	String name;
	
	public Circles() {//매개변수 없는 생성자
		radius=1;
		name=""; 
	}
	public Circles (int radius, String name) {//매개변수를 가진 생성자
		this.radius=radius;
		this.name=name;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circles pizza=new Circles(10,"자바피자");
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circles donut=new Circles();
		donut.name = "도넛피자";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}

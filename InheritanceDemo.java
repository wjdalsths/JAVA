package Chap6;

public class InheritanceDemo {
	public static void main(String[] args) {
		 Circle c1=new Circle();
		 Ball c2=new Ball("빨간색");
		 
		 System.out.print("원: ");
		 //c1.secret();
		 c1.findRadius();
		 c1.findArea();
		 
		 System.out.print("구: ");
		 c2.findRadius(); //상속받음
		 //c2.findcolor(); 
		 c2.findArea(); //메서드 오버라이딩: 부모클래스의 메서드가 자시클래스에도 적합하다면 그대로 사용가능 
		 //하지만 적합하지 않다면 자식 클래스는 물려받은 메서드를 자신에게 맞도록 수정해야 한다.
		 c2.findVolume();
	}
}

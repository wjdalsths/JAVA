package Chap04;

//���� �ɹ�
class Circles2{
	double radius;
	static int numOfCircles=0;
	int numCircles=0;
	
	//������
	public Circles2(double radius) {
		this.radius=radius;
		numOfCircles++;
		numCircles++;
	}
	public Circles2() {
		
	}
}
public class Circle2Demo {
	public static void main(String[] args) {
		Circles2 myCircle =new Circles2(10.0);
		Circles2 yourCircle =new Circles2(5.0);
		System.out.println("���� ����> " + Circles2.numOfCircles);
		System.out.println("���� ����> " + myCircle.numCircles);
		System.out.println("���� ����> " + yourCircle.numCircles);
		
	}
}

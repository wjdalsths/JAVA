package mi;

public class Circles {
	int radius;
	String name;
	
	public Circles() {//�Ű����� ���� ������
		radius=1;
		name=""; 
	}
	public Circles (int radius, String name) {//�Ű������� ���� ������
		this.radius=radius;
		this.name=name;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circles pizza=new Circles(10,"�ڹ�����");
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circles donut=new Circles();
		donut.name = "��������";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	}
}

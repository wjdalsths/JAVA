package ��_�ʿ�;

class Car{
	String carname;
	String color="������";
	
	void show1() {
		System.out.println("���� Ʈ���� " +color+"�̴�.");
	}
	void show2() {
		System.out.println(carname+"�� ���� �� ����.");
	}
}
class Truck extends Car{
	int ton;
	@Override
	void show2() {
		System.out.println(carname+"�� "+ton+"���� ���� �� �ִ�.");

	}
}
public class TruckTest {
	public static void main(String[] args) {
		Truck my=new Truck();
		my.carname="����Ƽ��";
		my.ton=3;
		my.show1();
		my.show2();
	}
}

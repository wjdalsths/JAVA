package Chap06;

class Vehicle{
	public void run() {
		System.out.println("�������� �޸��ϴ�.");
		
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Texi extends Vehicle{
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}

class Driver{
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}


public class DriverEx {
	public static void main(String[] args) {
		Driver d=new Driver();
		Texi t=new Texi();
		Bus b=new Bus();
		d.drive(t);
		d.drive(b);
		//�������̵� �Ǽ� ������ ��(������)
		
		
	}
}

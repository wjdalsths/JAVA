package Chap06;

class Vehicle{
	public void run() {
		System.out.println("차량ㅇ이 달립니다.");
		
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Texi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
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
		//오버라이딩 되서 접근이 됨(다형성)
		
		
	}
}

package 십_십오;

class Car{
	String carname;
	String color="검정색";
	
	void show1() {
		System.out.println("나의 트럭은 " +color+"이다.");
	}
	void show2() {
		System.out.println(carname+"는 실을 수 없다.");
	}
}
class Truck extends Car{
	int ton;
	@Override
	void show2() {
		System.out.println(carname+"는 "+ton+"톤을 실을 수 있다.");

	}
}
public class TruckTest {
	public static void main(String[] args) {
		Truck my=new Truck();
		my.carname="프론티어";
		my.ton=3;
		my.show1();
		my.show2();
	}
}

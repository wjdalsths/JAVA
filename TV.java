package Abstruct_Interface;

public class TV implements Controllable{
	@Override
	public void repair() {
    Controllable.super.repair();
	}

	@Override
	public void turnOn(){
		System.out.println("TV�� �Ҵ�.");
	}

	@Override
	public void turnOff(){
		System.out.println("TV�� ����.");
	}
	

}

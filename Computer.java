package Abstruct_Interface;

public class Computer implements Controllable{
    @Override
    public void repair() {
        Controllable.super.repair();
    }

    @Override
    public void turnOn() {
        System.out.println("��ǻ�͸� �Ҵ�.");
    }

    @Override
    public void turnOff() {
        System.out.println("��ǻ�͸� ����.");
    }
//    @Override
//	public void repair() {
//		Controllable.super.repair();
//	}
    

}
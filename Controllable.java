package Abstruct_Interface;

public interface Controllable {
    void turnOn();
    void turnOff();
    
    default void repair(){
        System.out.println("��� �����Ѵ�");
    }
    static void reset(){
        System.out.println("��� �ʱ�ȭ");
    }
}
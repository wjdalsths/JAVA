package Chap6;

public class Cellphone {
	// �ʵ�(�Ӽ�)
	String model;
	String color;

	public Cellphone(String mode, String color) {
		this.color=color;
		this.model=model;
	}
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String msg) {System.out.println("�ڱ� " + msg);}
	void reciveVoice(String msg) {System.out.println("���� " + msg);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�. ");}
	
	
	//������
	
	//�޼���
	
}

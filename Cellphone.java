package Chap6;

public class Cellphone {
	// 필드(속성)
	String model;
	String color;

	public Cellphone(String mode, String color) {
		this.color=color;
		this.model=model;
	}
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String msg) {System.out.println("자기 " + msg);}
	void reciveVoice(String msg) {System.out.println("상대방 " + msg);}
	void hangUp() {System.out.println("전화를 끊습니다. ");}
	
	
	//생성자
	
	//메서드
	
}

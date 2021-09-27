package Chap6;

public class DmCellPhone extends Cellphone {
	// 필드(속성)
	int channel;

	// 생성자
	public DmCellPhone(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
		super(model,color);
		this.channel = channel;
	}
	
	
	
	//메서드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB방송수신을 멈춥니다.");
	}
	public void ChangeChannel(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

}

package Chap6;

public class DmCellPhone extends Cellphone {
	// �ʵ�(�Ӽ�)
	int channel;

	// ������
	public DmCellPhone(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
		super(model,color);
		this.channel = channel;
	}
	
	
	
	//�޼���
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB��� ������ �����մϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB��ۼ����� ����ϴ�.");
	}
	public void ChangeChannel(int channel) {
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}

}

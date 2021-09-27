package Chap6;

public class DmCellPhoneTest {
	public static void main(String[] args) {
		DmCellPhone dm=new DmCellPhone("javaphone","black",10);
		
		System.out.println(dm.model);
		System.out.println(dm.color);
		System.out.println(dm.channel);
		
		dm.powerOn();
		dm.bell();
		dm.sendVoice("여보세요");
		dm.reciveVoice("네 신00 입니다.");
		dm.sendVoice("ㅇ 반갑.");
		dm.hangUp();
		
		
		dm.turnOnDmb();
		dm.ChangeChannel(12);
		dm.turnOffDmb();
	}
}

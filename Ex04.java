package Chap07;

interface Wear{
	void putOn();
	void putOff();
}
interface Skin{
	int Black=0;
	int Red=1;
	int Green=2;
	int Blue=5;
	int Yellow=4;
	void changeSkin(int skin);
	
	
}

class Head implements Wear,Skin{
	private int skin;
	
	public void putOn() {
		System.out.println("디스플레이를 착용했습니다.");
	}
	
	public void putOff() {
		System.out.println("디스플레이를 벗엇습니다.");
	}
	
	public void changeSkin(int skin) {
		this.skin=skin;
	}
	public void putSkin() {
		switch(skin) {
			case Black:
				System.out.println("Black display"); break;
			case Red:
				System.out.println("Red display");break;
			case Green:
				System.out.println("Green display");break;
			case Blue:
				System.out.println("Blue display");break;
			case Yellow:
				System.out.println("Yellow display");break;	
		}
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Head h=new Head();
		
		h.putOn();
		h.putOff();
		h.changeSkin(Skin.Yellow);
		h.putSkin();
		
		Wear w=h;
		w.putOn();
		w.putOff();
		
		Skin s=h;
		s.changeSkin(Skin.Black);
		
		h.putSkin();
	}
}

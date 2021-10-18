package chal;

class Phone{
	protected String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}


	void talk() {
		System.out.println(owner+"�� ��ȭ ���̴�");
	}
}
class Telephone extends Phone{
	private String when;
	
	public Telephone(String owner,String when) {
		super(owner);
		this.when=when;
	}
	public Telephone(String owner) {
		super(owner);
	}
	
	public String getOwner() {
		return when;
	}
	public void setOwner(String when) {
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner+"�� ������ "+when+" ��ȭ �ٷ�.");
	}
}
class Smartphone extends Telephone{
	private String game;
	
	public Smartphone(String owner, String game) {
		super(owner);
		this.game=game;
	}
	void playGame() {
		System.out.println(owner+"�� "+game+" ������ �ϴ� ���̴�.");
	}
}
public class PhoneTest {
	public static void main(String[] args) {
		Phone[] ph= {new Phone("Ȳ����"),new Telephone("�浿��","����"),new Smartphone("�α���","������")};
		for(Phone p:ph) {
			if(p instanceof Smartphone) {
				((Smartphone) p).playGame();
			}
			else if(p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			}
			else if(p instanceof Phone) {
				p.talk();
			}
		}
			
	}
}

package ��_�ʿ�;

//class Sports{
//	private String name;
//	
//	
//	public Sports() {
//		
//	}
//	public Sports(String name) {
//		this.name=name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//	void rule() {
//		System.out.println("������: "+name+"��Ģ�� ����");
//	}
//}
//class BaseBall extends Sports{
//	int player;
//	
//	public BaseBall(String name,int player) {
//		super(name);
//		this.player=player;
//	}
//	void rule() {
//		System.out.println("�÷��̾�: "+player);
//	}
//	
//}
//class PingPong extends Sports{
//	String team;
//	
//	public PingPong(String name,String team) {
//		super(name);
//		this.team=team;
//	}
//	void rule() {
//		System.out.println("�����: "+team);
//	}
//}
//public class SportsTest {
//	public static void main(String[] args) {
//		Sports sp=new Sports();
//		Sports[] sp1 = {new BaseBall("baseball",9),new PingPong("PingPong","����")};
//		for(Sports p:sp1)
//			p.rule();
//	}
//}



class Sports {
    private String name;

    public String getName() {
        return name;
    }
    void rule() {
        System.out.println(name + "��Ģ�� ����");
    }
}
class Baseball extends Sports{
    int player = 9;
    String name = "�߱�";
    void rule() {
        System.out.println("������� : Baseball");
        System.out.println("�÷��̾� : " + player);
        System.out.println("����Ģ : " + name + "��Ģ�� ����");
    }
}
class PingPong extends Sports {
    String team = "����";
    String name = "Ź��";
    void rule() {
        System.out.println("������� : PingPong");
        System.out.println("����� : ����");
        System.out.println("����Ģ : " + name + "��Ģ�� ����");
    }
}

public class SportsTest {
    public static void main(String[] args) {
        Baseball b = new Baseball();
        PingPong p = new PingPong();
        Sports[] sports = {new Baseball(), new PingPong()};
        for (Sports i : sports)
            i.rule();
    }
}

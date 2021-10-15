package 십_십오;

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
//		System.out.println("경기규직: "+name+"규칙을 따름");
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
//		System.out.println("플레이어: "+player);
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
//		System.out.println("경기방식: "+team);
//	}
//}
//public class SportsTest {
//	public static void main(String[] args) {
//		Sports sp=new Sports();
//		Sports[] sp1 = {new BaseBall("baseball",9),new PingPong("PingPong","복식")};
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
        System.out.println(name + "규칙을 따름");
    }
}
class Baseball extends Sports{
    int player = 9;
    String name = "야구";
    void rule() {
        System.out.println("경기종목 : Baseball");
        System.out.println("플레이어 : " + player);
        System.out.println("경기규칙 : " + name + "규칙을 따름");
    }
}
class PingPong extends Sports {
    String team = "복식";
    String name = "탁구";
    void rule() {
        System.out.println("경기종목 : PingPong");
        System.out.println("경기방식 : 복식");
        System.out.println("경기규칙 : " + name + "규칙을 따름");
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

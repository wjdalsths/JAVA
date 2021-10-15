package 십_십오;


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

package _9_13;

class GolfClub1{
    int a=0;
    String n;

    public GolfClub1(){
        this.a=7;
    }

    public GolfClub1(int a) {
        this.a = a;
    }
    public GolfClub1(String n){
        this.n=n;
    }
    void print() {
        if(a==0)
        {
            System.out.println("퍼터입니다");
        }
        else{
            System.out.println(a+"번 아이언입니다");
        }
    }
}
public class GolfClub {
    public static void main(String[] args) {
        GolfClub1 g1= new GolfClub1();
        g1.print();
        GolfClub1 g2=new GolfClub1(8);
        g2.print();
        GolfClub1 g3=new GolfClub1("퍼터");
        g3.print();
    }


}

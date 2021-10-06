package _9_13;

class Dice{
    double n;
    public double roll(){
        n=Math.random();
        n=(int)(n*6+1);
        return n;
    }

//    public int roll(){
//        int n= (int) (Math.random()*6+1);
//        return n;
//    }
}
public class DiceTest {
    public static void main(String[] args) {
        Dice d=new Dice();
        System.out.println("주사위의 숫자: "+d.roll());
    }
}

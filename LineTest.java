package _9_13;

class Line{
    int aline;

    public Line(int i) {
        this.aline=i;
    }

    boolean isSameLine(Line x){
        if(aline==x.aline)
            return true;
        else
            return false;
    }

}
public class LineTest {
    public static void main(String[] args) {
        Line a=new Line(1);
        Line b=new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a==b);
    }
}

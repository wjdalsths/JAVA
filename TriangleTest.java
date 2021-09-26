package _9_13;
class Triangle{
    double heigt;
    double bass;
    public Triangle(double bass,double heigt){
        this.bass=bass;
        this.heigt=heigt;
    }
    double findArea(){
        return bass*heigt/2;
    }
    boolean isSameArea(Triangle a){
        if(a.findArea()==findArea())
            return true;
        else
            return false;
    }
}
public class TriangleTest {
    public static void main(String[] args) {
        Triangle t=new Triangle(10.0,5.0);
//        System.out.println(t.findArea());
        Triangle t1=new Triangle(10.0,5.0);
        Triangle t2=new Triangle(5.0,10.0);
        Triangle t3=new Triangle(8.0,8.0);
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));

    }
}

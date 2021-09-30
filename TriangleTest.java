package _9_13;
class Triangle{
    double height;
    double bass;
    public Triangle(double bass,double height){
        this.bass=bass;
        this.height=height;
    }
    double findArea(){
        return bass*height/2;
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

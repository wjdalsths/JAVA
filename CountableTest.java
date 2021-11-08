package _11_8;

//interface Countable{
//    void count();
//}
abstract class Countable{
    protected String name;
    protected int num;
    Countable(String name, int num){
        this.name=name;
        this.num=num;
    }
    abstract void count();
}
class Bird extends /*implements*/ Countable{

    public Bird(String name,int num){
        super(name,num);
    }
    @Override
    public void count(){
        System.out.println(name+"가 "+num+"마리있다");
    }
    public void fly(){
        System.out.println(num+"마리 "+name +"가 날아간다.");

    }
}
class Tree extends /*implements*/ Countable{

    public Tree(String name,int num){
        super(name,num);
    }
    @Override
    public void count(){
        System.out.println(name+"가 "+num+"마리있다");

    }
    public void ripen(){
        System.out.println(num+"그루"+name +"에 열매가 잘 익었다.");

    }
}
public class CountableTest {
    public static void main(String[] args) {
        Countable[] m={new Bird("뻐꾸기",5), new Bird("독수리",2), new Tree("사과나무",10), new Tree("밤나무",7)};
        for (Countable e:m)
            e.count();

        for(int i=0; i<m.length;i++){

            if(m[i] instanceof Bird)
                ((Bird) m[i]).fly();
            else
                ((Tree)m[i]).ripen();

        }
    }
}

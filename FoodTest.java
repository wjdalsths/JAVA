package _11_8;

interface Edible{
    void eat();
}
interface Sweetable{
    void sweet();
}
interface Delicious extends Edible,Sweetable{

}

public class FoodTest {
    public static void main(String[] args) {

    }
}

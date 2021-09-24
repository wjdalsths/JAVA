package Chap6;

public class AnimalTest {
	public static void main(String[] args) {
		Eagle e1=new Eagle();
		e1.wing=2;
		e1.eat();
		e1.fly();
		e1.sleep();
		
		Tiger t1=new Tiger();
		t1.leg=4;
		t1.eat();
		t1.run();
		t1.sleep();
		
		Gold_fish g1=new Gold_fish();
		g1.fin=5;
		g1.eat();
		g1.swim();
		g1.sleep();
	}
	
	
}

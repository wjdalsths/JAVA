package 십_십오;

class Stock{
	String code;
	int count=5;
	
	void add() {
		count++;
	}
	void sub() {
		count--;
	}
	void show() {
		System.out.println("현재 재고:"+count);
	}
}
public class ProducTest {
	public static void main(String[] args) {
		Stock s=new Stock();
		s.show();
		s.add();
		s.show();
		s.sub();
		s.show();
	}
}

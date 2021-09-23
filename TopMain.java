package mi;

class Top {
	public int a;
	public int b;
	public int sum(int x, int y) {
		return x + y;
	}
}

public class TopMain {
	public static void main(String[] args) {
		Top t=new Top();
		t.a=100;
		t.b=200;
		int s=t.sum(t.a,t.b);
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(s);
		
	}
}

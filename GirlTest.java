package chal;

class Girl {
	protected String name;

	public Girl(String name) {
		this.name = name;
	}
	
//	public Girl() {
//	}

	void show() {
		System.out.println(name+"�� �ڹ� �ʺ����̴�.");
	}

}

class GoodGirl extends Girl {
	public GoodGirl(String name){
		super(name);
	}
	
	void show() {
		System.out.println(name+"�� �ڹٸ� �� �ȴ�.");
	}
}

class BestGirl extends GoodGirl {
	public BestGirl(String name) {
		super(name);
	}
	
	void show() {
		System.out.println(name+"�� �ڹٸ� �����ϰ� �� �ȴ�.");
	}
}

public class GirlTest {
	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();

		Girl[] girls= {new Girl("������"),new GoodGirl("����"),new BestGirl("Ȳ����")};
		for(Girl g:girls)
			g.show();
//		g2.show();
//		gg.show();

	}
}

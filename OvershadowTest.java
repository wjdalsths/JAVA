package chal;

class Parent{
	String name="����";
	
	void print() {
		System.out.println("���� "+name+"�̴�.");
	}
}
class Child extends Parent{
	String name="�絵����";
	
	
	void print() {
		System.out.println("���� "+name+"�̴�.");
	}
}

public class OvershadowTest{
	public static void main(String[] args) {
		Parent p=new Child();
		System.out.println(p.name);
		p.print();
	}
}

package Chap06;

class Person {
	String name = "���";

	void whoami() {
		System.out.println("im person");
	}
}

class Stud extends Person {
	int number = 7;

	void work() {
		System.out.println("���� �����Ѵ�");
	}

}



public class UpcastDemo {
	public static void main(String[] args) {
//		Person p=new Stud();
		
//		Person p;
//		p=new Stud();
		
		Person p;
		Stud s=new Stud();
		p=s;
		
//		p.number=1;
//		p.work();
		p.whoami();
	}
}

package Chap04;

//����ȣ��
class Person{
	String name;
	int age;
	
	public Person SetName(String name) {
		this.name=name;
		return this;
	}
	public Person SetAge(int age) {
		this.age=age;
		return this;
	}
	public void sayHello() {
		System.out.println("�ȳ� ����"+ name +"�̰�, ���̴� "+age+"�� �̾�");
	}
}

public class MethodchainDemo {
	public static void main(String[] args) {
		Person ps=new Person();
//		ps.SetName("����");
//		ps.SetAge(17);
//		ps.sayHello();
		
		ps.SetName(" ����").SetAge(17).sayHello();
		
	}
}

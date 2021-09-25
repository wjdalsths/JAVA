package Chap04;

//연속호출
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
		System.out.println("안녕 나는"+ name +"이고, 나이는 "+age+"살 이야");
	}
}

public class MethodchainDemo {
	public static void main(String[] args) {
		Person ps=new Person();
//		ps.SetName("유찬");
//		ps.SetAge(17);
//		ps.sayHello();
		
		ps.SetName(" 유찬").SetAge(17).sayHello();
		
	}
}

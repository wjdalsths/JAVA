package chal;

class Person{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void show() {
		System.out.println("이름: "+name+" 나이: "+age);
	}
}



class Student extends Person{
	int hak;
	
	public Student(String name, int age, int hak) {
		super(name,age);
		this.hak=hak;
	}
	
	public int getHak() {
		return hak;
	}
	public void setHak(int hak) {
		this.hak = hak;
	}


	void show() {
		System.out.println("이름: "+name+" 나이: "+age+" 학번: "+hak);
	}
}
class Foreignstudent extends Student{
	String con;
	public Foreignstudent(String name,int age,int hak,String con) {
		super(name,age,hak);
		
		this.con=con;
	}
	
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}

	void show() {
		System.out.println("이름: "+name+" 나이: "+age+" 학번: "+hak+" 국적: "+con);
	}
}
public class PersonTest {
	public static void main(String[] args) {
		Person[] per= {new Person("길동이",22),new Student("황진이",23,100),new Foreignstudent("Amy", 30, 200, "USA") };
		for(Person p:per)
			p.show();
		
	}
}

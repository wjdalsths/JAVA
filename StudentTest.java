package Chap6;

public class StudentTest {
	public static void main(String[] args) {
		Student p = new Student("������", 50511, 8);
		System.out.println("name: " + p.name + " ssm: " + p.ssn + " hakbun: " + p.hakbun);
		
		Student p1=new Student("������",50607,7);
		System.out.println("name: " + p1.name + " ssm: " + p1.ssn + " hakbun: " + p1.hakbun);
		
		p1.fall();
	}
}

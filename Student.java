package Chap6;

public class Student extends People{
	int hakbun;
	public Student(String name, int ssn,int hakbun) {
		super(name, ssn);
		this.hakbun=hakbun;
	}
	
	//�޼��� �������̵�
	void fall() {
		System.out.println("���� ����̸鼭 �л��Դϴ�.");
	}
} 

package _9_6;

public class Ex10 {
	public static void foo(String ms,int n) {
		System.out.printf("%s %d\n",ms,n);
	}
	public static void foo(String ms,int n,int n1) {
		System.out.printf("%s %d %d\n",ms,n,n1);
	}
	public static void foo(String ms) {
		System.out.printf("%s",ms);
	}
	public static void main(String[] args) {
		foo("�ȳ�",1);
		foo("�ȳ��ϼ���",1,2);
		foo("�� �־�");
		
	}
}

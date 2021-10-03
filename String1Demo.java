package Chap05;

public class String1Demo {
	public static void main(String[] args) {
		String s1 = "hi, java";
		String s2 = "hi, java";
		String s3 = new String("hi, java");
		String s4 = new String("hi, java");

		System.out.println("s1==s2 ->" + (s1 == s2));
		System.out.println("s1==s3 ->" + (s1 == s3));
		System.out.println("s3==s4 ->" + (s3 == s4));

		s1 = s3;
		System.out.println("s1==s3 ->" + (s1 == s3));
		
	}
}

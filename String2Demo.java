package Chap05;

public class String2Demo {
	public static void main(String[] args) {
		String s1="hi, Java";
		String s2=new String("hi, Java");
		String s3="hi, Code";
		String s4="hi, java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println("hi, Java".compareToIgnoreCase("hi, java"));	
	}
}

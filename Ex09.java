package _9_6;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ö��: ");
        String a = sc.next();
        System.out.println("����: ");
        String b = sc.next();
        
        if (a.equals(b)) {
            System.out.print("���º�");
        }
        else if(a.equals("s") && b.equals("p") || a.equals("r") && b.equals("s") || a.equals("p") && b.equals("r")){
            System.out.print("ö��, ��!");
        }
        else if(b.equals("s")&&a.equals("p") || b.equals("r")&&a.equals("s") || b.equals("p")&&a.equals("r")){
            System.out.print("����, ��!");
        }
    }
}


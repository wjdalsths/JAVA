package _9_6;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("철수: ");
        String a = sc.next();
        System.out.println("영희: ");
        String b = sc.next();
        
        if (a.equals(b)) {
            System.out.print("무승부");
        }
        else if(a.equals("s") && b.equals("p") || a.equals("r") && b.equals("s") || a.equals("p") && b.equals("r")){
            System.out.print("철수, 승!");
        }
        else if(b.equals("s")&&a.equals("p") || b.equals("r")&&a.equals("s") || b.equals("p")&&a.equals("r")){
            System.out.print("영희, 승!");
        }
    }
}

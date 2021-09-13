package _9_6;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ã¶¼ö: ");
        String a = sc.next();
        System.out.println("¿µÈñ: ");
        String b = sc.next();
        
        if (a.equals(b)) {
            System.out.print("¹«½ÂºÎ");
        }
        else if(a.equals("s") && b.equals("p") || a.equals("r") && b.equals("s") || a.equals("p") && b.equals("r")){
            System.out.print("Ã¶¼ö, ½Â!");
        }
        else if(b.equals("s")&&a.equals("p") || b.equals("r")&&a.equals("s") || b.equals("p")&&a.equals("r")){
            System.out.print("¿µÈñ, ½Â!");
        }
    }
}


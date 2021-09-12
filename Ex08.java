package _9_6;

public class Ex08 {
	public static void main(String[] args) {
		int a, b, c;
		for (a = 1; a <= 20; a++) {
			for (b = 1; b <= 20; b++) {
				for (c = 1; c <= 20; c++) {
					if(a+b+c<=20) {
						if (a * a + b * b == c * c) {
							System.out.println(a + "," + b + "," + c);
						}
					}
				}
			}
		}
	}
}

package Exception;

class Error extends RuntimeException{}

public class Except {
	public static void main(String[] args) {
		
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("���� �߻�");
		}
		try {
			throw new Error();
		}catch (Error e) {
			System.out.println("Error ���� �߻�");
		}
		
	}
}

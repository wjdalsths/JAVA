package Exception;

public class CheckedDemo extends Thread{
	public static void main(String[] args) /* throws InterruptedException */ {
//		Thread.sleep(100);

		try {
		    Thread.sleep(4000);
		  } catch (InterruptedException e) {
		    // ���ͷ�Ʈ ���ߴ� (�޼��� ��� �ߴ��ϰ� �ٷ� ��ȯ)
			  System.out.println("interrupt");
		    return;
		  }
//		System.out.println("ttt");
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("ttt");
	}
}

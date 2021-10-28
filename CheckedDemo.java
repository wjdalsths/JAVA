package Exception;

public class CheckedDemo extends Thread{
	public static void main(String[] args) /* throws InterruptedException */ {
//		Thread.sleep(100);

		try {
		    Thread.sleep(4000);
		  } catch (InterruptedException e) {
		    // 인터럽트 당했다 (메세지 출력 중단하고 바로 반환)
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

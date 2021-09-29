
class Tv {
	String na;
	int ye, i;

	public Tv(String na, int ye, int i) {
		this.na = na;
		this.ye = ye;
		this.i = i;
	}

	public void show() {
		System.out.println(na + "에서 만든 " + ye + "년도 " + i + "인치형 TV");
	}
}

public class TvTest {
	public static void main(String[] args) {
		Tv mytv = new Tv("LG", 2021, 70);
		mytv.show();
	}
}

package Java정복;

class Miner {
	String name;
	int coins;

	public  Miner(String name) {
		this.name = name;
	}

	public void mine(int n) {
		this.coins = n;
	}

	public void print() {
		System.out.println("이름: " + name + ", coins: " + coins);
	}
}

public class MinerTest {
	

	public static void main(String[] args) {
		Miner mi=new Miner("말런");
		mi.mine(3);
		mi.print();
		
		
	}
}

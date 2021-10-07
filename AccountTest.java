package Java¡§∫π;

class Account {

	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.setAno(ano);
		this.setOwner(owner);
		this.setBalance(balance);
	}

	public void transfer(Account target,int amount) {
		if(balance<amount) 
			System.out.println("¿‹æ◊¿Ã ∫Œ¡∑«’¥œ¥Ÿ.");
		else {
			balance-=amount;
			target.balance+=amount;
		}	
	}

	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

public class AccountTest {
	public static void main(String[] args) {
		Account a = new Account("123-45","√∂ºˆ",10000);
		Account b= new Account("567-89","πŒºˆ",10000);
		
		System.out.println(a.getAno() +" "+ a.getOwner() +" "+ a.getBalance());
		System.out.println(b.getAno() +" "+ b.getOwner() +" "+ b.getBalance());

		System.out.println("∞Ë¡¬ º€±› »ƒ");
		a.transfer(b, 3000);
		System.out.println(a.getAno() +" "+ a.getOwner() +" "+ a.getBalance());
		System.out.println(b.getAno() +" "+ b.getOwner() +" "+ b.getBalance());
		
	}
}

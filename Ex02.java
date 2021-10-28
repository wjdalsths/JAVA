package Chap07;

interface Pay{
	public void payment();
	
}
class CardPay implements Pay{
	public void payment() {
		System.out.println("카드");
	}
}
class CashPay implements Pay{
	public void payment() {
		System.out.println("현금");
	}
}
class PaymentService{
	Pay pay;
	private final String Credit_card="카드결제";
	private final String Cash ="현금결제";
	
	public void process(String op) {
		if (op.equals(Credit_card)) {
			pay=new CardPay();
		}
		else if(op.equals(Cash)) {
			pay=new CashPay();
		}
		pay.payment();
	}
}
public class Ex02 {
	public static void main(String[] args) {
		PaymentService a=new PaymentService();
		a.process("카드결제");
		a.process("현금결제");
	}
}

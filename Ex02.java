package Chap07;

interface Pay{
	public void payment();
	
}
class CardPay implements Pay{
	public void payment() {
		System.out.println("ī��");
	}
}
class CashPay implements Pay{
	public void payment() {
		System.out.println("����");
	}
}
class PaymentService{
	Pay pay;
	private final String Credit_card="ī�����";
	private final String Cash ="���ݰ���";
	
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
		a.process("ī�����");
		a.process("���ݰ���");
	}
}

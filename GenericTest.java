package Exception;

class MadPlay<T>{
	private T vale; //�ɹ� ���� vale�� Ÿ���� T�̴�.
	
	public T getVal() {
		//T Ÿ���� �� vale�� ��ȯ�ϴ�.
		return vale;
	}
	public void setVal(T vale) {
		//T Ÿ���� ���� ��� ���� Vale�� �����Ѵ�
		this.vale=vale;
	}
}
public class GenericTest {
	public static void main(String[] args) {
		MadPlay<String> mp=new MadPlay<>();
	}
}

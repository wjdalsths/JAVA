package Chap10;

interface Box3<T> {
	void addItem(T item, int index);
}
class Item2<T> implements Box3<T>{
	private final T[] array;
	
	public Item2() {
		array = (T[]) new Object[4];
	}
	
	@Override
	public void addItem(T item,int index) {
		array[index] = item;
	}
	
	void Print(int index) {
		System.out.println(array[index]);
	}
}
public class GenericTestProblem {
	public static void main(String[] args) {
		Item2<Integer> n=new Item2<>();
		n.addItem(1234,0);
		n.Print(0);
	}
}

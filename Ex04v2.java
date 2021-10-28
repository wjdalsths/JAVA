package Chap07;

//����� �������̽�
interface Wearable {
 void putOn();   // �Ա�
 void putOff();  // ����
}

//��ĥ �������̽�
interface Colorable {
 int RED = 1;    // ����
 int GREEN = 2;  // �ʷ�
 int BLUE = 3;   // �Ķ�
 void change(int color); // ������
}


class WearableRobot implements Wearable, Colorable {
	 private int color;  // ��
	 WearableRobot(int color) {changeColor(color);}
	 
	 public void changeColor(int color) {this.color=color;}
	 public String toString () {
	    switch (color) {
	    	case RED : return "���� �κ�";
	        case GREEN : return "�ʷ� �κ�";
	        case BLUE : return "�Ķ� �κ�";
	     }
	     return "�κ�";
	 }
	 public void putOn() {
	     System.out.println(toString()+" ����!!");
	 }
	 public void putOff() {
	     System.out.println(toString()+" ����!!");
	 }
	 
	 @Override
	 public void change(int color) {
		 
	 }
}
public class Ex04v2{
	public static void main(String[] args) {
		WearableRobot r=new WearableRobot(1);
		r.putOn();
		r.putOff();
	}
			
	
}

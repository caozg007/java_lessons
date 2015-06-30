package ��3����_�κ���ϰ;

public class A_05 {

	public static void main(String [] args){
		
		LargeInt largeInt = new LargeInt(1);
		largeInt.printValue(); // ���1
		largeInt.add(9);
		largeInt.printValue(); // ���10
		for(int i=0; i<100; i++){
			largeInt.mul(10); 
		}
		largeInt.printValue(); // ���100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
		
		largeInt = new LargeInt(1);
		for(int i=1; i<=40; i++){
			largeInt.mul(i);
		}
		largeInt.printValue(); // ���40!��Ӧ��ֵ
	}
}

class LargeInt {

	private static int lengthOfNode = 1; // >=1

	private static int MAX;
	{
		MAX = 1;
		for(int i=0; i<lengthOfNode; i++){
			MAX *= 10;
		}
	}

	private int data = 0;
	private LargeInt next = null;

	public LargeInt() {

	}

	public LargeInt(int data) {
		if (data < 0) {
			System.out.println("cannot support negative value");
			return;
		}
		this.data = data;
		format();
	}
	
	public void add(int num){
		if(num < 0){
			System.out.println("cannot support negative value");
			return;
		}
		data += num;
		format();
	}

	public void mul(int num){
		if(num < 0){
			System.out.println("cannot support negative value");
			return;
		}
		LargeInt temp = this;
		while(temp != null){
			temp.data *= num;
			temp = temp.next;
		}
		format();
	}
	
	public void printValue() {
		String value = "";
		LargeInt temp = this;
		while(temp.next != null){
			value = addZero("" + temp.data, lengthOfNode) + value;
			temp = temp.next;
		}
		value = temp.data + value;
		System.out.println(value);
	}
	
	// ���������Ҫ��д�������ǲ���0������˵һ���ڵ������ʾ3λ����ô�������ڵ��ֵ��21����ô��ʾΪ021
	private String addZero(String str, int n) {
		while (str.length() < n) {
			str = "0" + str;
		}
		return str;
	}

	// ��λ������˵���������������ݷֲ���24->31>1����ô���д˷�����ͱ���ˣ�4->3->4
	private void format() {

		int value = 0;
		LargeInt temp = this;
		while (temp.next != null) {
			temp.data += value;
			value = temp.data / MAX;
			temp.data %= MAX;
			temp = temp.next;
		}
		temp.data += value;
		value = temp.data / MAX;
		temp.data %= MAX;
		if(value > 0){
			temp.next = new LargeInt(value);
		}
	}
	
	// ���������Ҫ��д�����Ĺ����Ƿ����ܽڵ����
	public int length(){
		int length = 0;
		LargeInt temp = this;
		while(temp != null){
			length++;
			temp = temp.next;
		}
		return length;
	}
}

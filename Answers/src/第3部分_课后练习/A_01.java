package ��3����_�κ���ϰ;

public class A_01 {
	static public void main(String[] args) {
		int a = 1;
		int b = 2;

		System.out.println("main: a=" + a + ", b=" + b);
		swap(a, b);
		System.out.println("main: a=" + a + ", b=" + b);
	}

	static public void swap(int a, int b) {
		System.out.println("swap: a=" + a + ", b=" + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("swap: a=" + a + ", b=" + b);
	}
}

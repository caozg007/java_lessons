package ��3����_�κ���ϰ;

public class A_03 {
	static public void main(String[] args) {
		printAlphabet();
	}

	static public void printAlphabet() {
		printAlphabet('a');
	}

	static public void printAlphabet(char c) {
		if (c < 'a' || c > 'z') {
			return;
		}
		System.out.println(c);
		printAlphabet(++c);
	}
}

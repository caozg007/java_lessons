package ��1����_�κ���ϰ;

import java.util.Scanner;

/**
 * ����һ������Ϊ3�ַ������ַ����е��ַ�ȫ�����֣��磺"123"��ע�ⲻ�����������������ַ�������
 * �ڳ����������ַ���ת��������������Ҫ���Խ��Ȼ�������
 * ��ʾ��ȡһ���ַ����ĵ�i���ַ���char c = s.charAt(i);
 * �磺String s = scanner.nextLine(); // ��ʱs=123
 * 	int a = 0;
 * 	.... // ����һЩ����֮��
 * 	System.out.println(a); // ��ʱa=123
 *
 * @author LiuDelin
 */
public class A_14 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input an integer:");
		String str = scanner.nextLine();
		char a = str.charAt(0);
		char b = str.charAt(1);
		char c = str.charAt(2);
		int result = 100*(a-'0') + 10*(b-'0') + (c-'0');
		System.out.println(result);
		
		scanner.close();
	}
}

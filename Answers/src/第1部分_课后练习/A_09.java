package ��1����_�κ���ϰ;

import java.util.Scanner;

/**
 * ����һ���ַ�����һ��������һ��˫���ȸ��������������������á�+�����������������Ļ�ϡ�
 *
 * @author LiuDelin
 */
public class A_09 {
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a string:");
		String string_type = scanner.nextLine();
		System.out.print("Input an integer:");
		int int_type = scanner.nextInt();
		System.out.print("Input a double type number:");
		double double_type = scanner.nextDouble();
		
		System.out.println(string_type + int_type + double_type);
		scanner.close();
	}
}

package ��1����;

import java.util.Scanner;

/**
 * ��д��������һ��������Ȼ���������������һ����������Ȼ�������������һ���ַ�����Ȼ���������
 *
 * @author LiuDelin
 */
public class A_08_2 {

	public static void main(String [] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input an integer:");
		int int_type = scanner.nextInt();
		System.out.println("int_type:" + int_type);
		
		System.out.print("Input a double type number:");
		double double_type = scanner.nextDouble();
		System.out.println("double_type:" + double_type);
		
		System.out.print("Input a string:");
		scanner.nextLine(); // nextInt()��nextDouble()��Щ�����ǲ�������еĻ��з�����ģ����Ե������ĵ���һ�����з�
		String string_type = scanner.nextLine();
		System.out.println("string_type:" + string_type);
		
		scanner.close();
	}
}

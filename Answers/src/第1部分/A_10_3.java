package ��1����;

import java.util.Scanner;

/**
 * ��д��������һ������������ǿ��ת���ַ���Ȼ�������
 *
 * @author LiuDelin
 */
public class A_10_3 {

public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int int_type = scanner.nextInt();
		char char_type = (char) int_type;
		System.out.println("the char format of integer " + int_type + " is " + char_type);
		
		scanner.close();
	}
}

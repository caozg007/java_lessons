package ��1����;

import java.util.Scanner;

/**
 * ��д��������һ��������������ǿ��ת��������Ȼ�������
 *
 * @author LiuDelin
 */
public class A_10_1 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a float type number:");
		float float_type = scanner.nextFloat();
		int int_type = (int)float_type;
		System.out.println("float number " + float_type + " casting to int is " + int_type);
		
		scanner.close();
	}
}

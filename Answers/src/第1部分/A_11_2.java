package ��1����;

import java.util.Scanner;

/**
 * ��д�����������������������һ�������ڵڶ����������true���������false��
 *
 * @author LiuDelin
 */
public class A_11_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		boolean greater = a>b ? true:false;
		System.out.println(a + ">" + b + " is " + greater);
		
		scanner.close();
	}
}

package ��1����;

import java.util.Scanner;

/**
 * ��д�����������������������һ�������ڵڶ����������"A>B"���������"A<=B"
 *
 * @author LiuDelin
 */
public class A_11_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		String greater = a>b ? "A>B":"A<=B";
		System.out.println(greater);
		
		scanner.close();
	}
}

package ��1����;

import java.util.Scanner;

/**
 * ��д���������������������������������0�����true���������false��
 *
 * @author LiuDelin
 */
public class A_11_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		boolean greater = a > 0 && b > 0 ? true : false;
		System.out.println(greater);

		scanner.close();
	}
}

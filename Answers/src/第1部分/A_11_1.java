package ��1����;

import java.util.Scanner;

/**
 * ��д�������������������ڶ�����������һ��������������̵��������ֺ�������
 *
 * @author LiuDelin
 */
public class A_11_1 {

public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		System.out.println(a + "/" + b + "=" + a/b + "..." + a%b);
		
		scanner.close();
	}
}

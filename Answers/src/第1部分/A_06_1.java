package ��1����;

import java.util.Scanner;
/**
 * ��д��������3�������������3�������ĺ͡�
 *
 * @author LiuDelin
 */
public class A_06_1 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		int result = 0;

		System.out.print("Input an integer:");
		result += scanner.nextInt();
		System.out.print("Input an integer:");
		result += scanner.nextInt();
		System.out.print("Input an integer:");
		result += scanner.nextInt();
		
		System.out.println(result);
		scanner.close();
	}
}

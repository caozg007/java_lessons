package ��2����;

import java.util.Scanner;

/**
 * ��д��������һ������n�����n�Ľ׳ˡ���n<=10��
 *
 * @author LiuDelin
 */
public class A_02_4 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int n = scanner.nextInt();
		scanner.close();
		
		int result = 1;
		for(int i=1; i<=n; i++){
			result *= i;
		}
		System.out.println(result);
	}
}

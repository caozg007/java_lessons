package ��1����_�κ���ϰ;

import java.util.Scanner;

/**
 * ���������������ж�������������ֵ�Ƿ��ܹ���Ϊһ�������εı�ɡ�
 * ������ܹ��������Σ���������ܹ��������Ρ�������ܹ��������Σ���������ε��ܳ���
 *
 * @author LiuDelin
 */
public class A_10 {
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		System.out.print("Input an integer:");
		int c = scanner.nextInt();

		scanner.close();
		
		boolean isTriangle = true;
		isTriangle = (a<=0 || b<=0 || c<=0) ? false : isTriangle;
		isTriangle = (a+b<=c) || (a+c<=b) || (b+c<=a) ? false : isTriangle;
		String result = isTriangle ? "" + (a+b+c) : "cannot build a triangle";
		System.out.println(result);
		
	}
}

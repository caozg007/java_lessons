package ��1����;

import java.util.Scanner;

/**
 * ��д���������������������մ�С�����˳���������
 *
 * @author LiuDelin
 */
public class A_14_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		System.out.print("Input an integer:");
		int c = scanner.nextInt();

		int max = a;
		int mid = b;
		int min = c;
		if(max < mid){
			int t = max;
			max = mid;
			mid = t;
		}
		if(max < min){
			int t = max;
			max = min;
			min = t;
		}
		if(mid < min){
			int t = mid;
			mid = min;
			min = t;
		}
		
		System.out.println("the result of sorting (" + a + "," + b + "," + c + ") is (" + min + "," + mid + "," + max + ")");
		scanner.close();
	}
}

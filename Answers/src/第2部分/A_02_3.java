package ��2����;

import java.util.Scanner;

/**
 * ��д��������һ��������n����ӡ���������Ƶ�ͼ����n=3����
 *     *
 *    ***
 *   *****
 *    ***
 *     *
 *
 * @author LiuDelin
 */
public class A_02_3 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				System.out.print(' ');
			}
			for(int j=0; j<i*2+1; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=n-2; i>=0; i--){
			for(int j=0; j<n-i-1; j++){
				System.out.print(' ');
			}
			for(int j=0; j<i*2+1; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

package ��2����_�κ���ϰ;

import java.util.Scanner;

/**
 * ��д������������������m��n������һ����ά����arr[m][n]����ʼ����Ϊarr[i][j]=i+j��Ȼ���ӡ��������ά���飬�磨m=2��n=3����
 * 0 1 2
 * 1 2 3
 *
 * @author LiuDelin
 */
public class A_03 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int m = scanner.nextInt();
		System.out.print("Input an integer:");
		int n = scanner.nextInt();
		scanner.close();
		
		int arr[][] = new int[m][];
		for(int i=0; i<m; i++){
			arr[i] = new int[n];
			for(int j=0; j<n; j++){
				arr[i][j] = i+j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

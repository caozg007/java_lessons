package ��2����_�κ���ϰ;

import java.util.Scanner;

/**
 * ��д��������������������������ǵ����Լ������С������
 *
 * @author LiuDelin
 */
public class A_04 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int m = scanner.nextInt();
		System.out.print("Input an integer:");
		int n = scanner.nextInt();
		scanner.close();
		
		int common_divisor = 1;
		for(int i=1; i<=m && i<=n; i++){
			if(m%i==0 && n%i==0){
				common_divisor = i;
			}
		}
		int common_multiple = m/common_divisor*n;
		System.out.println(common_divisor);
		System.out.println(common_multiple);
	}
}

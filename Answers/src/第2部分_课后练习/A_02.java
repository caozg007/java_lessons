package ��2����_�κ���ϰ;

import java.util.Scanner;

/**
 * ����һ���ַ�����ʵ�ַ��������
 *
 * @author LiuDelin
 */
public class A_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		for(int i=line.length()-1; i>=0; i--){
			System.out.print(line.charAt(i));
		}
	}

}

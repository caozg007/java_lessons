package ��2����_�κ���ϰ;

import java.util.Scanner;

/**
 * ����һ���ַ����������䳤�ȣ��������Ϊ����������м��ַ������������ʾ��
 * ��ʾ��ʹ��str.charAt(i)�ܹ�����ַ���str��i�����ַ�
 * ʹ��str.length()�ܻ���ַ����ĳ���
 *
 * @author LiuDelin
 */
public class A_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		if(line.length()%2 == 0){
			System.out.println("length=" + line.length());
		}else{
			System.out.println(line.charAt(line.length()/2));
		}
	}

}

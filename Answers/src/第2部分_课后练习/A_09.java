package ��2����_�κ���ϰ;

import java.util.Scanner;

/**
 * ����һ��Ӣ�ģ���������䵥�ʡ��������룺This is a fantasy story about ghost
 * �����ghost about story fantasy a is This
 *
 * @author LiuDelin
 */
public class A_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		String result = "";
		String word = "";
		for(int i=0; i<line.length(); i++){
			if(line.charAt(i) == ' '){
				result = ' ' + word + result;
				word = "";
			}else{
				word += line.charAt(i);
			}
		}
		result = word + result;
		System.out.println(result);
	}

}

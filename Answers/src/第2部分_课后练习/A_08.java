package ��2����_�κ���ϰ;

import java.util.Scanner;

/**
 * ��д��������һ��Ӣ�����֣�ֻ������ĸ�Ϳո񣬵��ǿ����������Ŀո�ͷβҲ�����пո񣩣�Ȼ���жϵ��ʳ��ֵĸ������������룺abc  def ghi��
 * �����3
 *
 * @author LiuDelin
 */
public class A_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		int words = 0;
		line = line + " "; // ΪʲôҪ������ո��أ�
		for(int i=1; i<line.length(); i++){
			if(line.charAt(i) == ' ' && line.charAt(i-1) != ' '){
				words += 1;
			}
		}
		System.out.println(words);
	}

}

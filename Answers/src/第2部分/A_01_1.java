package ��2����;

import java.util.Scanner;

/**
 * ��д���򣬿��Ե�������������ģ�AΪ9��10��BΪ8��CΪ7��DΪ6��FΪ0~5��
 * ����һ��������ʹ��switch��䣬������Ӧ�ķֶδ�ӡ������������ֶβ���0~10֮�䣬���"Unknown"
 *
 * @author LiuDelin
 */
public class A_01_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int score = scanner.nextInt();
		scanner.close();

		switch (score) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("F");
			break;
		case 6:
			System.out.println("D");
			break;
		case 7:
			System.out.println("C");
			break;
		case 8:
			System.out.println("B");
		case 9:
		case 10:
			System.out.println("A");
			break;
		default:
			System.out.println("Unknown");
		}
	}
}

package ��4����_�κ���ϰ;

import java.util.Scanner;

/**
 * ��1�����еĿκ���ϰ��10�⣬���������������������ʱ��ᷢ��ʲô���޸ĳ��򣬽����쳣����
 * ����������������������ô��ʾ"You can only input integers."��Ȼ���������룬ֱ������3������Ϊֹ��
 *
 * @author LiuDelin
 */
public class A_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		while (true) {
			try {
				System.out.print("Input an integer:");
				a = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("You can only input integers.");
			}
		}
		while (true) {
			try {
				System.out.print("Input an integer:");
				b = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("You can only input integers.");
			}
		}
		while (true) {
			try {
				System.out.print("Input an integer:");
				c = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("You can only input integers.");
			}
		}
		scanner.close();

		boolean isTriangle = true;
		isTriangle = (a <= 0 || b <= 0 || c <= 0) ? false : isTriangle;
		isTriangle = (a + b <= c) || (a + c <= b) || (b + c <= a) ? false
				: isTriangle;
		String result = isTriangle ? "" + (a + b + c)
				: "cannot build a triangle";
		System.out.println(result);

	}

}

package ��1����_�κ���ϰ;

/**
 * ˵�����ʽ��ֵ��x+a%3*(int)(x+y)%2/4����double x=2.5; int a=7; double y=4.7��Ȼ���ó�������֤��
 *
 * @author LiuDelin
 */
public class A_07 {

	public static void main(String[] args) {

		double x = 2.5;
		int a = 7;
		double y = 4.7;

		double result = x + a % 3 * (int) (x + y) % 2 / 4;

		// �������ʽ�ǰ�������������ŵ�˳��ִ�е�
		// �����Ǽ���(x+y)Ϊ7.2�����ʽ��Ϊ result = x + a % 3 * (int) 7.2 % 2 / 4;
		// Ȼ�����(int)7.2Ϊ7�����ʽ��Ϊ result = x + a % 3 * 7 % 2 / 4;
		// Ȼ�����a%3Ϊ1�����ʽ��Ϊresult = x + 1 * 7 % 2 / 4;
		// Ȼ�����1*7Ϊ7�����ʽ��Ϊresult = x + 7 % 2 / 4;
		// Ȼ�����7%2Ϊ1�����ʽ��Ϊresult = x + 1 / 4;
		// Ȼ�����1/4Ϊ0�����ʽ��Ϊresult = x + 0;
		// ������x+0Ϊ2.5
		double result2 = x + (((a % 3) * ((int) (x + y))) % 2) / 4;

		System.out.println(result);
		System.out.println(result2);
	}
}

package ��2����_�κ���ϰ;

/**
 * ��д�����������ˮ�ɻ�������νˮ�ɻ�����ָһ����λ�������λ���������͵��ڸ����������磬153=1^3+5^3+3^3
 *
 * @author LiuDelin
 */
public class A_11 {

	public static void main(String[] args) {

		for (int i = 100; i < 999; i++) {
			int left = i / 100;
			int mid = i % 100 / 10;
			int right = i % 10;
			if (i == left * left * left + mid * mid * mid + right * right
					* right) {
				System.out.println(i);
			}
		}
	}

}

package ��3����;

/**
 * ��д���򣬱�дһ������������һ���������飬����������������ֵ�ĺ͡�
 *
 * @author LiuDelin
 */
public class A_01_1 {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 3, 6, 1 };
		System.out.println(sum(arr));
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

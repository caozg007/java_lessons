package ��1����;

/**
 * ��д���򣬶���һ����ά�������飨2*3)����һ��λ�ø�ֵΪ0��Ȼ��ÿ��λ�ø�ֵ����1��������ǡ�
 *
 * @author LiuDelin
 */
public class A_13_2 {

	public static void main(String [] args){
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
		System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
	}
}

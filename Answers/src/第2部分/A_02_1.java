package ��2����;

/**
 * ��д���򣬴�ӡ��1~500֮����ͬʱ��2,5,7��������
 *
 * @author LiuDelin
 */
public class A_02_1 {

	public static void main(String[] args) {

		int range = 500;
		int nums[] = new int[] { 2, 5, 7 };
		outer: for(int i=1; i<=range; i++){
			for(int j=0; j<nums.length; j++){
				if(i%nums[j] != 0){
					continue outer;
				}
			}
			System.out.println(i);
		}
	}
}

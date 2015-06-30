package ��3����;

/**
 * ��д���򣬱�дһ������������1~n��Χ�ڵ�����������������Ϊn������һ�����飩
 *
 * @author LiuDelin
 */
public class A_01_3 {

	public static void main(String [] args){
		
		int n = 1000;
		int arr[] = primes(n);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static int[] primes(int n){
		int[] large_arr = new int[n];
		int length = 0;
		outer: for(int i=2; i<=n; i++){
			for(int j=2; j<i; j++){
				if(i%j == 0){
					continue outer;
				}
			}
			large_arr[length++] = i;
		}
		
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++){
			arr[i] = large_arr[i];
		}
		return arr;
	}
}

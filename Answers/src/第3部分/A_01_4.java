package ��3����;

/**
 * ��д����
 * 	��дһ����������ӡһ�����������ֵ���ÿո�ָ��
 * 	��дһ������������һ���������飬����������ֵ��С��������
 * 	��main�����ж���һ������Ϊ10���������飬������1~100�е�ֵ�����ʼ������
 * 	Ȼ����ô�ӡ���������ֵ�ķ������ٵ������򷽷����ڵ��ô�ӡ������
 * 	��ʾ1��Math.random()���Ի��һ�������0~1�ĸ���������ô�������1~100�����������
 * 	��ʾ2�������������һ�δ����ܹ���arr[0]��arr[1]��ֵ������
 * 		if(arr[0] < arr[1]){
 * 			int t = arr[0];
 * 			arr[0] = arr[1];
 * 			arr[1] = t;
 * 		}
 *
 * @author LiuDelin
 */
public class A_01_4 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random() * 100);
		}
		printArr(arr);
		sortArr(arr);
		printArr(arr);
	}
	
	public static void printArr(int [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void sortArr(int [] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i] > arr[j]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
}

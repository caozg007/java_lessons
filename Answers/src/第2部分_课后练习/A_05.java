package ��2����_�κ���ϰ;

/**
 * ��д����һ�������ǡ�õ��������������ӣ��������Լ���֮�ͣ�������ͳ�Ϊ��������ӡ��1000֮��������������28=1+2+4+7+14��1��������
 *
 * @author LiuDelin
 */
public class A_05 {

	public static void main(String[] args) {

		int range = 1000;
		
		// ��Ϊ1��������������ֱ�Ӵ�2��ʼ
		for(int i=2; i<=range; i++){
			
			int num = i;
			int sum = 1; // �κ�������1������ӣ����Գ�ʼ��Ϊ1
			String info = "1";
			for(int j=2; j<num; j++){
				if(num%j == 0){
					sum += j;
					info += "+" + j;
				}
			}
			if(sum == num){
				System.out.println(i + "=" + info);
			}
		}
	}

}

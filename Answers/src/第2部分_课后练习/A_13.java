package ��2����_�κ���ϰ;

/**
 * ��д���򣬼������漸�����֣�X1��X2��X3����ֵ������ӡ�����Լ�����ѭ����ֹ����������������1000�Σ�
 * 2/X1=(sqrt(2)/2)*(sqrt(2+sqrt(2))/2)*(sqrt(2+sqrt(2+sqrt(2)))/2)*...
 * X2/2=(2/1)*(2/3)*(4/3)*(4/5)*(6/5)*(6/7)*(8/7)*(8/9)*...
 * X3*X3/6=1/(1*1)+1/(2*2)+1/(3*3)+...
 * ��ʾ��sqrt(2)�Ǹ���2����˼����Java����Math.sqrt(2)�����������ֵ��
 *
 * @author LiuDelin
 */
public class A_13 {

	public static void main(String [] args){
		
		int loop = 1000;
		
		double right1 = 1;
		double item = Math.sqrt(2);
		for(int i=1; i<loop; i++){
			right1 *= item/2;
			item = Math.sqrt(2 + item);
		}
		double X1 = 2/right1;
		System.out.println("X1=" + X1);
		
		double right2 = 1;
		for(int i=1; i<loop; i++){
			if(i%2 == 1){ // ������
				item = (i+1.0)/i;
			}else{ // ż����
				item = i/(i+1.0);
			}
			right2 *= item;
		}
		double X2 = 2*right2;
		System.out.println("X2=" + X2);
		
		double right3 = 0;
		for(int i=1; i<loop; i++){
			item = 1.0/i/i;
			right3 += item;
		}
		double X3 = Math.sqrt(right3*6);
		System.out.println("X3=" + X3);
	}
}

package ��1����_�κ���ϰ;

/**
 * �²���ʽ��ֵ��a+++a--*++b����int a=3, b=4��Ȼ���ó�����֤��
 *
 * @author LiuDelin
 */
public class A_08 {

	public static void main(String [] args){
		
		int a = 3;
		int b = 4;
		int result = a+++a--*++b;

		a = 3;
		b = 4;
		// ���ȼ���a++Ϊ3���˺�a�����4�����ʽ��Ϊresult = 3+a--*++b;
		// �ټ���a--Ϊ4���˺�a�����3�����ʽ��Ϊresult = 3+4*++b;
		// �ټ���++bΪ5���˺�b�����5�����ʽ��Ϊresult = 3+4*5;
		int result2 = a++ + (a-- * ++b);
		System.out.println(result);
		System.out.println(result2);
	}
}

package ��3����;

/**
 * ��д�����޸�Square�࣬Ϊ������������췽����Square()��Square(int length)�����û�в�����
 * 	��ֵlength=1������в�����ֵlengthΪ��Ӧ��ֵ��
 * 	�����ֳ�ʼ�������ֱ��ʼ��һ��Square����Ȼ��������ǵ������
 *
 *	�޸ĺ��Square��Square2��ʾ
 * @author LiuDelin
 */
public class A_02_2 {

	public static void main(String[] args){
		Square2 s1 = new Square2();
		Square2 s2 = new Square2(10);
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
	}
}

class Square2{
	
	double length;
	
	Square2(){
		length = 1;
	}
	
	Square2(int length){
		this.length = length;
	}
	
	double getArea(){
		return length*length;
	}
}
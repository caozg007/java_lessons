package ��3����;

/**
 * ��д���򣬱�дһ����Square�������Σ�������һ����Ա����length����һ����ȡ����ķ���getArea��
 * ��ʼ��һ��Square������������length=10��Ȼ��������������
 *
 * @author LiuDelin
 */
public class A_02_1 {

	public static void main(String[] args) {
		Square square = new Square();
		square.length = 10;
		System.out.println(square.getArea());
	}

}

class Square {
	double length;

	double getArea() {
		return length * length;
	}
}

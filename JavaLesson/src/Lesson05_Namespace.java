/**
 * ���������÷�Χ���������������ڣ�
 * 
 * @author LiuDelin
 */
public class Lesson05_Namespace {
	public static void main(String[] args) {
		/* main������ʼ */

		int a = 10;
		System.out.println("a=" + a);

		outer: {
			/* outer������ʼ */

			System.out.println("a=" + a);
			int b = 20;
			System.out.println("b=" + b);

			inner: {
				/* inner������ʼ */

				System.out.println("a=" + a);
				System.out.println("b=" + b);
				int c = 30;
				System.out.println("c=" + c);

				/* inner��������� */
			}
			System.out.println("b=" + b);
			// System.out.println("c=" + c); // Error���޷����ʵ�����c���������÷�Χ��������

			/* outer��������� */
		}

		// System.out.println(b); // Error!�޷����ʵ�����b���������÷�Χ��������

		/* main��������� */
	}
}

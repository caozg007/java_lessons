/**
 * ѭ�����
 *
 * @author LiuDelin
 */
public class Lesson13_Loop {

	public static void main(String[] args) {

		/* forѭ�� */

		// ������ʽ
		for (int i = 0; i < 3; i++) {
			System.out.println("i=" + i);
		}

		System.out.println("----------------1------------------");

		// ����ʡ�Խ�β����
		for (int i = 0; i < 3; /* ������Բ�д��� */) {
			System.out.println("i=" + i);
			i++; // �ǵ���������Ȼ����ѭ����
		}

		System.out.println("----------------2------------------");

		// ����������
		for (int i = 0, j = 0; i < 5 && j < 100; i++, j += 10) {
			System.out.println("i=" + i + ", j=" + j);
		}

		System.out.println("----------------3------------------");

		// ����ѭ���ж������
		int i = 0;
		for (; i < 3; i++) {
			System.out.println("i=" + i);
		}

		System.out.println("----------------4------------------");

		// ʡ������ѭ���ж����
		for (i = 0;; i++) {
			System.out.println("i=" + i);
			if (i >= 3) {
				break; // break�Ĺ���������ѭ��
			}
		}

		System.out.println("----------------5------------------");

		// ȫʡ��
		i = 0;
		for (;;) {
			System.out.println("i=" + i);
			i++;
			if (i >= 3) {
				break;
			}
		}

		System.out.println("----------------6------------------");

		for (i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("i=" + i);
		}

		System.out.println("----------------7------------------");

		/* whileѭ�� */

		i = 0;
		while (i < 4) {
			System.out.println("i=" + i);
			i++;
		}

		System.out.println("----------------8------------------");

		i = 0;
		while (true) {
			System.out.println("i=" + i);
			i++;
			if (i >= 4) {
				break;
			}
		}

		System.out.println("----------------9------------------");

		i = 0;
		while (i < 4) {
			if (i == 2) {
				i++;
				continue;
			}
			System.out.println("i=" + i);
			i++;
		}
		
		System.out.println("----------------10------------------");

		/* do-whileѭ�� */

		// ������ʽ�õú��٣��Ͳ���ϸ������
		i = 0;
		do {
			System.out.println("i=" + i);
			i++;
		} while (i < 4);
	}
}

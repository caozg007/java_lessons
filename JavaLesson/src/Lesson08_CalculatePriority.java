/**
 * �������ȼ�
 *
 * @author LiuDelin
 */
public class Lesson08_CalculatePriority {

	public static void main(String[] args) {

		int a = 10 + 2 * 5; // */�����ȼ�����+-
		System.out.println(a);

		a = (10 + 2) * 5;
		System.out.println(a);

		boolean b = true || false && !true; // !�����ȼ�����&&��&&�����ȼ�����||
		System.out.println(b);

		b = (true || false) && !true;
		System.out.println(b);

		/* ���ȼ����Ӹߵ������У�����ϸ�ı�����鱾 */
		/* (����++������--)��(ǰ��++��ǰ��--��!)��(*��/��%)��(+��-)��(>��>=��<��<=)��(==��!=)��(&&��||)��(=) */

		/* �ǲ�ס���ȼ���ʱ�򣬼ǵ�ʹ������ */
	}
}

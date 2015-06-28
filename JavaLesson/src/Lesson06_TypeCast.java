/**
 * ����ת��
 * 
 * @author LiuDelin
 */
public class Lesson06_TypeCast {

	public static void main(String[] args) {

		/** ������ǿ������ת���� **/
		short short_type = 10;
		int int_type = 1000000;
		long long_type = 100000000000000L;

		System.out.println("short:" + short_type);
		System.out.println("short->int:" + (int) short_type); // ����ת��
		System.out.println("short->long:" + (long) short_type); // ����ת��
		System.out.println();

		System.out.println("int->short:" + (short) int_type); // ����ת��
		System.out.println("int:" + int_type);
		System.out.println("int->long:" + (long) int_type); // ����ת��
		System.out.println();

		System.out.println("long->short:" + (short) long_type); // ����ת��
		System.out.println("long->short:" + (int) long_type); // ����ת��
		System.out.println("long:" + long_type);
		System.out.println();
		/* ����ת����Ҫע�⾫����ʧ */

		float float_type = 1.5F;
		double double_type = 1.5;
		System.out.println("float->int:" + (int) float_type); // ����ת��
		System.out.println("double->int:" + (int) double_type); // ����ת��
		/* ������ת������ֻȡ�������� */

		boolean bool_type = true;
		// System.out.println("bool->int:" + (int)boolean); //
		// Error!boolean�����������������ͻ���ת��

		/** ������Ĭ������ת�� **/

		int_type = short_type; // Ĭ������ת����short->int��
		// short_type = int_type; // Error!��֧��Ĭ������ת��

		double_type = float_type;
		// float_type = double_type; // Error!��֧��Ĭ������ת��

		float_type = long_type;
		// long_type = float_type; // Error!��֧��Ĭ������ת��

		/** ���������泣�������� **/

		// ����������int��
		int_type = 1000000000;
		// short_type = 1000000000; // Error!int->short��֧��Ĭ��ת��
		long_type = 1000000000; // int->long

		// �����������L��long��
		// int_type = 1L; // Error!long->int��֧��Ĭ��ת��
		long_type = 1L;

		// С��������double��
		// float_type = 1.0; // Error!double->float��֧��Ĭ��ת��
		double_type = 1.0;

		// С���������F��float��
		float_type = 1.0F;
		double_type = 1.0F; // float->double

		/* ע�⣺��Ĭ��ת�Ͳ��ɹ���ʱ����Ҫʹ��ǿ��ת�� */
		
		/* char��byte���͵�ʵ����ʵ������ */
		char char_type = 'a';
		byte byte_type = 10;
		int_type = char_type;
		int_type = byte_type;
	}
}

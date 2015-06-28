/**
 * ������������
 * 
 * @author LiuDelin
 */
public class Lesson04_BaseDataType {

	public static void main(String[] args) {

		// �����������ͣ�ֻ������ֵ��true, false
		boolean bool_type = true;
		bool_type = false;
		System.out.println("bool_type��" + bool_type);

		// �ֽ����͡�1��byte����Ϊ8��bit������ֻ�ܱ�ʾ2^8����ͬ������byteֵ�ķ�Χ��-128~127֮��
		byte byte_type = 0;
		byte_type = 127;
		byte_type = -128;
		// byte_type = 128; // Error!���ܴ���127
		// byte_type = -129; // Error!����С��-128
		System.out.println("byte_type��" + byte_type);

		// �ַ����͡��ܹ���ʾ������ַ���1��char����Ϊ16��bit��
		char char_type = 'a';
		char_type = '#';
		char_type = '1';
		char_type = '��';
		System.out.println("char_type��" + char_type);

		// ���������͡�1��short����Ϊ16��bit������ֻ�ܱ�ʾ2^16����ͬ������shortֵ�ķ�Χ��-32768~32767֮��
		// �����ϲ���ô�ã���Ϊ���ڵĵ����ڴ��㹻������һ��������ǲ���short������int��
		short short_type = 0;
		short_type = 32767;
		short_type = -32768;
		// short_type = 32768; // Error!���ܴ���32767
		// short_type = -32769; // Error!����С��-32768
		System.out.println("short_type��" + short_type);

		// �������͡�1��int����Ϊ32��bit�������ܱ�ʾ2^32����ͬ������intֵ�ķ�Χ��-2^31~2^31-1֮��
		int int_type = 0;
		int_type = 2147483647;
		int_type = -2147483648;
		// int_type = 32768; // Error!���ܴ���2147483647
		// int_type = -32769; // Error!����С��-2147483648
		System.out.println("int_type��" + int_type);

		// ���������͡�1��long����Ϊ64��bit�������ܱ�ʾ2^64����ͬ������longֵ�ķ�Χ��-2^63~2^63-1֮��
		// �����ǲ���ô�ã�����Ҫ�ó������������
		long long_type = 0;
		long_type = 9223372036854775807L; // ����Ҫ����L��׺����ʾ�ǳ�����
		long_type = -9223372036854775808L;
		// long_type = 9223372036854775808L; // Error!���ܴ���9223372036854775807L
		// long_type = -9223372036854775809L; // Error!���ܴ���9223372036854775808L
		System.out.println("long_type��" + long_type);

		// ���������͡�һ��float����Ϊ32��bit����ʾ��Χ��1.4E-45~��3.4028235E+38
		// �����ã�һ��ʹ��double���͡�
		float float_type = 0.0F;
		float_type = 2.5F;
		float_type = -2.5F;
		System.out.println("float_type��" + float_type);

		// ˫�������͡�һ��double����Ϊ64��bit����ʾ��Χ��4.9E-324~��1.7976931348623157E+308
		// ps:�������õ�С���ĵط���������double����Ϊ���ڵ����ڴ��㹻������double��ʾ�ľ��ȸߡ�
		// double��float�ı�ʾ��Χ���ÿ���ȥ�ܣ���ͨ�̶ȵļ���������ᳬ�����ʾ��Χ��
		double double_type = 0.0;
		double_type = 2.5;
		double_type = -2.5;
		System.out.println("double_type��" + double_type);
	}
}

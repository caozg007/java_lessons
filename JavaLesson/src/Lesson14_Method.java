/**
 * ����
 *
 * @author LiuDelin
 */
public class Lesson14_Method {

	public static void main(String[] args) {

		double radius = 2;
		double area = getArea(radius);
		System.out.println("radius=" + radius + ", area=" + area);

		int n = 4;
		System.out.println(n + "! = " + getFactorial(n));

		printDivide(1, 0);
		printDivide(1, 2);

		overloadFunction();
		overloadFunction(1);
		overloadFunction(1.0);
		overloadFunction(1.0f);
		overloadFunction("s");
		overloadFunction(1, 1);
		overloadFunction(1.0f, 1.0);
		overloadFunction(1.0, 1.0f);
		// overloadFunction(1.0f, 1.0f); // Error!ģ�����ɵĵ��ã���������(double, float)��(float, double)���������������ƥ�䣬���Բ�֪��ѡ�ĸ�
		// overloadFunction(1.0, 1.0); // Error!û���Ҵ�(double, double)�Ķ���
	}

	// �����뾶���������
	public static double getArea(double radius) {
		return 3.14 * radius * radius;
	}

	// n!
	public static int getFactorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static void printDivide(int a, int b) {
		if (b == 0) {
			System.out.println(a + "/0=?");
			return; // ���أ���������������
		}
		System.out.println(a + "/" + b + "=" + ((double) a / b));
	}

	public static void overloadFunction() {
		System.out.println("overloadFunction without params.");
	}

	public static void overloadFunction(int a) {
		System.out.println("overloadFunction with an int param.");
	}

	public static void overloadFunction(double a) {
		System.out.println("overloadFunction with a double param.");
	}

	public static void overloadFunction(float a) {
		System.out.println("overloadFunction with a float param.");
	}

	public static void overloadFunction(String a) {
		System.out.println("overloadFunction with a String param.");
	}

	public static void overloadFunction(int a, int b) {
		System.out.println("overloadFunction with two int params.");
	}

	public static void overloadFunction(float a, double b) {
		System.out
				.println("overloadFunction with an int param and a double param.");
	}

	public static void overloadFunction(double a, float b) {
		System.out
				.println("overloadFunction with a double param and an int param.");
	}

}

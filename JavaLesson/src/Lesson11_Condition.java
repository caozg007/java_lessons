/**
 * �����ж�
 *
 * @author LiuDelin
 */
public class Lesson11_Condition {

	public static void main(String[] args) {
		int a = 1;
		int b = -1;
		boolean c = true;

		// ���͵�if else���
		if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a <= b");
		}

		// ���������ŵ�if else������������д��
		if (a > b)
			System.out.println("a > b");
		else
			System.out.println("a <= b");

		// û��else��if���
		if (a > b) {
			System.out.println("a > b");
		}

		// �Ƽ�����д
		if(c){
			System.out.println("c == true");
		}else{
			System.out.println("c == false");
		}
		// ���Ƽ�����д
		if(c == true){
			System.out.println("c == true");
		}else{
			System.out.println("c == false");
		}
		
		
		if(a <= b){
			System.out.println("a <= b");
		}else if(c){
			System.out.println("c == true && a > b");
		}else{
			System.out.println("c == false && a > b");
		}
	}
}

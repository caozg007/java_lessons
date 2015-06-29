import lesson19_package.A;

/**
 * ��
 *
 * @author LiuDelin
 */
public class Lesson19_Package {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		System.out.println("public:" + a.data_public);
		// System.out.println("protected:" + a.data_protected); // Error!û�з���Ȩ��
		// System.out.println("default:" + a.data_default); // Error!û�з���Ȩ��
		// System.out.println("private:" + a.data_private); // Error!û�з���Ȩ��
		
		B b = new B();
	}
}

class B extends A{
	
	public B(){
		System.out.println("public:" + this.data_public);
		System.out.println("protected:" + this.data_protected);
		// System.out.println("default:" + this.data_default); // Error!û�з���Ȩ��
		// System.out.println("private:" + this.data_private); // Error!û�з���Ȩ��
	}
}

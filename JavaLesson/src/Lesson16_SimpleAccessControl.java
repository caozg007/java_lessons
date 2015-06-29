/**
 * �򵥵�Ȩ�޿��ƣ�private��public
 *
 * @author LiuDelin
 */
public class Lesson16_SimpleAccessControl {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.getArea();
		c.getRadius();
		c.setRadius(10);
		// c.privateMethod(); // Error!˽�з������������������
		c.info = "This is a circle";
		// c.radius = 10; // Error!˽�б������������������
	}
}

class Circle2 {

	private double radius; // private��˽�г�Ա
	public String info; // public�����г�Ա

	public double getArea() {
		return 3.14 * radius * radius;
	}

	private void privateMethod() {
		System.out
				.println("You cannot see this line out of the class Circle2.");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
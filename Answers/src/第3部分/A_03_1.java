package ��3����;

/**
 * ��д���򣬱�дһ����MyDate������˽�б���month��ȡֵΪ1~12����year��>0����day��1~31����
 * 	Ĭ��ֵΪmonth = 1; year = 2015; day = 1;
 * 	����������˽�б������ж�Ӧ��set��get������
 * 	set��������Ҫ�кϷ����ж���������setMonth(0)���ǷǷ��ġ��˷���setDay(day)ֻ��Ҫ1~31���ǺϷ���
 * 	��һ��˽�з�����boolean isLeapYear(); // �ж��Ƿ�Ϊ���꣨����������4�ı��������꣬��������400�ı����������꣩
 * 	��һ��˽�з�����int daysOfMonth(); // ��ȡ���·ݵ�������ע�⣬�����2����29�죩
 * 	��һ�����з�����void printDate(); // ���year-month-day��Ȼ�����daysOfMonth������µ�������
 * 										�ж�day�Ƿ񳬳������������������"illegal date"
 *
 * @author LiuDelin
 */
public class A_03_1 {

	public static void main(String[] args) {

		MyDate myDate = new MyDate();
		myDate.printDate();
		
		myDate.setMonth(4);
		myDate.setDay(31);
		myDate.printDate();
		
		myDate.setMonth(2);
		myDate.setDay(29);
		myDate.printDate();
		
		myDate.setYear(2012);
		myDate.printDate();

		myDate.setYear(2000);
		myDate.printDate();
		
		myDate.setYear(1900);
		myDate.printDate();
		
	}

}

class MyDate{
	
	private int month = 1;
	private int year = 2015;
	private int day = 1;
	
	public void printDate(){
		System.out.print(year + "-" + month + "-" + day);
		if(day < 1 || day > daysOfMonth()){
			System.out.print(" illegal date");
		}
		System.out.println();
	}
	
	private boolean isLeapYear(){
		if(year%100 == 0){
			return year%400 == 0;
		}else{
			return year%4==0;
		}
	}
	
	private int daysOfMonth(){
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear() ? 29 : 28;
		default:
			return 0;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12){
			System.out.println("month cannot be " + month);
			return;
		}
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year <= 0){
			System.out.println("year cannot be " + year);
			return;
		}
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day < 1 || day > 31){
			System.out.println("day cannot be " + day);
			return;
		}
		this.day = day;
	}
}

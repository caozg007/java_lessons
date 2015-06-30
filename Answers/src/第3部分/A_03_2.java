package ��3����;

/**
 * ��д���򣬱�дһ����BankAccount��
 * 	˽�г�Ա������double balance������double rate�������ʣ�
 * 	get��set�������������˽�г�Ա��������get��set������set������Ҫ���ϺϷ����ж�(balance>=0��rate>=0)
 * 	���з���nextYear()��ʱ���ȥһ�꣬��Ҫ������Ϣ���ӵ������
 * 	���з���manyYears(int n)��ʱ���ȥn�꣬��Ҫ������Ϣ���ӵ������
 * 	���з���printInfo()����ӡ������Ϣ
 * 	��ʼ�����Ϊ10000������Ϊ0.05����ӡ100�����˺������
 *
 * @author LiuDelin
 */
public class A_03_2 {

	public static void main(String [] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.printInfo();
		bankAccount.manyYears(100);
		bankAccount.printInfo();
	}
}

class BankAccount{
	
	private double balance = 10000;
	private double rate = 0.05;
	
	public void nextYear(){
		balance *= (1+rate);
	}
	
	public void manyYears(int n){
		for(int i=0; i<n; i++){
			nextYear();
		}
	}
	
	public void printInfo(){
		System.out.println("balance is " + balance + ", rate is " +rate);
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance < 0){
			System.out.println("balance cannot be " + balance);
			return;
		}
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		if(rate < 0){
			System.out.println("rate cannot be " + rate);
			return;
		}
		this.rate = rate;
	}
	
}

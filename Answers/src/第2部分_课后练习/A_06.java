package ��2����_�κ���ϰ;

/**
 * ��д����������1!+2!+3!+...+n!<99999���������n
 *
 * @author LiuDelin
 */
public class A_06 {

	public static void main(String[] args) {

		int max = 99999;
		
		int sum = 0;
		for(int i=1; ; i++){
			
			int part_result = 1;
			for(int j=1; j<=i; j++){
				part_result *= j;
			}
			if(sum + part_result >= max){
				System.out.println(i-1);
				break;
			}
			sum += part_result;
		}
	}

}

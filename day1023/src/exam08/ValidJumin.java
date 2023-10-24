package exam08;

import java.util.Scanner;

/*
사용자한테 주민번호를 입력받아
올바른 주민번호인지 판별하는 프로그램 작성
 */
//ㅍ = 11-{(2×ㄱ +3×ㄴ +4×ㄷ +5×ㄹ +6×ㅁ +7×ㅂ 
//			+8×ㅅ +9×ㅇ
//			+2×ㅈ +3×ㅊ +4×ㅋ +5×ㅌ) mod 11}
//0~10
public class ValidJumin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 : ");
		String jumin = sc.next();
		
		char num;
		int tot1=0,tot2=0,tot3=0,sum=0;
		
		for(int i=2; i<=10; i++) {
			for(int j=0; j<6; j++) {
				num = jumin.charAt(j);
				tot1 += i*j;
			}
		}
		
		//int num1 = Integer.parseInt(jumin.charAt(7));
		
		char num2 = jumin.charAt(8);
		//tot2 = 8*num1 + 9*num2;
		
		char num3 = jumin.charAt(9);
		char num4 = jumin.charAt(10);
		char num5 = jumin.charAt(11);
		char num6 = jumin.charAt(12);
		tot3 = 2*num3 + 3*num4 + 4*num5 + 5*num6;
		
		sum = (tot1 + tot2 + tot3)/11; 
		
		char valid = jumin.charAt(13);
		
		if(valid == sum) {
			System.out.println("유효한 주민번호");
		}
	}
}













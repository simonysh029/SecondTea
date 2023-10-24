package exam01;

import java.util.Scanner;

/*
 사용자 한테 주민번호를 입력받아 
 올바른 주민번호인지 판별하는 프로그램을 작성합니다.
 (올바른 주민번호 판별은 위키백과를 참고합니다.)
 ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
 */
public class ValidJuminSol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String jumin;							
		System.out.println("주민번호 입력==>");		
		jumin = sc.next();						

		//800101-1234567
		if(jumin.length() != 14) {
			System.out.println("올바른 주민번호가 아닙니다.");
			return;
		}
		
		
//------예외 처리 속에 변수를 사용하면 중괄호 밖에선 사용이 불가하기 때문에 변수를 중괄호 바깥에서 선언한다.----------
		int check;
		int sum;
//-------------------예외처리----------------------------------		
		//변수 선언은 밖으로 빼주어야 한다.

		//try{
		//	프로그램 의도대로 구성
		//}catch (Exception e) {
		//	예외 상황 발생시 실행될 내용
		//	return;
		//}

		try {

			check = Integer.parseInt(jumin.substring(13, 14));		
			int []arr = {2,3,4,5,6,7,0,8,9,2,3,4,5};					
			sum = 0;												
					
			for(int i=0; i<jumin.length()-1; i++) {						
				if(i != 6) {											
					int n = Integer.parseInt(jumin.substring(i, i+1));	
					sum += n * arr[i];									
				}
			}

		}catch (Exception e) {
			System.out.println("올바른 주민번호가 아닙니다.");
			return;
		}
		
//-------------------예외처리----------------------------------
		
		sum = sum % 11;			
		sum = 11 - sum;		
		if(sum ==  10) {		
			sum = 0;
		}
		if(sum == 11) {			
			sum = 1;
		}
		
		if(sum == check) {		
			System.out.println("올바른 주민번호 입니다.");
		}
		else {
			System.out.println("올바른 주민번호가 아닙니다.");
		}
	}
}
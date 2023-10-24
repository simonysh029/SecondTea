package exam08;

import java.util.Date;
import java.util.Scanner;

//연습) 주민번호를 입력받아 나이를 계산하여 출력하는 프로그램 작성
//1,2 - 1900년대 3,4 - 2000년대
public class AgeFromJumin {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		String jumin, yearFromJumin;
		System.out.println("주민번호(하이픈 포함)를 입력 -->");
		jumin = sc.next();//800101-1234567
		
		int thisYear, userYear, age;
		Date today = new Date();
		thisYear = today.getYear() + 1900;
		
		//주민번호로부터 앞의 두자리를 잘라온다.
		yearFromJumin = jumin.substring(0, 2);
		
		//주민번호로부터 성별을 의미하는 글자를 갖고온다.
		char check = jumin.charAt(7);
		
		if(check != '1' || check!='2' || check!='3' ||check!='4') {
			System.out.println("주민번호 오입력");
			return;
		}
		
		if(check == '1' || check == '2') {
			userYear = Integer.parseInt(yearFromJumin) + 1900;
		}else {
			userYear = Integer.parseInt(yearFromJumin) + 2000;
		}
		
		//나이를 계산한다.
		age = thisYear - userYear;
		
		System.out.printf("올해연도 : %d\n",thisYear);
		System.out.printf("출생연도 : %d\n",userYear);
		System.out.printf("나이 : %d\n",age);
		
	}
}

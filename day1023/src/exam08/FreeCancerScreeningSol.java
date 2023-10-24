package exam08;

import java.util.Date;
import java.util.Scanner;

public class FreeCancerScreeningSol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.println("주민번호 입력==>");
		jumin = sc.next();
		
		//올해의 연도를 알아온다.
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		
		//주민번호로부터 "성별"자리의 글자를 갖고 온다.
		char gender = jumin.charAt(7);
		//'1','2','3','4'
		
		//나이를 계산한다.
		
		//출생연도를 계산한다.
		int userYear = Integer.parseInt(jumin.substring(0,2))+1900;
		
		//만약, 2000년대 이후 출생이면 100을 더해준다.
		if(gender == '3' || gender =='4') {
			userYear += 100;
		}
		
		//나이를 계산한다.
		int age = thisYear - userYear;
		
		//일단은 검진항목에  위암, 간암, 일반암 저장
		
		String items = "위암,간암,일반암";
		
		System.out.println("*** 무료암검진 대상 여부 ***");
		System.out.println("올해연도:" + thisYear);
		System.out.println("출생연도:" + userYear);
		System.out.println("나이:" + age);
		
		
		//무료 암검진 대상자인지 판별한다.
		if(age >= 40 && thisYear%2 == userYear%2) {
			//50살 이상이면 "대장암"을 추가한다.
			if(age>=50) {
				items += ",대장암";
			}
			
			//여자이면 "자궁암", "유방암"을 추가한다.
			if(gender == '2' || gender == '4') {
				items += ",자궁암,유방암";
			}
			System.out.println("무료암검진 대상자이며");
			System.out.println("검진항목은 "+items+" 입니다.");
			
		}else {
			System.out.println("무료암검진 대상자가 아닙니다.");
		}	
	}
}
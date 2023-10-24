package exam08;

import java.util.Date;
import java.util.Scanner;

/*
	사용자한테 주민번호를 입력받아 무료암검진 대상자인지
	판별하는 프로그램을 작성합니다.
	무료암검진 대상자는 40세 이상이고 올해가 짝수연도이면
	짝수연도에 태어나고 홀수연도이면 홀수연도에 태어난 사람입니다.
	
	<<암검진 항목>>
	40세 이상 남자 : 위암, 간암, 일반암
	40세 이상 여자 : 위암, 간암, 일반암, 자궁암, 유방암
	50세 이상 남자 : 위암, 간암, 일반암, 대장암
	50세 이상 여자 : 위암, 간암, 일반암, 대장암, 자궁암, 유방암
 */

public class FreeCancerScreening {
	public static void main(String[] args) {
		String basic = "위암, 간암, 일반암";
		String jumin,yearFromJumin;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 : ");

		jumin = sc.next();		
		int thisYear;

		Date today = new Date();
		thisYear = today.getYear() + 1900;
		
		char gender = jumin.charAt(7);						//성별(1-남성,2-여성)
		
		yearFromJumin = jumin.substring(0, 2);
		int age = thisYear - (Integer.parseInt(yearFromJumin) + 1900);	//나이(홀짝판별)
		
		if(thisYear%2==0 && age>=40 && gender=='1') { //40남 짝수
			System.out.println("검진 항목은 "+basic+"입니다.");			
		}else if(thisYear%2==0 && age>=40 && gender=='2') { //40여 짝수
			System.out.println("검진 항목은 "+basic+", 자궁암, 유방암 입니다.");
		}else if(thisYear%2==0 && age>=50 && gender=='1') {	//50남 짝수
			System.out.println("검진 항목은 "+basic+" ,대장암 입니다.");
		}else if(thisYear%2==0 && age>=50 && gender=='2') {	//50여 짝수
			System.out.println("검진 항목은 " +basic+", 대장암, 자궁암, 유방암 입니다.");
		}else if(thisYear%2==1 && age>=40 && gender=='1') {	//40남 홀수
			System.out.println("검진 항목은 " +basic+", 대장암 입니다.");
		}else if(thisYear%2==1 && age>=40 && gender=='2') {		//40여 홀수
			System.out.println("검진 항목은 " +basic+", 대장암, 자궁암, 유방암 입니다.");
		}else if(thisYear%2==1 && age>=50 && gender=='1') {	//50남 홀수
			System.out.println("검진 항목은 " +basic+", 대장암 입니다.");
		}else if(thisYear%2==1 && age>=50 && gender=='2') {		//50여 홀수
			System.out.println("검진 항목은 " +basic+", 대장암, 자궁암, 유방암 입니다.");
		}else {
			System.out.println("범위 초과");
		}
	}
}
package exam08;

import java.util.Date;

public class TodayTest {
	public static void main(String[] args) {
		//올해의 연도를 출력해 봅시다.
		//자바가 만들어 놓은 클래스 중에
		//날짜와 시간에 대한 정보를 알려주는 클래스 Date을 이용
		
		Date today = new Date();
		//오늘에 대한 객체 생성
		System.out.println(today);
		//toString이 동작함
		
		int year = today.getYear() + 1900;
		System.out.println(year);
		//올해의 연도를 알아보는 메소드
	}

}

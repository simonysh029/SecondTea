package exam08;

import java.util.Scanner;
//대문자로 입력을 하더라도 처리되도록 합니다.
public class LowerUpperTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String re;
		System.out.println("당신은 학생입니까?");
		re = sc.next();

		//equalsIgnoreCase()를 통해 대소문자 가리지 않고 받음
		if(re.equalsIgnoreCase("yes")) {
			System.out.println("학생입니다.");
		}else {
			System.out.println("학생이 아닙니다.");
		}
	}
}

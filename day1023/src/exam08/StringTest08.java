package exam08;

import java.util.Scanner;

//사용자한테 이메일을 입력받아
//올바른 이메일형식인지 판별
public class StringTest08 {

	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 : ");
		
		email = sc.next();
		
		int i = email.indexOf("@");
/*		
		if(i==-1) {
			System.out.println("올바른 이메일 형식이 아닙니다.");
		} else {
		System.out.println("이메일 확인");
		}
*/		
		if(email.indexOf("@") != -1) {
			System.out.println("올바른 이메일 형식입니다.");
		}else {
			System.out.println("올바른 이메일 형식이 아닙니다.");
		}
	}
}

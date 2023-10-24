package exam08;

import java.util.Scanner;

//사용자한테 이메일을 입력받아
//아이디를 출력해 봅니다.
public class StringTest11 {
	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 입력 : ");
		email = sc.next();
		
		String id = email.substring(0, email.indexOf("@"));
		
		System.out.println(id);
	}
}

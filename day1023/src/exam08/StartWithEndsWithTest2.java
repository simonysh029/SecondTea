package exam08;

import java.util.Scanner;

//사용자한테 이메일을 입력받아 올바른 이메일인지 판별(.com으로 끝나는지)
//".com",".net",".co.kr","go.kr","ac.kr","or.kr"
public class StartWithEndsWithTest2 {
	public static void main(String[] args) {
		
		//올바른 이메일의 접미사를 배열에 저장
		String []arr = {".com",".net",".co.kr","go.kr","ac.kr","or.kr"};
		
		Scanner sc = new Scanner(System.in);
		String email;
		System.out.println("이메일을 입력==>");
		email = sc.next();
		
		boolean isEmail = false;	//dafault 설정
		
		for(String suffix:arr) {
			if(email.endsWith(suffix)) {
				isEmail = true;
				break;
			}
		}
		
		//if(email.endsWith(".com")||email.endsWith(".net")||email.endsWith("@co.kr")||email.endsWith("@go.kr")||email.endsWith("@ac.kr")||email.endsWith("@or.kr")) {
		if(isEmail) {
			System.out.println("올바른 이메일입니다.");
		}else {
			System.out.println("올바른 이메일이 아닙니다.");
		}
	}

}

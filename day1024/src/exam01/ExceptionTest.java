package exam01;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
		try {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("데이터를 입력==>");
			String data = sc.next();
			int n = Integer.parseInt(data);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println("올바른 입력이 아닙니다.");
		}
		
	}
}

package exam01;

import java.util.Scanner;

public class ReadLineTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("데이터 입력==>");
		data = sc.nextLine();
		//nextLine : 공백문자도 입력받을 수 있어요.
		System.out.println(data);
	}

}

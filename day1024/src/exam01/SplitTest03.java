package exam01;

import java.util.Scanner;

/*
	사용자한테 문장을 입력받아
	단어의 수를 출력하는 프로그램을 작성.
 */
public class SplitTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문장 입력 : ");
		data = sc.nextLine();
		
		String []arr = data.split(" ");
		
		System.out.println("단어의 수 : "+arr.length);
		
		
	}
}

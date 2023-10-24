package exam08;

import java.util.Scanner;

//startsWith와 endsWith를 실험
public class StartWithEndsWithTest {
	public static void main(String[] args) {
		
		String data;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장 입력 : ");
		data = sc.nextLine();
		
		
		if(data.startsWith("J")) {
			System.out.println("해당 문장은 J로 시작함");
		}else {
			System.out.println("해당 문장은 J로 시작하지 않음");
		}
		if(data.endsWith("a")) {
			System.out.println("해당 문장은 a로 끝남");
		}else {
			System.out.println("해당 문장은 a로 끝나지 않음");
		}
		

	}

}

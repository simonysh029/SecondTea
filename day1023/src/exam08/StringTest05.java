package exam08;

//charAt()을 통한 문자열 배열 출력

public class StringTest05 {
	public static void main(String[] args) {
		String data = "hello korea";
		for(int i=0; i<data.length(); i++) {
			char a = data.charAt(i);
			System.out.print(a);
		}
	}
}

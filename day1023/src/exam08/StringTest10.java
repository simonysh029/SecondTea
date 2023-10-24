package exam08;

public class StringTest10 {
	public static void main(String[] args) {
		String data = "hello java hello korea";
		
		String a = data.substring(6, 10);
		//문자열의 일부분을 잘라서 반환합니다.
		//시작인덱스의 문자는 포함
		//마지막 인덱스의 문자는 미포함
		System.out.println(a);
		
		String b = data.substring(6);
		//시작 인덱스만 주면 거기서부터 끝까지 반환합니다.
		System.out.println(b);
		
	}
}
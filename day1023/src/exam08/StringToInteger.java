package exam08;

public class StringToInteger {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "200";
		
		System.out.println(data1 + data2);
		//문자열의 +는 연결해 줍니다.
		
		System.out.println(Integer.parseInt(data1)
				+ Integer.parseInt(data2));
		//문자열을 정수로 변환하기 위하여
		//Integer.parseInt()
		
		//문자열을 실수로 변환하기 위하여
		//Double.parseDouble()
		
		//스트링 타입을 정수로 변환
		//정수로 할만한 스트링이어야 한다.
	}
}

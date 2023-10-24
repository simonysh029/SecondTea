package exam01;

public class StringPlusTest {
	public static void main(String[] args) {
		System.out.println(100+200);
		System.out.println("100"+"200");
		//String의 +은 문자열을 연결해 줍니다.
		
		System.out.println(100+"200");
		//이것도 결과는 문자열
		
		System.out.println("100"+200);
		//이것도 결과는 문자열
		
		System.out.println(100+""+200);
		//이것도 결과는 문자열
		
		System.out.println(""+100+200);
		//이것도 결과는 문자열

		//원칙적으로 String으로 변환하기 위하여
		//ValueOf메소드를 제공하지만
		//위의 방법처럼 어떤 데이터라도 + ""으로 하여
		//String으로 쉽게 만들 수 있어요!
		
		System.out.println(100+200+"");
		//이건 문자열 아님
	}
}
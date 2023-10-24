package exam08;

public class StringTest07 {
	public static void main(String[] args) {
		String data = "hello korea hello java";
		
		
		int i = data.indexOf("korea");
		//korea 라는 문자열이 있는 순서 표시 - 첫번째가 0부터 시작
		
		//문자열데이터 안에 "korea"라는 문자열이
		//처음으로 나타나는 인덱스를 알려줍니다.
		
		//찾았는데 없으면 -1 반환한다.
		//이러한 특성으로 인해 존재 유무 판단에도 사용 가능하다.
		
		System.out.println(i);
		
		int j = data.indexOf("python");
		System.out.println(j);
		
	}
}

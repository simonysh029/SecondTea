package exam01;

//split
public class SplitTest {
	public static void main(String[] args) {
		String data = "김지수,박세연,김주선,이용제,임동우";
		String []arr = data.split(",");
		//data를 컴마(,)로 분리하게 하는 코드
		System.out.println(arr.length);
		System.out.println(arr[0]);
	}

}

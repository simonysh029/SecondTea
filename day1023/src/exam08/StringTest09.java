package exam08;

//lastIndexoOf
public class StringTest09 {
	public static void main(String[] args) {
		String data = "hi k hi j hi p";
		int i = data.indexOf("hi");
		//data에서 hi를 왼쪽에서부터 찾아서 그 인덱스를 알려줘요.
		//0
		int j = data.lastIndexOf("hi");
		//data에서 hi를 오른쪽에서부터 찾아서
		//배열의 처음부터 카운트 하여 그 인덱스의 배열 순서 수를 알려줘요.
		//10
		System.out.println(i);
		System.out.println(j);

	}
}

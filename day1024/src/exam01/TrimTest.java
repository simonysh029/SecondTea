package exam01;

//앞뒤의 공백문자 있는 문자열을 만들고
//trim메소드를 실험
public class TrimTest {
	public static void main(String[] args) {
		String data = "    Java with Javava with arrrrray    ";
		String data1 = data.trim();
		
		System.out.println(data);
		System.out.println(data.length());
		System.out.println(data1);
		System.out.println(data1.length());
		
		System.out.println("|"+data+"|");
		System.out.println("|"+data1+"|");
	}

}

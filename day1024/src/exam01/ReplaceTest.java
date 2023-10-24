package exam01;

//replace
public class ReplaceTest {
	public static void main(String[] args) {
		String data = "Java";
		
		String data2 = data.replace('J', 'A');
		
		//String은 불변의 특징을 갖고 있다.
		//바꿔진 새로운 문자열을 반환한다.
		//data에는 변동이 없고 새로운 변수에 저장되는거임
		
		System.out.println(data);
		System.out.println(data2);
		
		String data3 = data.replace("Ja", "자");
		
		System.out.println(data3);
	}
}

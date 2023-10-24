package exam01;
/*
	String의 특징은 변하지 않는 문자열입니다!
	
	메모리 공간에 저장된 것이 불변
	
	내용을 추가하거나 변경하면(문자열을 변경) 그만큼 별도의 메모리를 잡음
	문자열을 변경시킬수록 가비지가 자꾸 만들어집니다
	가비지 -> 더 이상 참조되지 않는 메모리
	
	변하는 문자열 처리에는 String은 부적합하다.
	
	변하는 문자열 처리를 위하여 StringBuffer, StringBuilder 사용
	기본적으로 String이기에 String으로 바꿔서 사용해야함
	
	
	**String의 특징
	
	String은 불변으로써 변하지 않는 문자열 처리에 적합합니다.
	String 객체에 문자열을 변경시키면
	객체가 변경되는 것이 아니라 변경된 새로운 객체를 만들어
	그곳을 참조변수가 다시 가리키게 됩니다.
	이 때 더 이상 참조되지 않는 이전의 객체는 쓰레기(가비지)되기 때문에
	변하는 문자열 처리에는 부적합합니다.
	
	만약 변하는 문자열처리를 하려면
	StringBuffer, String Builder를 사용합니다.
	둘의 사용법은 유사하지만
	StringBuffer를 더 많이 사용한다.
 */
public class ImmutalbeString {
	public static void main(String[] args) {
		String data = "hello";
		System.out.println(data);
		data = data + " korea";
		System.out.println(data);
	}
}
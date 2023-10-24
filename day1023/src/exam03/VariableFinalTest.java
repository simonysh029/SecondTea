package exam03;

/*
	다음의 코드에서 a의; 이름과 나이,
	b의 이름과 나이는 별도의 메모리 공간이 필요한 것이 마땅
	하지만 상수인 addr은 굳이 별도의 메모리가 필요하진 않으니
	static을 사용하여 전역 변수로 선언하는게 효율적이다.
	하지만 반대로 static을 사용해야한다고 했을 때 무조건 final이 효율적이진 않다.
 */

class Person{
	String name = "홍길동";
	int age = 20;
	final String addr = "서울";
}

public class VariableFinalTest {
	public static void main(String[] args) {
	}

}

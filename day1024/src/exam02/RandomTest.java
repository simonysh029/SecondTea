package exam02;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		//1~10 사이의 난수를 만들고 싶어요
		Random r = new Random();
		int n = r.nextInt(10)+1;
		System.out.println(n);
	}
}
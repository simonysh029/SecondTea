package exam02;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet data = new HashSet();
		data.add("딸기");
		data.add("체리");
		data.add("복숭아");
		data.add("망고");
		data.add("수박");
		data.add("체리");
		System.out.println(data);
		
		//중복된 내용 버리고
		//순서 상관없음
	}
}

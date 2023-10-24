package exam02;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet data = new TreeSet();
		data.add("딸기");
		data.add("체리");
		data.add("복숭아");
		data.add("망고");
		data.add("수박");
		data.add("체리");
		System.out.println(data);
		System.out.println(data.size());
		//중복된 내용 버리고
		//순서 유지
	}
}

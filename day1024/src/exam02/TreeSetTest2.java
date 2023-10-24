package exam02;

import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet data = new TreeSet();
		boolean f;
		f = data.add("딸기");
		System.out.println(f);
		f = data.add("체리");
		System.out.println(f);
		f = data.add("수박");
		System.out.println(f);
		f = data.add("체리");
		System.out.println(f);
		System.out.println("-----------------");
		System.out.println(data);
		System.out.println(data.size());
		
		//add() 는 추가되면 true, 못 담으면(중복 등의 이유로) false;
		
	}
}

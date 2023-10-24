package exam02;

import java.util.Random;
import java.util.TreeSet;

//Set을 이용하여 중복되지 않는 로또번호를 생성하도록 만들기
public class LottoTest {
	public static void main(String[] args) {
		TreeSet lotto = new TreeSet();
		Random r = new Random();
		
		while(true) {
			lotto.add(r.nextInt(45)+1);
			if(lotto.size() >= 6) {
				break;
			}
		}
		System.out.println("*** 이번주 로또 추천 번호 ***");
		System.out.println(lotto);
	}
}

package exam08;

//'a' 갯수 세기

public class StringTest06 {

	public static void main(String[] args) {
		String data = "hello korea hello java";
		int n=0;
		for(int i = 0; i<data.length(); i++) {
			char ch = data.charAt(i);
			if(ch=='a') {
				n++;
			}
		}
		System.out.printf("소문자 adml rotnsms %d",n);
	}

}

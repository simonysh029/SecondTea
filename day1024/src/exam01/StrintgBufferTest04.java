package exam01;

class MemberDAO {
	public void insert(String sql) {
		System.out.println("다음의 명령을 동작하였습니다.");
		System.out.println(sql);
	}
}

public class StrintgBufferTest04 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("insert ");	
		str.append("into ");
		str.append("member ");
		str.append("values ");
		str.append("('tiger',20)");
		System.out.println(str);
		
		MemberDAO dao = new MemberDAO();
		
		dao.insert(String.valueOf(str));
		dao.insert(str.toString());
	}
}

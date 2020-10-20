package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

	Connection con; // 전역변수

	public MemberDAO() throws Exception {
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 성공!!");

		// 2. db연결
		// String url = "연결하는방법 ://ip:port/db명"
		String url = "jdbc:mysql://localhost:3306/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

	}

	public void create(String id, String pw, String name, String tel) throws Exception {

		// 3. sql문을 만든다(create)
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. SQL문 생성 성공!!");

		// 4. sql문을 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!!");

		ps.close();
		con.close();
	}

	public int read(String id) throws Exception {

		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공!!");

		// select의 결과는 검색결과가 담긴 테이블 (항목+내용)
		// 내용이 없을 수도 , 있을수도!
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공!!");

		// if문은 rs.next()가 true 일때만 실행
		int result = 0;// 없음
		if (rs.next()) {// 결과가 있는지 없는지 체크해주느 메서드
			System.out.println("검색결과가 있어요.");
			result = 1;
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");

			System.out.println("검색결과" + id2);
			System.out.println("검색결과" + pw);
			System.out.println("검색결과" + name);
			System.out.println("검색결과" + tel);

		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		// 0이 넘어가면 검색결과 없음.
		// 1이 넘어가면, 검색결과 있음.

	}

	public boolean update(MemberVO vo) throws Exception {

		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPw());
		ps.setString(2, vo.getName());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getId());

		System.out.println("3. SQL문 생성 성공!!");

		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!!");
		
		ps.close();
		con.close();
		
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

//	public void delete(String id) throws Exception {
//
//		String sql = "delete from member where id = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		System.out.println("3. SQL문 생성 성공!!");
//
//		ps.executeUpdate();
//		System.out.println("4. SQL문 전송 성공!!");
//
//		ps.close();
//		con.close();
//
//	}

	// 로그인
	public boolean read(String id, String pw) throws Exception {

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL문 생성 성공!!");

		// select의 결과는 검색결과가 담긴 테이블 (항목+내용)
		// 내용이 없을 수도 , 있을수도!
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공!!");

		// if문은 rs.next()가 true 일때만 실행
		boolean result = false;
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주느 메서드
			System.out.println("Login OK.");
			result = true;
		} else {
			System.out.println("Login NOT");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		// true 면 login ok/ false 면 login not

	}

	public boolean create(MemberVO bag) throws Exception {

		// 3. sql문을 만든다(create)
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());

		System.out.println("3. SQL문 생성 성공!!");

		// 4. sql문을 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;

	}

	public MemberVO one(String id) throws Exception {

		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공!!");

		// select의 결과는 검색결과가 담긴 테이블 (항목+내용)
		// 내용이 없을 수도 , 있을수도!
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공!!");

		MemberVO bag = new MemberVO();
		// if문은 rs.next()가 true 일때만 실행
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주느 메서드
			System.out.println("검색결과가 있어요.");
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			// 가방에 넣기
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			System.out.println("검색결과" + id2);
			System.out.println("검색결과" + pw);
			System.out.println("검색결과" + name);
			System.out.println("검색결과" + tel);

		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		return bag;
		// bag은 참조형 변수, 주소를 전달!

	}

	public boolean delete1(String id) throws Exception {

		// 3. sql문을 만든다.(create)
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");

		ps.close();
		con.close();
		boolean result = false;

		if (row == 1) {
			result = true;
		}
		return result;
	}
}

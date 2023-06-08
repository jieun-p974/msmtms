package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import model.rec.LoginVO;
import model.rec.MemlogVO;
import view.LoginVIEW;

public class LoginDAO {
<<<<<<< HEAD
	private Connection conn;
=======

	// member field
	int memcode;
	String ID;
	String PW;
	String memtel;
	String memaddr;
	String mememr;
	String memname;
	String memjuban;
	String memobstacle;

	LoginVIEW lv;
	private Connection conn = null;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pwd = "soft";
<<<<<<< HEAD
	
	LoginVIEW lv;
	LoginDAO dao;
	LoginVO vo;
	
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;

	public LoginDAO() throws Exception {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pwd);
	}
	// 로그인
=======
	LoginDAO dao;
	LoginVO vo;
	PreparedStatement ps = null;
	java.sql.Statement stmt = null;
	ResultSet rs = null;

	public LoginDAO() throws Exception {
		/*
		 * ============================================ 생성자 함수 - DB 연결 1. 드라이버를 로딩 2.
		 * Connection 얻어오기
		 */
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pwd);

	}

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	public int Login(String ID, String PW) throws Exception {
		int res = 0;
		String sql = "select memcode, ID, PW, memtel, memaddr, mememr, memname, memjuban, memobstacle from member where ID = ? and PW = ?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, ID);
		ps.setString(2, PW);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			res = rs.getInt("memcode");
		}

		rs.close();
		ps.close();

		return res;
	}
<<<<<<< HEAD
	// 회원 정보 출력
=======

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	public LoginVO info(int code) throws Exception {
		LoginVO res = null;
		String sql = "select memcode, ID, PW, memtel, memaddr, mememr, memname, memjuban, memobstacle from member where memcode =" + code;

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		if (rs.next()) {

			Number memcode = rs.getInt("memcode");
			String ID = rs.getString("ID");
			String PW = rs.getString("PW");
			String memtel = rs.getString("memtel");
			String memaddr = rs.getString("memaddr");
			String mememr = rs.getString("mememr");
			String memname = rs.getString("memname");
			String memjuban = rs.getString("memjuban");
			String memobstacle = rs.getString("memobstacle");

			// MemberVO 타입으로 모든 정보 담아주기 - [JIN]
			res = new LoginVO(memcode, ID, PW, memtel, memaddr, mememr, memname, memjuban, memobstacle);
		}

		stmt.close();
		rs.close();

		return res;
	}

	}


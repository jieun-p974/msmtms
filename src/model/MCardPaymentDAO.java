package model;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

import model.rec.CardPaymentVO;

public class MCardPaymentDAO { 
<<<<<<< HEAD
	private Connection conn;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pwd = "soft";
	
	PreparedStatement ps;
	Statement stmt;

	// DB ����
	public MCardPaymentDAO() throws Exception {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pwd);
	}

	// �ⱸ ī�����
	public int regist(CardPaymentVO vo) throws Exception {
		String sql = "insert into mcard values (mcard_seq.nextval,?,?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		
=======
	private Connection conn = null;
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pass = "soft";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	PreparedStatement ps = null;
	Statement stmt = null;

	// constructor
	public MCardPaymentDAO() throws Exception {
		connectDB();
	}

	void connectDB() throws Exception {
		/*
		 * 1. ����̹��� ����̹��޴����� ��� 2. ���� ��ü ������
		 */
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pass);

	}

	public int regist(CardPaymentVO vo) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into mcard values (mcard_seq.nextval,?,?,?,?,?,?)";
//		vo = new CardPaymentVO();
		ps = conn.prepareStatement(sql);

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		ps.setString(1, vo.getCardnum());
		ps.setString(2, vo.getCardwarranty());
		ps.setString(3, vo.getCvc());
		ps.setString(4, vo.getCardcom());
		ps.setString(5, vo.getCardpwdf2());
		ps.setInt(6, vo.getScode());

		int cnt = ps.executeUpdate();
		ps.close();
		return cnt;
	}

}

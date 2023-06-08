package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
<<<<<<< HEAD
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
=======
import java.util.ArrayList;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

import model.rec.AsVO;
import model.rec.AscurrentVO;
import model.rec.AsnowVO;

public class ASDAO {
<<<<<<< HEAD
	private Connection conn;
=======
	private Connection conn = null;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pwd = "soft";
<<<<<<< HEAD

	AsVO asVO;
	AscurrentVO acvo;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	ArrayList list, asnlist;

	public ASDAO() throws Exception {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pwd);
	}

	// as 신청
	public int asappInsert(AscurrentVO acvo) throws Exception {
		// 시퀀스번호 생성
		String sql2 = "select as_seq.nextval from dual";

		int num = 0;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql2);

		if (rs.next()) {
			num = rs.getInt(1);
		}

		// 생성한 시퀀스 번호로 인서트
=======
	AsVO asVO;
	AscurrentVO acvo;
	PreparedStatement ps = null;
	java.sql.Statement stmt = null;
	ResultSet rs = null;
	ArrayList list = new ArrayList();
	ArrayList asnlist = new ArrayList();
	public ASDAO() throws Exception

	{
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pwd);

	}

	public int asappInsert(AscurrentVO acvo) throws Exception {
		
		String sql2 = "select as_seq.nextval from dual";
		
		int num = 0;
		stmt = conn.createStatement();
		rs= stmt.executeQuery(sql2);
		
		if (rs.next()) {
			num = rs.getInt(1);
		}
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		String sql = "insert into afterserveice values(?, sysdate,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, num);
		ps.setString(2, acvo.getAssch());
		ps.setInt(3, acvo.getMemcode());
		ps.setString(4, acvo.getMachinename());

		ps.executeUpdate();
		stmt.close();
		rs.close();
		ps.close();
		return num;
	}
<<<<<<< HEAD

	// 서비스 신청 현황 insert
	public void asnow(int afsccode, int asapcode, String ascdate, String ascsname, String ascstel) throws Exception {

		String sql = "insert into afterservicenow values(asnow_seq.nextval,?,?,?,'N',?,?)";

		ps = conn.prepareStatement(sql);

=======
	
	public void asnow(int afsccode, int asapcode, String ascdate, String ascsname, String ascstel) throws Exception{
		
		String sql = "insert into afterservicenow values(asnow_seq.nextval,?,?,?,'N',?,?)";
		
		ps = conn.prepareStatement(sql);
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		ps.setInt(1, afsccode);
		ps.setInt(2, asapcode);
		ps.setString(3, ascdate);
		ps.setString(4, ascsname);
		ps.setString(5, ascstel);
<<<<<<< HEAD

		ps.executeUpdate();

		ps.close();
	}

	//
	public AsVO findAslist(int asNum) throws Exception {

		String sql = "select afsccode, afscname, afscloc, afsctel, url, afsctime, afscprice from afscom where afsccode = "
				+ asNum;

		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		AsVO asVO = new AsVO();
		if (rs.next()) {
			asVO.setAfsccode(rs.getInt("afsccode"));
			asVO.setAfscname(rs.getString("afscname"));
			asVO.setAfscloc(rs.getString("afscloc"));
			asVO.setAfsctel(rs.getString("afsctel"));
			asVO.setURL(rs.getString("url"));
			asVO.setAfsctime(rs.getString("afsctime"));
			asVO.setAfscprice(rs.getString("afscprice"));
		}
		return asVO;

	}

	// 지역별 업체 리스트
=======
		
		ps.executeUpdate();
		
		ps.close();
	}

	

	public AsVO findByAsVO(String asloc) throws Exception {

		String sql = "select afsccode,afscname, afscloc, afsctel, URL, afsctime, afscprice from afscom "
				+ "where afscloc = " + asloc;
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		AsVO asvo = new AsVO();
		
		if (rs.next()) {
			asvo.setAfsccode(rs.getInt("afsccode"));
			asvo.setAfscname(rs.getString("afscname"));
			asvo.setAfscloc(rs.getString("afscloc"));
			asvo.setAfsctel(rs.getString("afsctel"));
			asvo.setURL(rs.getString("URL"));
			asvo.setAfsctime(rs.getString("afsctime"));
			asvo.setAfscprice(rs.getString("afscprice"));

		}
		rs.close();
		stmt.close();
		return asvo;
	}

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	public ArrayList AscomSearch(String str) throws Exception {

		list = new ArrayList();

		String sql = " select afsccode , afscname, afscloc, afsctel, url, afsctime, afscprice from afscom where afscloc = '"
				+ str + "'";

		stmt = conn.createStatement();
<<<<<<< HEAD
		rs = stmt.executeQuery(sql);
=======
		ResultSet rs = stmt.executeQuery(sql);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

		while (rs.next()) {
			ArrayList tem = new ArrayList();
			tem.add(rs.getInt("afsccode"));
			tem.add(rs.getString("afscname"));
			tem.add(rs.getString("afscloc"));
			tem.add(rs.getString("afsctel"));
			tem.add(rs.getString("url"));
			tem.add(rs.getString("afsctime"));
			tem.add(rs.getString("afscprice"));

			list.add(tem);
<<<<<<< HEAD
=======
			System.out.println(list);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		}
		rs.close();
		stmt.close();
		return list;
	}

<<<<<<< HEAD
	// 회원별 as 신청 현황
	public ArrayList asnList(int anNum) throws Exception {

		asnlist = new ArrayList();
		String sql = " select a.ascscode, a.afsccode, a.asapcode, to_char(a.ascsdate,'yy/MM/dd'), a.ascsconfirm, a.ascsname, a.ascstel from afterservicenow a, member b, afterserveice c where b.memcode = c.memcode and c.asapcode = a.asapcode and c.memcode = '"
				+ anNum + "'";
		asnlist = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
=======
	public ArrayList asnList(String anNum) throws Exception {
		asnlist = new ArrayList();
		String sql = " select a.ascscode, a.afsccode, a.asapcode, a.ascsdate, a.ascsconfirm, a.ascsname, a.ascstel from afterservicenow a, member b, afterserveice c where b.memcode = c.memcode and c.asapcode = a.asapcode and c.memcode = '" + anNum + "'" ;
		asnlist = new ArrayList();
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		while (rs.next()) {
			ArrayList temp = new ArrayList();
			temp.add(rs.getInt("ascscode"));
			temp.add(rs.getInt("afsccode"));
			temp.add(rs.getInt("asapcode"));
<<<<<<< HEAD
			temp.add(rs.getString(4));
			temp.add(rs.getString("ascsconfirm"));
			temp.add(rs.getString("ascsname"));
			temp.add(rs.getString("ascstel"));

=======
			temp.add(rs.getString("ascsdate"));
			temp.add(rs.getString("ascsconfirm"));
			temp.add(rs.getString("ascsname"));
			temp.add(rs.getString("ascstel"));
			
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			asnlist.add(temp);

		}
		rs.close();
		stmt.close();
		return asnlist;

	}

<<<<<<< HEAD
	// as 신청 현황에서 삭제
	public void asNowCancel(int ascode) throws Exception {
		String sql = "delete from afterservicenow where ASCSCODE = " + ascode;
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
	}

	// as 신청에서 삭제
	public void asCancel(int asapcode) throws Exception {
		String sql = "delete from afterserveice where asapcode = " + asapcode;
		ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
	}

	// 취소 가능 여부
	public boolean isPossible(int ascode) throws Exception {
		boolean possible = true;
		String sql = "select to_char(ascsdate) from afterservicenow where ASCSCODE =" + ascode;

		Date todayfm = new Date(System.currentTimeMillis());

		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		String lastStr = "";
		SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");

		if (rs.next()) {
			lastStr = rs.getString(1);
		}
		try {
			Date last = format.parse(lastStr);

			if (last.before(todayfm)) {
				possible = false;
			} else if (last.after(todayfm)) {
				possible = true;
			} else if (last.equals(todayfm)) {
				possible = false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return possible;
	}
}
=======

	public AsVO findAslist(int asNum) throws Exception {
		
		String sql = "select afsccode, afscname, afscloc, afsctel, url, afsctime, afscprice from afscom where afsccode = " + asNum;
		
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		AsVO asVO = new AsVO();
		if (rs.next()) {
			asVO.setAfsccode(rs.getInt("afsccode"));
			asVO.setAfscname(rs.getString("afscname"));
			asVO.setAfscloc(rs.getString("afscloc"));
			asVO.setAfsctel(rs.getString("afsctel"));
			asVO.setURL(rs.getString("url"));
			asVO.setAfsctime(rs.getString("afsctime"));
			asVO.setAfscprice(rs.getString("afscprice"));
		}
		return asVO;

}
	public AsnowVO findAsnowlist(String anNum) throws Exception{
		
		String sql = "select ascscode, afsccode, asapcode, ascsdate, ascsconfirm, ascsname, ascstel from afterservicenow where afsccode = " + anNum;
		
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		AsnowVO anvo = new AsnowVO();
		if (rs.next()) {
			anvo.setAscscode(rs.getInt("ascscode"));
			anvo.setAfsccode(rs.getInt("afsccode"));
			anvo.setAsapcode(rs.getInt("asapcode"));
			anvo.setAscsdate(rs.getString("ascsdate"));
			anvo.setAscsconfirm(rs.getString("ascsconfirm"));
			anvo.setAscsname(rs.getString("ascsname"));
			anvo.setAscstel(rs.getString("ascstel"));
		}
		return anvo;
		
	}
}

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.rec.AsVO;
import model.rec.AscurrentVO;
import model.rec.CareVO;

public class CareDAO {
	private Connection conn;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pwd = "soft";

	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	CareVO vo;
	ArrayList list;

	public CareDAO() throws Exception {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pwd);
=======
import java.util.ArrayList;

import model.rec.CareVO;

public class CareDAO {
	private Connection conn = null;
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pass = "soft";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	PreparedStatement ps = null;
	Statement stmt = null;
	ResultSet rs = null;
	CareVO vo = null;
	ArrayList list = null;

	public CareDAO() throws Exception {
		/*
		 * ============================================ ������ �Լ� - DB ���� 1. ����̹��� �ε� 2.
		 * Connection ������
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pass);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	}

	// ���� ��û
	public void careInsert(CareVO vo) throws Exception {
		String sql = "insert into careservice (cscode, csstartdate, cslastdate, memcode, cgcode, csdate)"
				+ "values(cares_seq.nextval, ?, ?, ?, ?, sysdate)";
		ps = conn.prepareStatement(sql);

		ps.setString(1, vo.getCsstartdate());
		ps.setString(2, vo.getCslastdate());
		ps.setInt(3, vo.getMemcode());
		ps.setInt(4, vo.getCgcode());

		ps.executeUpdate();
<<<<<<< HEAD
		ps.close();
	}

	// ���� �߰��� ����Ҷ� �������� ���Ϸ�
	public int CareModify(int cscode) throws Exception {
		String sql = "update careservice set cslastdate = sysdate where cscode = " + cscode;
		ps = conn.prepareStatement(sql);

		int count = ps.executeUpdate();

		ps.close();
		return count;
	}

	// ������ ���� �˻�
	public CareVO findByCgcode(int vNum) throws Exception {
		String sql = "select cgcode, cgname, cgcom, cgtel, sfcode" + " where cgcode = " + vNum;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
=======

	}

	   public int CareModify(int cscode) throws Exception
	   {
		   String sql = "update careservice set cslastdate = sysdate where cscode = "+cscode;
		   ps = conn.prepareStatement(sql);
		   
		   int count = ps.executeUpdate();
		   
		   ps.close();
		   return count;
	   }
	   
	public CareVO findByCgcode(int vNum) throws Exception {
		String sql = "select cgcode, cgname, cgcom, cgtel, sfcode" + " where cgcode = " + vNum;
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

		vo = new CareVO();
		if (rs.next()) {
			vo.setCgcode(rs.getInt("cgcode"));
			vo.setCgname(rs.getString("cgname"));
			vo.setCgcom(rs.getString("cgcom"));
			vo.setCgtel(rs.getString("cgtel"));
			vo.setSfcode(rs.getInt("sfcode"));
		}
		rs.close();
		stmt.close();
		return vo;
	}

<<<<<<< HEAD
	// ȸ���� �������� ��û ��Ȳ
	public ArrayList findByCscode(int vnum) throws Exception {
		String sql = "select cscode, to_char(csstartdate, 'yy/MM/dd'), to_char(cslastdate, 'yy/MM/dd'), memcode, cgcode, to_char(csdate,'yy/MM/dd') from careservice"
				+ " where memcode = " + vnum;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

=======
	public ArrayList findByCscode(int vnum) throws Exception {
		String sql = "select cscode, csstartdate, cslastdate, memcode, cgcode, csdate from careservice"
				+ " where memcode = " + vnum;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		list = new ArrayList();
		while (rs.next()) {
			ArrayList temp = new ArrayList();
			temp.add(rs.getInt("cscode"));
<<<<<<< HEAD
			temp.add(rs.getString(2));
			temp.add(rs.getString(3));
			temp.add(rs.getInt("memcode"));
			temp.add(rs.getInt("cgcode"));
			temp.add(rs.getString(6));
			list.add(temp);
		}
		rs.close();
		stmt.close();

=======
			temp.add(rs.getString("csstartdate"));
			temp.add(rs.getString("cslastdate"));
			temp.add(rs.getInt("memcode"));
			temp.add(rs.getInt("cgcode"));
			temp.add(rs.getString("csdate"));
			list.add(temp);
		}
		System.out.println("���� VO�� ���� �������?"+ list);
		rs.close();
		stmt.close();
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		return list;
	}

	// ������ ������ ����
	public ArrayList CareSearch(int care_loc) throws Exception {
		String index[] = { "'����'", "'����'", "'�λ�'", "'���'", "'����'" };
		String sql = "select cgcode, cgname, cgcom, cgtel, sfcode, care_loc from caregiver" + " where care_loc = "
				+ index[care_loc];
		list = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			ArrayList tmp = new ArrayList();
			tmp.add(rs.getInt("cgcode"));
			tmp.add(rs.getString("cgname"));
			tmp.add(rs.getString("cgcom"));
			tmp.add(rs.getString("cgtel"));
			tmp.add(rs.getInt("sfcode"));
			tmp.add(rs.getString("care_loc"));

			list.add(tmp);
		}
<<<<<<< HEAD
		rs.close();
		stmt.close();
=======
		stmt.close();
		rs.close();
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		return list;

	}

<<<<<<< HEAD
	// ���� �������� �˾ƺ���
	public boolean isPossible(int cscode) throws Exception {
		boolean possible = true;
		Date last = null;
		String sql = "select CSLASTDATE from careservice where cscode =" + cscode;
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		if (rs.next()) {
			last = rs.getDate(1);
		}
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yy/MM/dd");
		String todayfm = simpleFormat.format(new Date(System.currentTimeMillis()));
		Date today = new Date(simpleFormat.parse(todayfm).getTime());
		System.out.println("last");

		if (today.before(last)) {
			possible = true;
		} else if (today.after(last)) {
			possible = false;
		} else if (today.equals(last)) {
			possible = false;
		}
		rs.close();
		stmt.close();
		System.out.println(possible);
		return possible;
	}

	// ���� ���۾��� �������� �˾ƺ��� false�� ��û����
	public boolean isStarted(int cscode) throws Exception {
		boolean possible = true;
		String sql = "select csstartdate from careservice where cscode = " + cscode;
		Date startDay = null;
		Date todayfm = new Date(System.currentTimeMillis());
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		if (rs.next()) {
			startDay = rs.getDate(1);
		}

		if (startDay.before(todayfm)) {
			possible = true;
		} else if (startDay.after(todayfm)) {
			possible = false;
		} else if (startDay.equals(todayfm)) {
			possible = false;
		}

		return possible;

	}

	// ���� ���� ���� �����ϱ�
	public void careCancl(int cscode) throws Exception {
		String sql = "delete from careservice where cscode = " + cscode;

		ps = conn.prepareStatement(sql);

		ps.executeUpdate();

		ps.close();
	}
=======
	public ArrayList ServiceSearch(int cscode) throws Exception {

		String sql = "select cscode, csstartdate, cslastdate, memcode, cgcode, csdate from careservice"
				+ " where cscode = " + cscode;
		list = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		if (rs.next()) {
			ArrayList tmp = new ArrayList();
			tmp.add(rs.getInt("cscode"));
			tmp.add(rs.getString("csstartdate"));
			tmp.add(rs.getString("cslastdate"));
			tmp.add(rs.getInt("memcode"));
			tmp.add(rs.getInt("cgcode"));
			tmp.add(rs.getString("csdate"));

			list.add(tmp);
		}
		stmt.close();
		rs.close();
		return list;
	}

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

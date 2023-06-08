package model;

import java.sql.*;
import java.util.ArrayList;

import model.rec.OrderVO;

public class OrderDAO {
<<<<<<< HEAD
	// DB����
	private Connection conn;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pwd = "soft";

	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	OrderVO vo;
	ArrayList list;

	public OrderDAO() throws Exception {
		// TODO Auto-generated constructor stub
		Class.forName(driver);
		conn = DriverManager.getConnection(url, id, pwd);
	}

	// �ⱸ �ֹ���ȣ �����ϱ�
	public int mNum() throws Exception {
=======
	// �ֹ������� �ֹ� �󼼶� �ֹ����̺� insert�ؾ��ϴϱ� �� ���̺� �� �ʿ�
	int mocode, memcode, paynum, shopcode, amscode;
	String modate,mototalprice, modeliver,mototal, shopquantity;
	
	// DB����
	private Connection conn = null;
	private String url = "jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String id = "soft";
	private String pw = "soft";
	PreparedStatement ps = null;
	Statement stmt = null;
	ResultSet rs= null;
	OrderVO vo = null;
	ArrayList list = null;
	
	public OrderDAO() throws Exception{
		// TODO Auto-generated constructor stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
	}
	
	// �ⱸ �ֹ���ȣ �����ϱ�
	public int mNum() throws Exception{
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		String sql = "select morder_seq.nextval from dual";
		int mNum = 0;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
<<<<<<< HEAD

		if (rs.next()) {
=======
		
		if(rs.next()) {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			mNum = rs.getInt(1);
		}
		String sql2 = "insert into machineorder (mocode)values(?)";
		ps = conn.prepareStatement(sql2);
		ps.setInt(1, mNum);
		ps.executeUpdate();
		stmt.close();
		rs.close();
		ps.close();
		return mNum;
	}
<<<<<<< HEAD

	// �Ҹ�ǰ �ֹ���ȣ �����ϱ�
	public int aNum() throws Exception {
=======
	// �Ҹ�ǰ �ֹ���ȣ �����ϱ�
	public int aNum() throws Exception{
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		String sql = "select somo_seq.nextval from dual";
		int aNum = 0;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
<<<<<<< HEAD

		if (rs.next()) {
=======
		
		if(rs.next()) {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			aNum = rs.getInt(1);
		}
		String sql2 = "insert into somo (scode)values(?)";
		ps = conn.prepareStatement(sql2);
		ps.setInt(1, aNum);
		ps.executeUpdate();
		stmt.close();
		rs.close();
		ps.close();
		return aNum;
	}
<<<<<<< HEAD

	// �ⱸ �ֹ��� insert
	public void mOrder(int memcode, int mocode, int paynum, int total, int totPrice) throws Exception {
		String totalQuantity = String.valueOf(total);
		String totalPrice = String.valueOf(totPrice);
		String sql = "update machineorder set modate = sysdate, mototalprice = ?, modeliver = 'N',"
				+ "memcode = ?, paynum =?, mototal=? where mocode = " + mocode;

=======
	
	//�ⱸ �ֹ��� insert
	public void mOrder(int memcode, int mocode, int paynum, int total, int totPrice) throws Exception{
		String totalQuantity = String.valueOf(total);
		String totalPrice = String.valueOf(totPrice);
		String sql = "update machineorder set modate = sysdate, mototalprice = ?, modeliver = 'N',"
				+"memcode = ?, paynum =?, mototal=? where mocode = "+mocode;
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		ps = conn.prepareStatement(sql);
		ps.setString(1, totalPrice);
		ps.setInt(2, memcode);
		ps.setInt(3, paynum);
		ps.setString(4, totalQuantity);
<<<<<<< HEAD

		ps.executeUpdate();
		ps.close();
	}

	// �Ҹ�ǰ �ֹ��� insert
	public void aOrder(int memcode, int socode, int paynum, int total, int totPrice) throws Exception {
		String totalQuantity = String.valueOf(total);
		String totalPrice = String.valueOf(totPrice);
		String sql = "update somo set sodate = sysdate, sototalprice = ?, sodeliver = 'N', memcode = ?, "
				+ "paynum=?, sototal=? where scode = " + socode;

		ps = conn.prepareStatement(sql);
=======
		
		ps.executeUpdate();
		ps.close();
	}
	
	//�Ҹ�ǰ �ֹ��� insert
	public void aOrder(int memcode, int ocode, int paynum, int total, int totPrice) throws Exception{
		String totalQuantity = String.valueOf(total);
		String totalPrice = String.valueOf(totPrice);
		String sql = "update somo set sodate = sysdate, sototalprice = ?, sodeliver = 'N', memcode = ?, "
				+"paynum=?, sototal=? where scode = "+ocode;
		
		ps = conn.prepareStatement(sql);		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		ps.setString(1, totalPrice);
		ps.setInt(2, memcode);
		ps.setInt(3, paynum);
		ps.setString(4, totalQuantity);
<<<<<<< HEAD

		ps.executeUpdate();
		ps.close();
	}

	// �ⱸ �ֹ� �󼼿� insert
	public void mOrderDesc(OrderVO vo) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into shoppinglist (shopcode, shopquantity, amscode, mocode) "
				+ "values (modesc_seq.nextval, ?,?,?)";
=======
		
		ps.executeUpdate();
		ps.close();
	}
	
	//�ⱸ �ֹ� �󼼿� insert
	public void mOrderDesc(OrderVO vo) throws Exception{
		// TODO Auto-generated method stub
		String sql = "insert into shoppinglist (shopcode, shopquantity, amscode, mocode) "
				+"values (modesc_seq.nextval, ?,?,?)";
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		ps = conn.prepareStatement(sql);
		ps.setString(1, vo.getShopquantity());
		ps.setInt(2, vo.getAmscode());
		ps.setInt(3, vo.getMocode());
<<<<<<< HEAD

		ps.executeUpdate();
		ps.close();
	}

	// �Ҹ�ǰ �ֹ� �� insert
	public void aOrderDesc(OrderVO vo) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into smdesc (sodcode, sodquantity, acscode, scode) " + "values (smdesc_seq.nextval, ?,?,?)";
=======
		
		ps.executeUpdate();
		ps.close();
	}
	// �Ҹ�ǰ �ֹ� �� insert
	public void aOrderDesc(OrderVO vo) throws Exception{
		// TODO Auto-generated method stub
		String sql = "insert into smdesc (sodcode, sodquantity, scode, smcode) "
				+"values (smdesc_seq.nextval, ?,?,?)";
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		ps = conn.prepareStatement(sql);
		ps.setString(1, vo.getShopquantity());
		ps.setInt(2, vo.getAmscode());
		ps.setInt(3, vo.getMocode());
<<<<<<< HEAD

		ps.executeUpdate();
		ps.close();
	}

	// �ⱸ ����Ʈ ���
	public ArrayList machineSearch() throws Exception {
		String sql = "select a.amscode, m.machinename, a.amsnation, a.ascom, a.amsprice, a.amssignificant from am_seller a, machine m where a.machinecode = m.machinecode";

		list = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			ArrayList temp = new ArrayList();

=======
		
		ps.executeUpdate();
		ps.close();		
	}
	
	// �ⱸ ����Ʈ ���
	public ArrayList machineSearch() throws Exception{
		String sql = "select a.amscode, m.machinename, a.amsnation, a.ascom, a.amsprice, a.amssignificant from am_seller a, machine m where a.machinecode = m.machinecode";
		
		list = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			ArrayList temp = new ArrayList();
			
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			temp.add(rs.getInt("amscode"));
			temp.add(rs.getString("machinename"));
			temp.add(rs.getString("amsnation"));
			temp.add(rs.getString("ascom"));
			temp.add(rs.getString("amsprice"));
			temp.add(rs.getString("amssignificant"));
<<<<<<< HEAD

=======
			
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			list.add(temp);
		}
		stmt.close();
		rs.close();
		return list;
	}
<<<<<<< HEAD

	// �Ҹ�ǰ ����Ʈ ���
	public ArrayList somoSearch() throws Exception {
=======
	
	// �Ҹ�ǰ ����Ʈ ���
	public ArrayList somoSearch() throws Exception{
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		String sql = "select a.acscode, ac.acname, a.acsnation, a.acscom, a.acsprice, a.acsexpirationdate from accstore a, accesories ac where a.accode = ac.accode";

		list = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
<<<<<<< HEAD

		while (rs.next()) {
			ArrayList temp = new ArrayList();

=======
		
		while(rs.next()) {
			ArrayList temp = new ArrayList();
			
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			temp.add(rs.getInt("acscode"));
			temp.add(rs.getString("acname"));
			temp.add(rs.getString("acsnation"));
			temp.add(rs.getString("acscom"));
			temp.add(rs.getString("acsprice"));
			temp.add(rs.getString("acsexpirationdate"));
<<<<<<< HEAD

			list.add(temp);
		}

		return list;
	}

	// �ⱸ �˻�
	public ArrayList machineFind(int col, String txt) throws Exception {
		String[] columnName = { "m.machinename", "d.dicode", "d.diname" };
		String sql = "select distinct a.amscode, m.machinename, a.amsnation, a.ascom, a.amsprice, a.amssignificant "
				+ "from am_seller a, machine m, disease d, disease_aids da where a.machinecode = m.machinecode "
				+ "and da.dicode = d.dicode and m.machinecode = da.machinecode and " + columnName[col] + " like '%"
				+ txt + "%' order by 1";

		list = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			ArrayList temp = new ArrayList();

			temp.add(rs.getInt(1));
			temp.add(rs.getString(2));
			temp.add(rs.getString(3));
			temp.add(rs.getString(4));
			temp.add(rs.getString(5));
			temp.add(rs.getString(6));

			list.add(temp);
		}

		return list;
	}

	// �Ҹ�ǰ �˻�
	public ArrayList somoFind(String txt) throws Exception {
		String sql = "select a.acscode, ac.acname, a.acsnation, a.acscom, a.acsprice, a.acsexpirationdate "
				+ "from accstore a, accesories ac " + "where a.accode = ac.accode " + "and ac.acname like '%" + txt
				+ "%'";

		list = new ArrayList();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			ArrayList temp = new ArrayList();

			temp.add(rs.getInt(1));
			temp.add(rs.getString(2));
			temp.add(rs.getString(3));
			temp.add(rs.getString(4));
			temp.add(rs.getString(5));
			temp.add(rs.getString(6));

			list.add(temp);
		}

		return list;
	}

	// �ⱸ �� ���� ��������
	public OrderVO searchMachineAll(int code, String text) throws Exception {
		OrderVO vo = new OrderVO();
		String sql = "select m.machinename, m.method, m.machinecycle, m.machinemanagement, a.amssignificant, a.amsprice, a.mimage "
				+ "from am_seller a, machine m, disease d " + "where a.machinecode = m.machinecode and amscode = "
				+ code + " and machinename = '" + text + "'";

		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		if (rs.next()) {
			vo.setName(rs.getString(1));
			vo.setMethod(rs.getString(2));
			vo.setMachinecycle(rs.getString(3));
			vo.setManagement(rs.getString(4));
			vo.setAmssignificant(rs.getString(5));
			vo.setAmsprice(rs.getString(6));
			vo.setImage(rs.getString(7));
		}
		return vo;
	}

	// �Ҹ�ǰ �� ���� ��������
	public OrderVO searchSomoAll(int code, String text) throws Exception {
		OrderVO vo = new OrderVO();
		String sql = "select a.acname, a.acwarranty, ac.acsexpirationdate, ac.acsprice, ac.simage "
				+ "from accstore ac, accesories a " + "where ac.accode = a.accode and acscode = " + code
				+ " and acname = '" + text + "'";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		if (rs.next()) {
			vo.setAcname(rs.getString(1));
			vo.setAcwarranty(rs.getString(2));
			vo.setAcexp(rs.getString(3));
			vo.setAmsprice(rs.getString(4));
			vo.setImage(rs.getString(5));
		}
		return vo;
	}
=======
			
			list.add(temp);
		}
		
		return list;
	}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

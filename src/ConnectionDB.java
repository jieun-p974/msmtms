

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	private Connection conn = null;
	private String jdbc_url="jdbc:oracle:thin:@192.168.0.84:1521:air3";
	private String db_id = "soft";
	private String db_pwd="soft";
	
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(jdbc_url,db_id,db_pwd);
			System.out.println("���������� �ε��Ǿ���");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("�ش� ����̹��� ã�� �� �����ϴ�.1");
		}
		catch (SQLException se) {
			// TODO: handle exception
			System.out.println("�ش� ����̹��� ã�� �� �����ϴ�.2");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConnectionDB().connect();

	}
}


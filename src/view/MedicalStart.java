package view;
<<<<<<< HEAD

=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import model.Review2Dao;

import java.awt.*;

<<<<<<< HEAD
public class MedicalStart extends JFrame {
=======
public class MedicalStart extends JFrame{
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	OrderView order;
	MyPageView myPage;
	CareView care;
	ConsultView consult;
	AsView as;
	String machine;
	Review2Dao dao;
<<<<<<< HEAD
	ReturnView rtn;

	public MedicalStart(int memCode, String id) {
		setTitle("MSMTMS");
		setFont(new Font("��ü�� ���� ����ü", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Image/image10.png"));
=======
	
	public MedicalStart(int memCode, String id) {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		myPage = new MyPageView(memCode, id);
		order = new OrderView(memCode, id);
		care = new CareView(memCode, id);
		consult = new ConsultView(memCode, id);
<<<<<<< HEAD
		as = new AsView(memCode, id);
		rtn = new ReturnView(memCode, id);

=======
		as = new AsView(memCode, id);		
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("����������", myPage);
		pane.addTab("�ֹ�", order);
		pane.addTab("����", care);
		pane.addTab("���", consult);
<<<<<<< HEAD
		pane.addTab("AS", as);
		pane.addTab("����", rtn);

		getContentPane().add("Center", pane);
		setSize(850, 710);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
=======
		pane.addTab("AS ��û", as);
		
		getContentPane().add("Center", pane);
		setSize(1200, 1000);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new MedicalStart();
//	}

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

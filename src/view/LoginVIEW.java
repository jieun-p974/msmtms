package view;

import java.awt.EventQueue;
<<<<<<< HEAD
=======

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

<<<<<<< HEAD
import model.MemlogDAO;
import model.rec.LoginVO;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class LoginVIEW extends JFrame implements ActionListener {
	private boolean flag = false;
	JFrame frmMsmtms;
	JTextField tfid;
	JPasswordField pfpw;
	JButton btlog, btmemlog;
	JLabel lbBackground, lbID, lbpw, lblog;

	LoginVO vo;
	MemlogDAO mdao;

	ArrayList list;

	public LoginVIEW() {

		try {
			mdao = new MemlogDAO();
=======
import model.LoginDAO;
import model.MemlogDAO;
import model.MyPageDAO;
import model.rec.LoginVO;
import javax.swing.JInternalFrame;

public class LoginVIEW extends JFrame implements ActionListener {
	JTextField tfid;
	JPasswordField pfpw;
	private boolean flag = false;

	LoginVO vo;
	ArrayList list = null;
	LoginDAO ldao;
	MemlogDAO mdao;
	MyPageDAO mpdao;
	MemlogVIEW mv;
	LoginVIEW lv;
	JFrame frame; 
	
	public LoginVIEW() {
		
		try {
			ldao = new LoginDAO();
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			System.out.println("�α���â ���� ����");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "�α���â ���� ���� : " + e.getMessage());
<<<<<<< HEAD
			e.printStackTrace();
		}
		newObject();
		addLayout();
		event();

	}

	void newObject() {
		frmMsmtms = new JFrame();
		lbID = new JLabel("ID");
		lbID.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lbpw = new JLabel("PW");
		lbpw.setFont(new Font("Segoe UI", Font.BOLD, 13));
		tfid = new JTextField();
		lblog = new JLabel("");
		lblog.setFont(new Font("HY�߰��", Font.PLAIN, 20));
		pfpw = new JPasswordField();
		btlog = new JButton("Log in");
		btlog.setFont(new Font("HY�߰��", Font.BOLD, 13));
		btmemlog = new JButton("Sign Up");
		btmemlog.setFont(new Font("HY�߰��", Font.BOLD, 13));
		lbBackground = new JLabel("");
		lbBackground.setIcon(new ImageIcon(LoginVIEW.class.getResource("/Image/11.jpg")));
	}

	void addLayout() {
		getContentPane().setLayout(null);
		frmMsmtms.setResizable(false);
		frmMsmtms.getContentPane().setBackground(new Color(255, 255, 255));
		frmMsmtms.setTitle("MSMTMS");
		frmMsmtms.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Image/150.png"));

		lbID.setBounds(305, 272, 30, 20);
		lbID.setHorizontalAlignment(SwingConstants.CENTER);

		lbpw.setHorizontalAlignment(SwingConstants.CENTER);
		lbpw.setBounds(305, 332, 30, 20);

		tfid.setBounds(362, 272, 160, 20);
		tfid.setColumns(10);

		lblog.setIcon(new ImageIcon(LoginVIEW.class.getResource("/Image/150.png")));
		lblog.setBounds(350, 78, 150, 150);

		pfpw.setBounds(362, 332, 160, 20);

		btlog.setBounds(305, 387, 97, 23);

		btmemlog.setBounds(425, 387, 97, 23);

		frmMsmtms.getContentPane().setLayout(null);
		frmMsmtms.getContentPane().add(btlog);
		frmMsmtms.getContentPane().add(btmemlog);
		frmMsmtms.getContentPane().add(lbpw);
		frmMsmtms.getContentPane().add(lbID);
		frmMsmtms.getContentPane().add(lblog);
		frmMsmtms.getContentPane().add(tfid);
		frmMsmtms.getContentPane().add(pfpw);

		lbBackground.setBounds(0, 0, 866, 513);

		frmMsmtms.getContentPane().add(lbBackground);
		frmMsmtms.setSize(854, 532);
		frmMsmtms.setLocationRelativeTo(null);
		setResizable(false);
		setLocationRelativeTo(null);
	}

	void event() {
		// �α��� ��ư�̺�Ʈ
=======
		}
		frame = new JFrame();
		
		JLabel lbID = new JLabel("ID");
		lbID.setBounds(32, 69, 30, 20);
		lbID.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbpw = new JLabel("PW");
		lbpw.setBounds(32, 129, 30, 20);
		
		tfid = new JTextField();
		tfid.setBounds(121, 69, 160, 20);
		tfid.setColumns(10);
		
		JLabel lblog = new JLabel("\uB85C\uADF8\uC778\uCC3D");
		lblog.setBounds(141, 25, 80, 34);
		lblog.setFont(new Font("HY�߰��", Font.PLAIN, 20));
		
		pfpw = new JPasswordField();
		pfpw.setBounds(121, 129, 160, 20);
		
		JButton btlog = new JButton("�α���");
		btlog.setBounds(83, 267, 97, 23);
		
		JButton btmemlog = new JButton("ȸ������");
		btmemlog.setBounds(230, 267, 97, 23);
		getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btlog);
		frame.getContentPane().add(btmemlog);
		frame.getContentPane().add(lbpw);
		frame.getContentPane().add(lbID);
		frame.getContentPane().add(lblog);
		frame.getContentPane().add(tfid);
		frame.getContentPane().add(pfpw);
		frame.setSize(500,500);
		setResizable(false);
		setLocationRelativeTo(null);

	
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		btlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfid.getText();
				String pw = pfpw.getText();
<<<<<<< HEAD

				try {
					int code = mdao.Login(id, pw);
					if (tfid.getText().length() == 0 || pfpw.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "ID, PWĭ�� Ȯ�����ּ���!");
					} else if (code == 0) {
						JOptionPane.showMessageDialog(null, "ID, PW�� Ȯ�����ּ���!");
					} else {
						JOptionPane.showMessageDialog(null, "" + id + "�� ȯ���մϴ�!");

						frmMsmtms.setVisible(false);
						new MedicalStart(code, id);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, " �α��� ���� : " + ex.getMessage());
					ex.printStackTrace();
				}

			}
		});

		// ȸ������ ��ư�̺�Ʈ
		btmemlog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frmMsmtms.dispose(); // ���� ȭ�� �ݱ�
				MemlogVIEW view = new MemlogVIEW(); // ȸ������ ȭ�� ��ü ����
				view.setVisible(true);
			}

		});
	}

=======
				
				try {
					int code = ldao.Login(id, pw);				
				
					if(code == 0){ 								
						JOptionPane.showMessageDialog(null, "ID, PW�� Ȯ�����ּ���!");
					} else {
						JOptionPane.showMessageDialog(null,""+ id +"�� ȯ���մϴ�!");
						frame.setVisible(false); 				
//						new LoginView(code);	
						new MedicalStart(code, id);
						
					}
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, " �α��� ���� : " + ex.getMessage());
				}
				
			}
		});

		btmemlog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // ���� ȭ�� �ݱ�
                MemlogVIEW view = new MemlogVIEW(); // ȸ������ ȭ�� ��ü ����
                view.setVisible(true);
			}

		
		});
//		initialize();
	}
	
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	public class JTextFieldLimit extends PlainDocument {
		private int limit;
		private boolean toUppercase = false;

		JTextFieldLimit(int limit) {
			super();
			this.limit = limit;
		}

		JTextFieldLimit(int limit, boolean upper) {
			super();
			this.limit = limit;
			this.toUppercase = upper;
		}

		public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
			if (str == null) {
				return;
			}

			if ((getLength() + str.length()) <= limit) {
				if (toUppercase) {
					str = str.toUpperCase();
				}
				super.insertString(offset, str, (javax.swing.text.AttributeSet) attr);
			}
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginVIEW window = new LoginVIEW();
<<<<<<< HEAD
					window.frmMsmtms.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

=======
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
				}
			}
		});
	}

<<<<<<< HEAD
=======


	public void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub
		
	}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
<<<<<<< HEAD
=======



>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

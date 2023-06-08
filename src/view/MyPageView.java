package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import model.LoginDAO;
import model.MemlogDAO;
import model.MyPageDAO;
import model.rec.LoginVO;
import model.rec.MemlogVO;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
<<<<<<< HEAD
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyPageView extends JPanel {

	JFrame frame;
	JTextField tfpw, tfaddr, tftel, tfemr, tfname, tfid, tfju;
	JButton btchinfo, btlogout;
	JComboBox cbob;
	JLabel lbid, lbju, lbmypage, lbpw, lbaddr, lbob, lbname, lbemr, lbtel, lbBackground;
	JTable motable, sotable;
	JScrollPane machineScrollPane, somoScrollPane;
	
	ShoppingListTableModel tmShop;
	SomoListTableModel tmSomo;
	
=======

public class MyPageView extends JPanel {

	private JFrame frame;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	LoginDAO ldao;
	MemlogDAO mdao;
	MyPageDAO mpdao;
	MemlogVO mvo;
	LoginVO lvo;
<<<<<<< HEAD
	
	int memCode;
	ArrayList list, somoList;
 
	public MyPageView(int memCode, String id) {
		setBackground(new Color(255, 255, 255));
=======
	JTextField tfpw, tfaddr, tftel, tfemr, tfname, tfid, tfju;
	JButton btchinfo, btlogout;
	JComboBox cbob;
	JLabel lbid, lbju, lbmypage, lbpw, lbaddr,lbob, lbname, lbemr, lbtel;
	JTable table;
	ShoppingListTableModel tmShop;
	ArrayList list;
	int memCode;
	/**
	 * Create the application.
	 */
	public MyPageView(int memCode, String id) {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		this.memCode = memCode;
		try {
			ldao = new LoginDAO();
			mdao = new MemlogDAO();
			mpdao = new MyPageDAO();
<<<<<<< HEAD
=======
			System.out.println("로그인창 연결 성공");
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "로그인창 연결 실패 : " + e.getMessage());
		}
		newObject();
<<<<<<< HEAD
		addLayout(memCode);
		eventProc();
		mvo = new MemlogVO();
		try {
			// 회원 개인정보 출력
			mvo = mdao.info(memCode);
			// 기구 쇼핑 리스트
			list = mpdao.myShoppinglist(memCode);
			tmShop.data = list;
			motable.setModel(tmShop);
			motable.getColumnModel().getColumn(0).setResizable(false);
			motable.getColumnModel().getColumn(0).setPreferredWidth(100);
			motable.getColumnModel().getColumn(4).setResizable(false);
			motable.getColumnModel().getColumn(4).setPreferredWidth(100);
			// 소모품 쇼핑 리스트
			somoList = mpdao.mySomoList(memCode);
			tmSomo.data = somoList;
			
			sotable.setModel(tmSomo);
			sotable.getColumnModel().getColumn(1).setResizable(false);
			sotable.getColumnModel().getColumn(0).setPreferredWidth(100);
			sotable.getColumnModel().getColumn(4).setResizable(false);
			sotable.getColumnModel().getColumn(4).setPreferredWidth(80);
=======
		initialize(memCode);
		eventProc();
		mvo= new MemlogVO();
		try {
			mvo = mdao.info(memCode);
			list = mpdao.myShoppinglist(memCode);
			System.out.println("쇼핑리스트"+list);
			tmShop.data = list;
			table.setModel(tmShop);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		tfid.setText(mvo.getID());
		tfpw.setText(mvo.getPW());
		tfaddr.setText(mvo.getMemaddr());
		tftel.setText(mvo.getMemtel());
		tfemr.setText(mvo.getMememr());
		tfname.setText(mvo.getMemname());
		tfju.setText(mvo.getMemjuban());
		cbob.setSelectedItem(mvo.getMemobstacle());
<<<<<<< HEAD
=======

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	}

	void newObject() {
		tfpw = new JTextField();
<<<<<<< HEAD
		tfpw.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		tfaddr = new JTextField();
		tfaddr.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		tftel = new JTextField();
		tftel.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		tfemr = new JTextField();
		tfemr.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		tfname = new JTextField();
		tfname.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		tfid = new JTextField();
		tfid.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		tfju = new JTextField();
		tfju.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		cbob = new JComboBox();
		cbob.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		machineScrollPane = new JScrollPane();
		motable = new JTable(tmShop);
		motable.setFont(new Font("돋움", Font.PLAIN, 12));
		somoScrollPane = new JScrollPane();
		sotable = new JTable(tmSomo);
		sotable.setFont(new Font("돋움", Font.PLAIN, 12));
		lbid = new JLabel("ID");
		lbid.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbju = new JLabel("\uC8FC\uBBFC \uBC88\uD638");
		lbju.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		btchinfo = new JButton("\uC815\uBCF4 \uC218\uC815");
		btchinfo.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		btlogout = new JButton("LogOut");
		btlogout.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		tmShop = new ShoppingListTableModel();
		tmSomo = new SomoListTableModel();
		lbBackground = new JLabel("");
		lbBackground.setIcon(new ImageIcon("src/Image/pexels-codioful-(formerly-gradienta)-7130555.jpg"));
		lbmypage = new JLabel("MyPage");
		lbmypage.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		lbpw = new JLabel("비밀번호");
		lbpw.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbaddr = new JLabel("주소");
		lbaddr.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbtel = new JLabel("연락처");
		lbtel.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbemr = new JLabel("비상 연락처");
		lbemr.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbname = new JLabel("이름");
		lbname.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbob = new JLabel("장애 등급");
		lbob.setFont(new Font("HY견고딕", Font.PLAIN, 12));
	}

	void addLayout(int memCode) {
		setLayout(null);

		btchinfo.setLocation(115, 590);
		btchinfo.setSize(149, 30);
		add(btchinfo);
		lbmypage.setBounds(12, 10, 99, 35);
		add(lbmypage);
		btlogout.setBounds(707, 39, 90, 30);
		add(btlogout);
		tfpw.setBounds(144, 251, 120, 30);
		tfpw.setColumns(10);
		add(tfpw);
		tfaddr.setBounds(144, 311, 120, 30);
		tfaddr.setColumns(10);
		add(tfaddr);
		tftel.setBounds(144, 371, 120, 30);
		tftel.setColumns(10);
		add(tftel);
		tfemr.setBounds(144, 431, 120, 30);
		tfemr.setColumns(10);
		add(tfemr);
		lbpw.setBounds(33, 251, 64, 30);
		add(lbpw);
		lbaddr.setBounds(33, 311, 55, 30);
		add(lbaddr);
		lbtel.setBounds(33, 371, 50, 30);
		add(lbtel);
		lbemr.setBounds(33, 431, 110, 30);
		add(lbemr);
		lbname.setBounds(33, 191, 40, 30);
		add(lbname);
		tfname.setBounds(144, 191, 120, 30);
		tfname.setColumns(10);
		add(tfname);
		lbob.setBounds(33, 491, 78, 30);
		add(lbob);
		lbid.setBounds(31, 71, 40, 30);
		add(lbid);
		cbob.setBounds(144, 491, 120, 30);
		cbob.setModel(new DefaultComboBoxModel(new String[] { "5급", "4급", "3급", "2급", "1급" }));
		cbob.setMaximumRowCount(5);
		add(cbob);
		lbju.setBounds(31, 131, 80, 30);
		add(lbju);
		tfid.setBounds(142, 71, 120, 30);
		tfid.setEditable(false);
		tfid.setColumns(10);
		add(tfid);
		tfju.setBounds(144, 131, 120, 30);
		tfju.setEditable(false);
		tfju.setColumns(10);
		add(tfju);

		
		machineScrollPane.setBounds(347, 92, 450, 230);
		add(machineScrollPane);
		motable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"상세주문코드", "기구명", "주문수량", "결제금액", "주문일자", "배송현황"
			}
		));
		motable.getColumnModel().getColumn(0).setResizable(false);
		motable.getColumnModel().getColumn(0).setPreferredWidth(100);
		motable.getColumnModel().getColumn(1).setResizable(false);
		motable.getColumnModel().getColumn(2).setResizable(false);
		motable.getColumnModel().getColumn(3).setResizable(false);
		motable.getColumnModel().getColumn(4).setResizable(false);
		motable.getColumnModel().getColumn(4).setPreferredWidth(100);
		motable.getColumnModel().getColumn(5).setResizable(false);
		machineScrollPane.setViewportView(motable);

		somoScrollPane.setBounds(347, 362, 450, 230);
		add(somoScrollPane);

		sotable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"상세주문코드", "소모품명", "주문수량", "결제금액", "주문일자", "배송현황"
			}
		));
		sotable.getColumnModel().getColumn(1).setResizable(false);
		sotable.getColumnModel().getColumn(0).setPreferredWidth(100);
		sotable.getColumnModel().getColumn(2).setResizable(false);
		sotable.getColumnModel().getColumn(3).setResizable(false);
		sotable.getColumnModel().getColumn(4).setResizable(false);
		sotable.getColumnModel().getColumn(4).setPreferredWidth(100);
		sotable.getColumnModel().getColumn(5).setResizable(false);
		somoScrollPane.setViewportView(sotable);
		
		lbBackground.setBounds(0, 55, 304, 600);
		add(lbBackground);
	}

=======
		tfaddr = new JTextField();
		tftel = new JTextField();
		tfemr = new JTextField();
		tfname = new JTextField();
		tfid = new JTextField();
		tfju = new JTextField();
		cbob = new JComboBox();
		table = new JTable(tmShop);
		lbid = new JLabel("아이디");
		lbju = new JLabel("주민번호");
		btchinfo = new JButton("회원정보 수정");
		btlogout = new JButton("로그아웃");
		tmShop = new ShoppingListTableModel();
	}
	
	void initialize(int memCode) {
		setLayout(null);
		
		btchinfo.setLocation(105, 620);
		btchinfo.setSize(120, 30);
		add(btchinfo);
		lbmypage = new JLabel("마이페이지");
		lbmypage.setBounds(40, 30, 140, 35);
		lbmypage.setFont(new Font("HY견고딕", Font.BOLD, 24));
		lbmypage.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbmypage);
		btlogout.setBounds(706, 95, 90, 30);
		add(btlogout);
		tfpw.setBounds(172, 310, 120, 30);
		tfpw.setColumns(10);
		add(tfpw);
		tfaddr.setBounds(172, 370, 120, 30);
		tfaddr.setColumns(10);
		add(tfaddr);
		tftel.setBounds(172, 430, 120, 30);
		tftel.setColumns(10);
		add(tftel);
		tfemr.setBounds(172, 490, 120, 30);
		tfemr.setColumns(10);
		add(tfemr);
		lbpw = new JLabel("비밀번호");
		lbpw.setBounds(37, 310, 55, 30);
		add(lbpw);
		lbaddr = new JLabel("주소");
		lbaddr.setBounds(37, 370, 25, 30);
		add(lbaddr);
		lbtel = new JLabel("전화번호");
		lbtel.setBounds(37, 430, 50, 30);
		add(lbtel);
		lbemr = new JLabel("비상연락처");
		lbemr.setBounds(37, 490, 90, 30);
		add(lbemr);
		lbname = new JLabel("이름");
		lbname.setBounds(37, 250, 25, 30);
		add(lbname);
		tfname.setBounds(172, 250, 120, 30);
		tfname.setColumns(10);
		add(tfname);
		lbob = new JLabel("장애등급");
		lbob.setBounds(37, 550, 50, 30);
		add(lbob);
		lbid.setBounds(35, 130, 40, 30);
		add(lbid);
		cbob.setBounds(172, 550, 120, 30);
		cbob.setModel(new DefaultComboBoxModel(
				new String[] { "5등급", "4등급", "3등급", "2등급", "1등급" }));
		cbob.setMaximumRowCount(5);
		add(cbob);
		lbju.setBounds(35, 190, 55, 30);
		add(lbju);
		tfid.setBounds(170, 130, 120, 30);
		tfid.setEditable(false);
		tfid.setColumns(10);
		add(tfid);
		tfju.setBounds(172, 190, 120, 30);
		tfju.setEditable(false);
		tfju.setColumns(10);
		add(tfju);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(344, 135, 452, 445);
		add(scrollPane);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "상세주문코드","기구명", "주문수량","결제금액","주문일자","배송현황" }));
		scrollPane.setViewportView(table);
	}
	
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	void eventProc() {
		btchinfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				try {

					while (true) {

						if (tfpw.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "바꿀 비밀번호를 입력해주세요");
							break;
						} else if (tfaddr.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "바꿀 주소를 입력해주세요");
							break;
						} else if (tftel.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, " 바꿀 연락처를 입력해주세요");
							break;
						} else if (tfemr.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "바꿀 비상연락처를 입력해주세요");
							break;
						} else if (tfname.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "바꿀 이름을 입력해주세요");
							break;
						} else {
							mvo.setPW(tfpw.getText());
							mvo.setMemaddr(tfaddr.getText());
							mvo.setMemtel(tftel.getText());
							mvo.setMememr(tfemr.getText());
							mvo.setMemname(tfname.getText());
							mvo.setMemobstacle(cbob.getSelectedItem());
							mdao.updateInfo(mvo);
							JOptionPane.showMessageDialog(null, "정보수정이 완료되었습니다.");
						}
						break;
					}

				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "정보수정이 되지 않았습니다.");
				}
			}

=======
				String ob[] = { "5등급", "4등급", "3등급", "2등급", "1등급" };
				String pw = tfpw.getText();
				String addr = tfaddr.getText();
				String tel = tftel.getText();
				String emr = tfemr.getText();
				String name = tfname.getText();
				Object chob = cbob.getSelectedItem();
//				cbob = new JComboBox<String>(ob);
			}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		});

		btlogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				System.exit(0);
			}
		});
		// 주문한 물건 클릭하면 리뷰 등록창 뜨게
		motable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int col = 1;
				int col2 = 0;
				int row = motable.getSelectedRow();
				String mName = String.valueOf(motable.getValueAt(row, col));
				int desc = Integer.parseInt(String.valueOf(motable.getValueAt(row, col2)));
=======
			}
		});
		// 주문한 물건 클릭하면 리뷰 등록창 뜨게
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int col = 1;
				int col2 = 0; 
				int row = table.getSelectedRow();
				String mName = String.valueOf(table.getValueAt(row, col));
				int desc = Integer.parseInt(String.valueOf(table.getValueAt(row, col2)));
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
				Review2 rv = new Review2(memCode, mName, desc);
				rv.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				rv.setVisible(true);
			}
		});
	}
<<<<<<< HEAD

	// 기구 주문 내역 테이블 모델
	class ShoppingListTableModel extends AbstractTableModel {
		ArrayList data = new ArrayList();
		String[] columnNames = { "상세주문코드", "기구명", "주문수량", "결제금액", "주문일자", "배송현황" };

=======
	class ShoppingListTableModel extends AbstractTableModel{
		ArrayList data = new ArrayList();
		String[] columnNames = {"상세주문코드","기구명", "주문수량","결제금액","주문일자","배송현황"};
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return data.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return columnNames.length;
		}

		@Override
		public Object getValueAt(int row, int col) {
			ArrayList temp = (ArrayList) data.get(row);
			return temp.get(col);
		}
<<<<<<< HEAD

		public String getColumnName(int col) {
			return columnNames[col];
		}
	}
	// 소모 주문 내역 테이블 모델
	class SomoListTableModel extends AbstractTableModel {
		ArrayList data = new ArrayList();
		String[] columnNames = { "상세주문코드", "소모품명", "주문수량", "결제금액", "주문일자", "배송현황" };

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return data.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return columnNames.length;
		}

		@Override
		public Object getValueAt(int row, int col) {
			ArrayList temp = (ArrayList) data.get(row);
			return temp.get(col);
		}

=======
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		public String getColumnName(int col) {
			return columnNames[col];
		}
	}
}

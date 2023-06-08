package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

<<<<<<< HEAD
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
=======
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

<<<<<<< HEAD
import model.MemlogDAO;
import model.rec.LoginVO;
import model.rec.MemlogVO;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
=======
import model.LoginDAO;
import model.MemlogDAO;
import model.MyPageDAO;
import model.rec.LoginVO;
import model.rec.MemlogVO;
import javax.swing.JPasswordField;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

public class MemlogVIEW extends JFrame implements ActionListener {

	JFrame frame;
<<<<<<< HEAD
	JTextField tfid, tftel, tfemr, tfaddr, tfname;
	JButton btdouid, btmemlog, btcancel;
	JComboBox cbob;
	JPasswordField pfpw, pfju;
	JLabel lbBackground, lbTitle, lbid, lbpw, lbtel, lbemr, lbaddr, lbname, lbju, lbob;

	LoginVIEW lv;
	MemlogDAO mdao;
	LoginVO vo;
=======
	JButton btdouid;
	LoginVIEW lv;
	LoginDAO ldao;
	MemlogDAO mdao;
	MyPageDAO mpdao;
	LoginVO vo;
	JTextField tfid;
	private JTextField tftel;
	private JTextField tfemr;
	private JTextField tfaddr;
	private JTextField tfname;
	JButton btmemlog;
	JButton btcancel;
	private JTextField tfob;
	private JPasswordField pfpw;
	private JPasswordField pfju;

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemlogVIEW window = new MemlogVIEW();
<<<<<<< HEAD
=======
//					window.frame.setVisible(true);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

<<<<<<< HEAD
	public MemlogVIEW() {
=======
	/**
	 * Create the application.
	 */
	public MemlogVIEW() {
		getContentPane().setLayout(null);

		JLabel lbmemlog = new JLabel("\uD68C\uC6D0\uAC00\uC785\uCC3D");
		lbmemlog.setFont(new Font("HY견고딕", Font.BOLD, 20));
		lbmemlog.setHorizontalAlignment(SwingConstants.CENTER);
		lbmemlog.setBounds(160, 21, 182, 53);
		getContentPane().add(lbmemlog);

		JLabel lbid = new JLabel("\uC544\uC774\uB514");
		lbid.setBounds(12, 110, 90, 25);
		getContentPane().add(lbid);

		JLabel lbpw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbpw.setBounds(12, 170, 90, 25);
		getContentPane().add(lbpw);

		JLabel lbtel = new JLabel("\uC804\uD654\uBC88\uD638");
		lbtel.setBounds(12, 290, 90, 25);
		getContentPane().add(lbtel);

		JLabel lbemr = new JLabel("\uBE44\uC0C1\uC5F0\uB77D\uCC98");
		lbemr.setBounds(12, 350, 90, 25);
		getContentPane().add(lbemr);

		JLabel lbaddr = new JLabel("\uC8FC\uC18C");
		lbaddr.setBounds(12, 410, 90, 25);
		getContentPane().add(lbaddr);

		JLabel lbname = new JLabel("\uC774\uB984");
		lbname.setBounds(12, 470, 90, 25);
		getContentPane().add(lbname);

		JLabel lbju = new JLabel("\uC8FC\uBBFC\uBC88\uD638");
		lbju.setBounds(12, 530, 90, 25);
		getContentPane().add(lbju);

		JLabel lbob = new JLabel("\uC7A5\uC560\uB4F1\uAE09");
		lbob.setBounds(12, 230, 90, 25);
		getContentPane().add(lbob);

		btdouid = new JButton("\uC911\uBCF5\uD655\uC778");
		btdouid.setBounds(379, 110, 110, 25);
		getContentPane().add(btdouid);

		btmemlog = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btmemlog.setBounds(80, 780, 110, 25);
		getContentPane().add(btmemlog);

		btcancel = new JButton("\uCDE8\uC18C");
		btcancel.setBounds(320, 780, 110, 25);
		getContentPane().add(btcancel);

		tfid = new JTextField();
		tfid.setColumns(10);
		tfid.setBounds(160, 110, 182, 25);
		getContentPane().add(tfid);

		tftel = new JTextField();
		tftel.setColumns(10);
		tftel.setBounds(160, 290, 182, 25);
		getContentPane().add(tftel);

		tfemr = new JTextField();
		tfemr.setColumns(10);
		tfemr.setBounds(160, 350, 182, 25);
		getContentPane().add(tfemr);

		tfaddr = new JTextField();
		tfaddr.setColumns(10);
		tfaddr.setBounds(160, 410, 182, 25);
		getContentPane().add(tfaddr);

		tfname = new JTextField();
		tfname.setColumns(10);
		tfname.setBounds(160, 470, 182, 25);
		getContentPane().add(tfname);

		tfob = new JTextField();
		tfob.setText("1~5\uC0AC\uC774 \uC22B\uC790\uB9CC \uC785\uB825\uD558\uC138\uC694");
		tfob.setBounds(160, 230, 182, 25);
		getContentPane().add(tfob);
		tfob.setColumns(10);
		
		pfpw = new JPasswordField();
		pfpw.setBounds(160, 170, 182, 25);
		getContentPane().add(pfpw);
		
		pfju = new JPasswordField();
		pfju.setBounds(160, 530, 182, 25);
		getContentPane().add(pfju);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

		try {
			mdao = new MemlogDAO();
			System.out.println("로그인창 연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "로그인창 연결 실패 : " + e.getMessage());
		}
<<<<<<< HEAD
		newObject();
		addLayout();
		event();
		
		setSize(544, 693);
		setTitle("회원가입");
	}

	void newObject() {
		lbTitle = new JLabel("회원 가입");
		lbTitle.setFont(new Font("HY견고딕", Font.PLAIN, 23));

		lbid = new JLabel("ID");
		lbid.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbpw = new JLabel("Password");
		lbpw.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbtel = new JLabel("연락처");
		lbtel.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbemr = new JLabel("비상 연락처");
		lbemr.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbaddr = new JLabel("주소");
		lbaddr.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbname = new JLabel("이름");
		lbname.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbju = new JLabel("주민번호");
		lbju.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbob = new JLabel("장애등급");
		lbob.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		btdouid = new JButton("중복 확인");
		btdouid.setFont(new Font("HY견고딕", Font.PLAIN, 12));

		btmemlog = new JButton("회원 가입");
		btmemlog.setFont(new Font("HY견고딕", Font.PLAIN, 12));

		btcancel = new JButton("취소");
		btcancel.setFont(new Font("HY견고딕", Font.PLAIN, 12));

		tfid = new JTextField();
		tftel = new JTextField();
		tfemr = new JTextField();
		tfaddr = new JTextField();
		tfname = new JTextField();
		pfpw = new JPasswordField();
		pfju = new JPasswordField();
		cbob = new JComboBox();
		lbBackground = new JLabel("");
	}

	void addLayout() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Image/hospital.png"));
		getContentPane().setLayout(null);

		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setBounds(164, 10, 182, 53);
		getContentPane().add(lbTitle);

		lbid.setBounds(62, 94, 90, 25);
		getContentPane().add(lbid);

		lbpw.setBounds(62, 154, 90, 25);
		getContentPane().add(lbpw);

		lbtel.setBounds(62, 274, 90, 25);
		getContentPane().add(lbtel);

		lbemr.setBounds(62, 334, 90, 25);
		getContentPane().add(lbemr);

		lbaddr.setBounds(62, 394, 90, 25);
		getContentPane().add(lbaddr);

		lbname.setBounds(62, 454, 90, 25);
		getContentPane().add(lbname);

		lbju.setBounds(62, 514, 90, 25);
		getContentPane().add(lbju);

		lbob.setBounds(62, 214, 90, 25);
		getContentPane().add(lbob);

		btdouid.setBounds(383, 94, 110, 25);
		getContentPane().add(btdouid);

		btmemlog.setBounds(143, 586, 110, 25);
		getContentPane().add(btmemlog);

		btcancel.setBounds(284, 586, 110, 25);
		getContentPane().add(btcancel);

		tfid.setColumns(10);
		tfid.setBounds(164, 94, 182, 25);
		getContentPane().add(tfid);

		tftel.setColumns(10);
		tftel.setBounds(164, 274, 182, 25);
		getContentPane().add(tftel);

		tfemr.setColumns(10);
		tfemr.setBounds(164, 334, 182, 25);
		getContentPane().add(tfemr);

		tfaddr.setColumns(10);
		tfaddr.setBounds(164, 394, 182, 25);
		getContentPane().add(tfaddr);

		tfname.setColumns(10);
		tfname.setBounds(164, 454, 182, 25);
		getContentPane().add(tfname);

		pfpw.setBounds(164, 154, 182, 25);
		getContentPane().add(pfpw);

		pfju.setBounds(164, 514, 182, 25);
		getContentPane().add(pfju);

		cbob.setModel(new DefaultComboBoxModel(new String[] { "5급", "4급", "3급", "2급", "1급" }));
		cbob.setMaximumRowCount(5);
		cbob.setBounds(164, 215, 182, 23);
		getContentPane().add(cbob);

		lbBackground.setIcon(
				new ImageIcon(MemlogVIEW.class.getResource("/Image/pexels-codioful-(formerly-gradienta)-7130497.jpg")));
		lbBackground.setBounds(0, 0, 530, 63);
		getContentPane().add(lbBackground);

	}

	void event() {
		// 아이디 중복확인 및 자리수 버튼 이벤트
=======
		initialize();
//		frame.setVisible(true);
		setSize(550, 1000);
		setTitle("회원가입");
	}

	private void initialize() {
		// TODO Auto-generated method stub
		// 아이디 중복확인 버튼 이벤트 발생 [HWI]
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		btdouid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfid.getText();

				try {
					String chid = mdao.checkid(id);
					if (tfid.getText().length() < 2) {
						JOptionPane.showMessageDialog(null, "최소 2글자 이상아이디를 입력해주세요!");
					} else {
						if (chid == null) {
							JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
						} else {
							JOptionPane.showMessageDialog(null, "이미 사용된 아이디입니다.");
							tfid.setText("");
						}
					}
				} catch (Exception e1) {
				}
			}
		});
<<<<<<< HEAD
		// 회원가입 버튼 이벤트
		btmemlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

=======

		btmemlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String ob = tfob.getText();
				try {
					String firstChar = mdao.checkob(ob);
					if (ob.isEmpty()) {
						JOptionPane.showMessageDialog(null, "숫자를 입력해주세요!");
					} else {
						int firstChar1 = Integer.parseInt(ob);
						if (firstChar1 < 1 || firstChar1 > 5) {
							JOptionPane.showMessageDialog(null, "1~5 사이의 숫자를 입력해주세요!");
							tfob.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "올바른 입력입니다");
						}

					}
				} catch (Exception e1) {
				}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
				MemlogVO vo = new MemlogVO();

				String id = tfid.getText();
				String pw = pfpw.getText();
				String memtel = tftel.getText();
				String memaddr = tfaddr.getText();
				String mememr = tfemr.getText();
				String memname = tfname.getText();
				String memjuban = pfju.getText();
<<<<<<< HEAD
				Object memobstacle = cbob.getSelectedItem();
=======
				String memobstacle = tfob.getText();
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

				vo.setID(id);
				vo.setPW(pw);
				vo.setMemtel(memtel);
				vo.setMemaddr(memaddr);
				vo.setMememr(mememr);
				vo.setMemname(memname);
				vo.setMemjuban(memjuban);
				vo.setMemobstacle(memobstacle);

				while (true) {

					if (tfid.getText().length() == 0) {
<<<<<<< HEAD
						frame.setVisible(false);
						frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "아이디를 입력해주세요!");
						break;
					} else if (pfpw.getText().length() == 0) {
						frame.setVisible(false);
						frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요!");
						break;
					} else if (tftel.getText().length() == 0) {
						frame.setVisible(false);
						frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "연락처을 입력해주세요!");
						break;
					} else if (tfemr.getText().length() == 0) {
						frame.setVisible(false);
						frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "비상연락처를 입력해주세요!");
						break;
					} else if (tfaddr.getText().length() == 0) {
						frame.setVisible(false);
						frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "주소를 입력해주세요!");
						break;
					} else if (tfname.getText().length() == 0) {
						frame.setVisible(false);
						frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "이름을 입력해주세요!");
						break;
					} else if (pfju.getText().length() == 0) {
						frame.setVisible(false);
						frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "주민번호 앞자리를 입력해주세요!");
						break;
=======
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "아이디를 입력해주세요!");
						break;
					} else if (pfpw.getText().length() == 0) {
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요!");
						break;
					} else if (tftel.getText().length() == 0) {
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "연락처을 입력해주세요!");
						break;
					} else if (tfemr.getText().length() == 0) {
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "비상연락처를 입력해주세요!");
						break;
					} else if (tfaddr.getText().length() == 0) {
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "주소를 입력해주세요!");
						break;
					} else if (tfname.getText().length() == 0) {
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "이름을 입력해주세요!");
						break;
					} else if (pfju.getText().length() == 0) {
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "주민번호 앞자리를 입력해주세요!");
						break;
					} else if (tfob.getText().length() == 0) {
						LoginVIEW window = new LoginVIEW();
						window.frame.setVisible(false);
						window.frame.setSize(500, 500);
						JOptionPane.showMessageDialog(null, "장애등급을 선택해주세요!");
						break;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					} else {
						try {
							mdao.ijoin(vo);
							dispose();
<<<<<<< HEAD
							frame.setVisible(true);
							frame.setSize(500, 500);
=======
							LoginVIEW window = new LoginVIEW();
							window.frame.setVisible(true);
							window.frame.setSize(500, 500);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다!");
					}
					break;
				}
			}
		});

<<<<<<< HEAD
		btcancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});
	}
=======


		btcancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginVIEW window = new LoginVIEW();
				window.frame.setVisible(true);
				window.frame.setSize(500, 500);
			}

		});

	};
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

	// 클리어 스크린 메소드
	public void clearScreen() {
		tfid.setText("");
		pfpw.setText("");
		tftel.setText("");
		tfemr.setText("");
		tfaddr.setText("");
		tfname.setText("");
		pfju.setText("");
<<<<<<< HEAD
		cbob.setSelectedItem("");
=======
		tfob.setText("");
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	}

	// 글자 수 제한 메소드
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

	@Override
	public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
	}
=======
		// TODO Auto-generated method stub

	}

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

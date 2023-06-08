package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

<<<<<<< HEAD
import model.SCardPaymentDAO;
import model.MCardPaymentDAO;
=======
import model.MAccountPaymentDAO;
import model.MCardPaymentDAO;
import model.SCardPaymentDAO;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
import model.rec.AccountPaymentVO;
import model.rec.CardPaymentVO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
<<<<<<< HEAD
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

public class SoCardPay extends JDialog {
	JPanel contentPane;
	JTextField tfOrderCode, tfCardNum, tfPrice;
	JPasswordField pwfCVC, pwfPassTwo;
<<<<<<< HEAD
	JLabel lbOrderCode, lbCardCom, lbCardNum, lbCardDate, lbCVC, lbPassTwo, lbPrice, lbTitle, lbBackground;
=======
	JLabel lbOrderCode, lbCardCom, lbCardNum, lbCardDate, lbCVC, lbPassTwo, lbPrice;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	JComboBox cbCardCom, cbCardDateMM, cbCardDateYY;
	JButton btnPay;

	SCardPaymentDAO dao;
	CardPaymentVO vo;
<<<<<<< HEAD
	OrderView ov;

	// 공유할 데이터 선언
	int orderNum, price;

	// 부모로부터 초기데이터 받을 생성자 선언
	public SoCardPay(int orderNum, int price) {
		this.orderNum = orderNum;
		this.price = price;

=======

	private final JPanel contentPanel = new JPanel();
	// 공유할 데이터 선언
	private int orderNum, price;

	// 부모로부터 초기데이터 받을 생성자 선언
	public SoCardPay(int orderNum, int price) {
		this();
		this.orderNum = orderNum;
		this.price = price;

		System.out.println("부모로부터 받은 초기 shareData : " + orderNum);

		initialize(orderNum, price);

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		try {
			dao = new SCardPaymentDAO();
			System.out.println("디비 연결 성공!");

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "DB 연결 실패 : " + e.getMessage());
		}
<<<<<<< HEAD
		newObject(orderNum, price);
		addLayout(orderNum, price);
		event();
	}

	void newObject(int orderNum, int price) {
		tfOrderCode = new JTextField(String.valueOf(orderNum));
		tfCardNum = new JTextField();
		tfPrice = new JTextField(String.valueOf(price));

		lbTitle = new JLabel("카드결제");
		lbTitle.setFont(new Font("HY견고딕", Font.PLAIN, 18));

		lbOrderCode = new JLabel("주문코드");
		lbOrderCode.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbCardCom = new JLabel("카드회사");
		lbCardCom.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbCardNum = new JLabel("카드번호");
		lbCardNum.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbCardDate = new JLabel("유효기간 mm/yy");
		lbCardDate.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbCVC = new JLabel("CVC");
		lbCVC.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbPassTwo = new JLabel("비밀번호앞2자리");
		lbPassTwo.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		lbPrice = new JLabel("결제금액");
		lbPrice.setFont(new Font("HY견고딕", Font.PLAIN, 14));

		btnPay = new JButton("결제");

=======
	}

	// getter, setter, 완료된데이터보여줄 메서드 선언
	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public void printOrderNum() {
		System.out.println("부모로부터 받은 변경 shareData : " + this.orderNum);
	}

	public SoCardPay() {
	}

	void initialize(int orderNum, int price) {

		tfOrderCode = new JTextField(String.valueOf(orderNum));
		tfCardNum = new JTextField();
		tfPrice = new JTextField(String.valueOf(price));
		lbOrderCode = new JLabel("주문코드");
		lbCardCom = new JLabel("카드회사");
		lbCardNum = new JLabel("카드번호");
		lbCardDate = new JLabel("유효기간 mm/yy");
		lbCVC = new JLabel("CVC");
		lbPassTwo = new JLabel("비밀번호앞2자리");
		lbPrice = new JLabel("결제 금액");
		btnPay = new JButton("결제");
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		cbCardCom = new JComboBox();
		cbCardDateMM = new JComboBox();
		cbCardDateYY = new JComboBox();
		pwfCVC = new JPasswordField();
		pwfPassTwo = new JPasswordField();
<<<<<<< HEAD
		contentPane = new JPanel();
		lbBackground = new JLabel("");
	}

	void addLayout(int orderNum, int price) {
		getContentPane().setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Image/150.png"));
		getContentPane().setLayout(null);

		lbOrderCode.setBounds(32, 51, 66, 16);
		lbCardCom.setBounds(32, 80, 59, 16);
		lbCardNum.setBounds(32, 117, 66, 16);
		lbCardDate.setBounds(32, 157, 122, 16);
		lbCVC.setBounds(32, 199, 44, 16);
		lbPassTwo.setBounds(32, 241, 122, 16);
		lbPrice.setBounds(32, 281, 66, 16);
		btnPay.setBounds(139, 334, 91, 23);
		tfOrderCode.setBounds(246, 51, 93, 21);
		tfOrderCode.setColumns(10);
		tfOrderCode.setEditable(false);
		tfCardNum.setBounds(139, 115, 200, 21);
		tfCardNum.setColumns(10);
		tfPrice.setBounds(199, 282, 140, 21);
		tfPrice.setColumns(10);
		tfPrice.setEditable(false);
		lbTitle.setBounds(12, 10, 91, 18);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 349, 371);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(tfOrderCode);
		contentPane.add(tfCardNum);
		contentPane.add(tfPrice);
		contentPane.add(lbTitle);
		contentPane.add(lbOrderCode);
		contentPane.add(lbCardCom);
		contentPane.add(lbCardNum);
		contentPane.add(lbCardDate);
		contentPane.add(lbCVC);
		contentPane.add(lbPassTwo);
		contentPane.add(lbPrice);
		contentPane.setBackground(new Color(255, 255, 255));
		pwfCVC.setBounds(199, 199, 140, 21);
		contentPane.add(pwfCVC);
		pwfPassTwo.setBounds(199, 241, 140, 21);
		contentPane.add(pwfPassTwo);

		cbCardCom.setModel(new DefaultComboBoxModel(new String[] { "삼성카드", "현대카드", "비씨카드", "하나카드", "우리카드", "신한카드" }));
		cbCardCom.setBounds(246, 81, 93, 23);
		contentPane.add(cbCardCom);

		cbCardDateMM.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		cbCardDateMM.setBounds(199, 154, 44, 23);
		contentPane.add(cbCardDateMM);

		cbCardDateYY.setModel(new DefaultComboBoxModel(new String[] { "2023", "2024", "2025", "2026", "2027" }));
		cbCardDateYY.setBounds(254, 154, 85, 23);
		contentPane.add(cbCardDateYY);

		btnPay.setBounds(139, 334, 91, 23);
		contentPane.add(btnPay);

		lbBackground.setIcon(new ImageIcon("src/Image/pexels-codioful-(formerly-gradienta)-7130497.jpg"));
		lbBackground.setBounds(0, 0, 376, 40);
		getContentPane().add(lbBackground);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 349, 371);
		setSize(390, 450);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	}

	void event() {
=======

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 349, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfOrderCode.setBounds(140, 40, 83, 23);
		contentPane.add(tfOrderCode);
		tfOrderCode.setColumns(10);
		tfOrderCode.setEditable(false);
		tfCardNum.setBounds(140, 120, 160, 23);
		contentPane.add(tfCardNum);
		tfCardNum.setColumns(10);
		tfPrice.setBounds(140,280,160,20);
		contentPane.add(tfPrice);
		tfPrice.setColumns(10);
		tfPrice.setEditable(false);

		lbOrderCode.setBounds(35, 40, 57, 23);
		contentPane.add(lbOrderCode);
		lbCardCom.setBounds(35, 80, 57, 23);
		contentPane.add(lbCardCom);
		lbCardNum.setBounds(35, 120, 57, 23);
		contentPane.add(lbCardNum);
		lbCardDate.setBounds(35, 160, 102, 23);
		contentPane.add(lbCardDate);
		lbCVC.setBounds(35, 200, 57, 23);
		contentPane.add(lbCVC);
		lbPassTwo.setBounds(35, 240, 102, 23);
		contentPane.add(lbPassTwo);
		lbPrice.setBounds(35, 280,102,23);
		contentPane.add(lbPrice);

		pwfCVC.setBounds(140, 200, 65, 23);
		contentPane.add(pwfCVC);
		pwfPassTwo.setBounds(140, 240, 65, 23);
		contentPane.add(pwfPassTwo);

		cbCardCom.setModel(new DefaultComboBoxModel(new String[] { "삼성카드", "현대카드", "비씨카드", "하나카드", "우리카드", "신한카드" }));
		cbCardCom.setBounds(140, 80, 83, 23);
		contentPane.add(cbCardCom);
		cbCardDateMM.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		cbCardDateMM.setBounds(140, 160, 44, 23);
		contentPane.add(cbCardDateMM);
		cbCardDateYY.setModel(new DefaultComboBoxModel(new String[] { "2023", "2024", "2025", "2026", "2027" }));
		cbCardDateYY.setBounds(190, 160, 57, 23);
		contentPane.add(cbCardDateYY);

		btnPay.setBounds(116, 320, 80, 25);
		contentPane.add(btnPay);

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if (o == btnPay) {
					int num = Integer.parseInt(tfOrderCode.getText());
					String bank = (String) cbCardCom.getSelectedItem();
					String cardnum = tfCardNum.getText();
					String date = ((String) cbCardDateMM.getSelectedItem() + "/"
							+ (String) cbCardDateYY.getSelectedItem());
					char[] cvce = pwfCVC.getPassword();
					char[] passtwoe = pwfPassTwo.getPassword();
					String cvc = "";
					String passtwo = "";
					for (char cha : cvce) {
						Character.toString(cha);
						cvc += (cvc.equals("")) ? "" + cha + "" : "" + cha + "";
					}
					for (char cha : passtwoe) {
						Character.toString(cha);
						passtwo += (passtwo.equals("")) ? "" + cha + "" : "" + cha + "";
					}
					vo = new CardPaymentVO(cardnum, date, cvc, bank, passtwo, num);

					try {
						int cnt = dao.regist(vo);
						if (cnt > 0) {
							clearScreen();
							System.out.println("결제 완료");
						} else {
							System.out.println("결제 실패");
						}
					} catch (Exception e1) {
<<<<<<< HEAD
						JOptionPane.showMessageDialog(null, "결제 실패!! : " + e1.getMessage());
					}
					dispose();
				}

=======
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "결제 실패!! : " + e1.getMessage());
					}
				}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			}
		});
	}

	void clearScreen() {
		tfCardNum.setText(null);
		tfOrderCode.setText(null);
		pwfCVC.setText(null);
		pwfPassTwo.setText(null);
	}
}
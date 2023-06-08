package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.MAccountPaymentDAO;
import model.SAccountPaymentDAO;
import model.rec.AccountPaymentVO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
<<<<<<< HEAD
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class SoAccountPay extends JDialog {
	JLabel lbTitle, lbBackground, lbOrderCode, lbBankName, lbAccountNum, lbName, lbBillNum, lbPrice;
	JTextField tfOrderCode, tfAccountNum, tfName, tfBillNum, tfPrice;
	JComboBox cbBankName;
	JButton btnPay;
	
	AccountPaymentVO vo;
	SAccountPaymentDAO dao;

	// ������ ������ ����
	int orderNum, price;

	// �θ�κ��� �ʱⵥ���� ���� ������ ����
	public SoAccountPay(int orderNum, int price) {
		this.orderNum = orderNum;
		this.price = price;
=======

public class SoAccountPay extends JDialog {
	JTextField tfAccountNum, tfOrderCode, tfBillNum, tfName, tfPrice;
	JLabel lbBankName, lbAccountNum, lbName, lbBillNum, lbOrderCode, lbPrice;
	JComboBox cbBankName;
	JPanel panel;
	JButton btnPay;

	AccountPaymentVO vo;
	SAccountPaymentDAO dao;

	private final JPanel contentPanel = new JPanel();
	// ������ ������ ����
	private int orderNum, price;

	// �θ�κ��� �ʱⵥ���� ���� ������ ����
	public SoAccountPay(int orderNum, int price) {
		this();
		this.orderNum = orderNum;
		this.price = price;
		System.out.println("�θ�κ��� ���� �ʱ� shareData : " + orderNum);
		
		initialize(orderNum, price);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

		try {
			dao = new SAccountPaymentDAO();
			System.out.println("��� ���� ����!");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "DB ���� ���� : " + e.getMessage());
		}
<<<<<<< HEAD
		newObject(orderNum, price);
		addLayout(orderNum, price);
		event();
	}

	void newObject(int orderNum, int price) {
		lbTitle = new JLabel("������ü");
		lbTitle.setFont(new Font("HY�߰��", Font.PLAIN, 18));
		lbBackground = new JLabel("");
		lbBackground.setIcon(new ImageIcon(MaccountPay.class.getResource("/Image/blurry-g72d76acb2_1280.jpg")));
		lbOrderCode = new JLabel("�ֹ��ڵ�");
		lbOrderCode.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		lbBankName = new JLabel("�����");
		lbBankName.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		lbAccountNum = new JLabel("���¹�ȣ");
		lbAccountNum.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		lbName = new JLabel("�Ա��ڸ�");
		lbName.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		lbBillNum = new JLabel("���ݿ�������ȣ");
		lbBillNum.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		lbPrice = new JLabel("�����ݾ�");
		lbPrice.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfOrderCode = new JTextField(String.valueOf(orderNum));
		tfOrderCode.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfAccountNum = new JTextField();
		tfAccountNum.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfName = new JTextField();
		tfName.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfBillNum = new JTextField();
		tfBillNum.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfPrice = new JTextField(String.valueOf(price));
		tfPrice.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		String[] bank = { "��������", "�ϳ�����", "īī����ũ", "��������", "�������", "�츮����", "����" };
		cbBankName = new JComboBox(bank);
		cbBankName.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		btnPay = new JButton("����");
		btnPay.setFont(new Font("HY�߰��", Font.PLAIN, 12));
	}

	void addLayout(int orderNum, int price) {
		getContentPane().setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Image/150.png"));
		getContentPane().setLayout(null);

		lbTitle.setBounds(12, 10, 91, 18);
		getContentPane().add(lbTitle);

		lbBackground.setBounds(0, 0, 376, 40);
		getContentPane().add(lbBackground);

		lbOrderCode.setBounds(33, 64, 57, 15);
		getContentPane().add(lbOrderCode);

		lbBankName.setBounds(33, 105, 57, 15);
		getContentPane().add(lbBankName);

		lbAccountNum.setBounds(33, 143, 57, 15);
		getContentPane().add(lbAccountNum);

		lbName.setBounds(33, 187, 57, 15);
		getContentPane().add(lbName);

		lbBillNum.setBounds(33, 236, 100, 15);
		getContentPane().add(lbBillNum);

		lbPrice.setBounds(33, 281, 57, 15);
		getContentPane().add(lbPrice);

		tfOrderCode.setEditable(false);
		tfOrderCode.setBounds(199, 58, 116, 21);
		getContentPane().add(tfOrderCode);
		tfOrderCode.setColumns(10);

		tfAccountNum.setColumns(10);
		tfAccountNum.setBounds(102, 140, 213, 21);
		getContentPane().add(tfAccountNum);

		tfName.setColumns(10);
		tfName.setBounds(199, 181, 116, 21);
		getContentPane().add(tfName);

		tfBillNum.setColumns(10);
		tfBillNum.setBounds(139, 230, 176, 21);
		getContentPane().add(tfBillNum);

		tfPrice.setEditable(false);
		tfPrice.setColumns(10);
		tfPrice.setBounds(199, 275, 116, 21);
		getContentPane().add(tfPrice);

		setSize(355, 395);
		setLocationRelativeTo(null);

		cbBankName.setBounds(199, 98, 117, 23);
		getContentPane().add(cbBankName);
		
		btnPay.setBounds(119, 319, 97, 23);
		getContentPane().add(btnPay);
	}
	void event() {
=======
	}

	// getter, setter, �Ϸ�ȵ����ͺ����� �޼��� ����
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public void printOrderNum() {
		System.out.println("�θ�κ��� ���� ���� shareData : " + this.orderNum);
	}
	public SoAccountPay() {
		
	}

	void initialize(int orderNum, int price) {

		tfAccountNum = new JTextField();
		tfOrderCode = new JTextField(String.valueOf(orderNum));
		tfBillNum = new JTextField();
		tfName = new JTextField();
		tfPrice = new JTextField(String.valueOf(price));
		
		lbBankName = new JLabel("�����");
		lbAccountNum = new JLabel("���¹�ȣ");
		lbName = new JLabel("�Ա��ڸ�");
		lbBillNum = new JLabel("���ݿ�������ȣ");
		lbOrderCode = new JLabel("�ֹ��ڵ�");
		lbPrice = new JLabel("�����ݾ�");
		
		String[] bank = { "��������", "�ϳ�����", "īī����ũ", "��������", "�������", "�츮����", "����" };
		cbBankName = new JComboBox(bank);
		panel = new JPanel();
		btnPay = new JButton("����");

		tfOrderCode.setColumns(10);
		tfOrderCode.setBounds(150, 30, 135, 20);
		tfOrderCode.setEditable(false);
		tfAccountNum.setBounds(150, 90, 200, 20);
		tfAccountNum.setColumns(10);
		tfBillNum.setColumns(10);
		tfBillNum.setBounds(150, 150, 200, 20);
		tfName.setColumns(10);
		tfName.setBounds(150, 120, 100, 20);
		tfPrice.setBounds(150, 180, 100, 20);
		tfPrice.setEditable(false);
		
		lbBankName.setBounds(40, 60, 100, 20);
		lbAccountNum.setBounds(40, 90, 100, 20);
		lbName.setBounds(40, 120, 100, 20);
		lbBillNum.setBounds(40, 150, 100, 20);
		lbOrderCode.setBounds(40, 30, 100, 20);
		lbPrice.setBounds(40, 180, 100, 20);
		
		cbBankName.setBounds(150, 60, 135, 20);
		btnPay.setBounds(150, 210, 100, 25);

		setBounds(100, 100, 411, 294);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 393, 253);
		getContentPane().add(panel);

		panel.add(tfBillNum);
		panel.add(tfName);
		panel.add(tfAccountNum);
		panel.add(tfOrderCode);
		panel.add(tfPrice);
		panel.add(lbBankName);
		panel.add(lbAccountNum);
		panel.add(lbName);
		panel.add(cbBankName);
		panel.add(lbBillNum);
		panel.add(lbOrderCode);
		panel.add(lbPrice);
		panel.add(btnPay);

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if (o == btnPay) {
					String account = tfAccountNum.getText();
					String name = tfName.getText();
					String bank = (String) cbBankName.getSelectedItem();
					String cashbill = tfBillNum.getText();
					int scode = Integer.parseInt(tfOrderCode.getText());
					vo = new AccountPaymentVO(account, name, bank, cashbill, scode);

					try {
						int cnt = dao.regist(vo);
						if (cnt > 0) {
							clearScreen();
							System.out.println("�����Ϸ�");
						} else {
							System.out.println("��������");
						}
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "���� ����!! : " + e2.getMessage());
					}
<<<<<<< HEAD
					dispose();
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
				}
			}
		});
	}
<<<<<<< HEAD
=======

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	void clearScreen() {
		tfOrderCode.setText(null);
		tfAccountNum.setText(null);
		tfBillNum.setText(null);
		tfName.setText(null);
	}
}
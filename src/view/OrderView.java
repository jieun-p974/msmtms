package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import model.OrderDAO;
import model.ReviewDAO;
import model.rec.OrderVO;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
<<<<<<< HEAD
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

public class OrderView extends JPanel {

	JFrame frame;
	JPanel total;
	JTable tbTotal, tbShop;
<<<<<<< HEAD
	JLabel lbTitle, lbBackground, lbPayMethod;
	JButton btnCartIn, btnCartOut, btnCard, btnAccount, btnShowReview, btnDetail, btnSearch;
	JComboBox cbCategory, cbDetail;
	JTextField tfSearch;
	JScrollPane allListScrollPane, shoppingListScrollPane;
	
=======
	JButton btnCartIn, btnCartOut, btnCard, btnAccount, btnShowReview;
	JComboBox cbCategory;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	OrderTableModel tmOrder;
	ShopTableModel tmShop;
	OrderVO vo;
	OrderDAO dao;
<<<<<<< HEAD

	ArrayList list;
	int index, totalQuantity, orderNum, memCode;
	String id; // ȸ�� ���̵� �޾ƿ� ����


	public OrderView(int memCode, String id) {
		setBackground(new Color(255, 255, 255));
=======
//	ReviewDAO rDao;
	ArrayList list;
	int index, totalQuantity;
	int orderNum; // �ڵ������� �ֹ� ��ȣ
	int memCode; // ȸ�� ��ȣ �޾ƿ� ����
	String id; // ȸ�� ���̵� �޾ƿ� ����

	public OrderView(int memCode, String id) {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		this.memCode = memCode;
		this.id = id;

		newObject(memCode, id);
<<<<<<< HEAD
		addLayout(memCode, id);
=======
		initialize(memCode, id);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		eventProc(memCode, id);

		// �����ͺ��̽� ����
		try {
			dao = new OrderDAO();
			System.out.println("���� ����");
			System.out.println("ȸ����ȣ : " + memCode + "ȸ�� ���̵�: " + id);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "���� ���� : " + e.getMessage());
			e.printStackTrace();
		}
	}

	void newObject(int memCode, String id) {
		frame = new JFrame();
<<<<<<< HEAD
		lbTitle = new JLabel("�ֹ�");
		lbTitle.setFont(new Font("HY�߰��", Font.BOLD, 26));
		lbBackground = new JLabel();
		lbBackground.setIcon(new ImageIcon("src/Image/blurry-g72d76acb2_1280.jpg"));
		lbPayMethod = new JLabel("��������");
		lbPayMethod.setFont(new Font("HY�߰��", Font.BOLD, 15));
		allListScrollPane = new JScrollPane();
		shoppingListScrollPane = new JScrollPane();
		tbTotal = new JTable();
		tbTotal.setFont(new Font("����", Font.PLAIN, 12));
=======
		tbTotal = new JTable();
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		tbTotal.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "�ڵ�", "ǰ���", "������", "������", "����", "����", "Ư¡" }) {
					Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class,
							String.class, Integer.class, String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
<<<<<<< HEAD
		
		tbShop = new JTable();
		tbShop.setFont(new Font("����", Font.PLAIN, 12));
		tbShop.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "��ǰ��", "����", "����", "����ó���ڵ�", "�ֹ��ڵ�" }) {
=======
		tbShop = new JTable();
		tbShop.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "�ⱸ��", "����", "����", "�԰��ڵ�", "�ֹ��ڵ�" }) {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			Class[] columnTypes = new Class[] { String.class, Integer.class, String.class, Integer.class,
					Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
<<<<<<< HEAD
		
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		// ���̺� ���ǳ� �ֱ�
		TableColumnModel model = tbShop.getColumnModel();
		TableColumn col = model.getColumn(1);
		col.setCellEditor(new SpinnerEditor());
<<<<<<< HEAD
		btnSearch = new JButton("�˻�");
		btnCard = new JButton("ī�����");
		btnCard.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		btnCard.setBounds(713, 606, 95, 25);
		btnAccount = new JButton("���°���");
		btnAccount.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		btnAccount.setBounds(607, 606, 95, 25);
		btnShowReview = new JButton("����Ȯ��");
		btnShowReview.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		btnCartIn = new JButton("\u25BC");
		btnCartIn.setBackground(new Color(255, 255, 255));
		btnCartOut = new JButton("\u25B2");
		btnCartOut.setBackground(new Color(255, 255, 255));
		cbCategory = new JComboBox();
		cbCategory.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tmOrder = new OrderTableModel();
		tmShop = new ShopTableModel();
		btnDetail = new JButton("�󼼺���");
		btnDetail.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		cbDetail = new JComboBox();
		cbDetail.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfSearch = new JTextField();
=======

		btnCard = new JButton("ī�����");
		btnAccount = new JButton("���°���");
		btnShowReview = new JButton("����Ȯ��");
		btnCartIn = new JButton(">");
		btnCartOut = new JButton("<");
		cbCategory = new JComboBox();
		tmOrder = new OrderTableModel();
		tmShop = new ShopTableModel();
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	}

	public class SpinnerEditor extends DefaultCellEditor {
		JSpinner sp;
		DefaultEditor defaultEdit;
		JTextField text;

		public SpinnerEditor() {
			super(new JTextField());
			sp = new JSpinner();
			defaultEdit = ((DefaultEditor) sp.getEditor());
			text = defaultEdit.getTextField();
		}

		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
				int column) {
			sp.setValue(value);
			return sp;
		}

		public Object getCellEditorValue() {
			return sp.getValue();
		}
	}

<<<<<<< HEAD
	void addLayout(int memCode, String id) {
		total = new JPanel(new BorderLayout());
		total.setBackground(new Color(255, 255, 255));
		JPanel panel = new JPanel();
		total.add(panel, BorderLayout.NORTH);
		panel.setLayout(null);

		JPanel tablePane = new JPanel();
		tablePane.setBackground(new Color(255, 255, 255));
		total.add(tablePane, BorderLayout.CENTER);
		tablePane.setLayout(null);

		allListScrollPane.setBounds(12, 104, 796, 229);
		allListScrollPane.setViewportView(tbTotal);
		tablePane.add(allListScrollPane);
		
		shoppingListScrollPane.setBounds(12, 377, 796, 219);
		shoppingListScrollPane.setViewportView(tbShop);
		tablePane.add(shoppingListScrollPane);

		btnCartIn.setBounds(414, 343, 57, 23);
		tablePane.add(btnCartIn);

		btnCartOut.setBounds(483, 343, 57, 23);
		tablePane.add(btnCartOut);

		cbCategory.setModel(new DefaultComboBoxModel(new String[] { "�Ҹ�ǰ", "�ⱸ" }));
		cbCategory.setBounds(664, 69, 144, 23);
		tablePane.add(cbCategory);

		btnShowReview.setBounds(607, 343, 95, 25);
		tablePane.add(btnShowReview);
		btnShowReview.setVisible(false);

		btnDetail.setBounds(713, 343, 95, 25);
		tablePane.add(btnDetail);

		cbDetail.setModel(new DefaultComboBoxModel(new String[] { "��ǰ��", "�����ڵ�", "������" }));
		cbDetail.setBounds(508, 69, 144, 23);
		tablePane.add(cbDetail);
		cbDetail.setVisible(false);

		tfSearch.setBounds(12, 69, 220, 25);
		tablePane.add(tfSearch);
		tfSearch.setColumns(10);

		btnSearch.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		btnSearch.setBounds(244, 71, 97, 23);
		tablePane.add(btnSearch);		
		
		JPanel panel_1 = new JPanel();
		total.add(panel_1, BorderLayout.SOUTH);
		
		lbPayMethod.setBounds(517, 606, 78, 25);
		panel_1.add(lbPayMethod);
		panel_1.add(btnAccount);
		panel_1.add(btnCard);
		
		lbTitle.setBounds(12, 10, 140, 35);
		tablePane.add(lbTitle);
		
		lbBackground.setBounds(0, 51, 364, 611);
		tablePane.add(lbBackground);
		
=======
	void initialize(int memCode, String id) {
		total = new JPanel(new BorderLayout());
		JPanel panel = new JPanel();
		total.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel = new JLabel("�ֹ�");
		panel.add(lblNewLabel);

		JPanel tablePane = new JPanel();
		total.add(tablePane, BorderLayout.CENTER);
		tablePane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(12, 104, 450, 260);
		tablePane.add(scrollPane);

		scrollPane.setViewportView(tbTotal);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(549, 104, 450, 260);
		tablePane.add(scrollPane_1);

		scrollPane_1.setViewportView(tbShop);

		btnCartIn.setBounds(477, 174, 57, 23);
		tablePane.add(btnCartIn);

		btnCartOut.setBounds(477, 246, 57, 23);
		tablePane.add(btnCartOut);

		cbCategory.setModel(new DefaultComboBoxModel(new String[] { "�Ҹ�ǰ", "�ⱸ" }));
		cbCategory.setBounds(12, 10, 144, 23);
		tablePane.add(cbCategory);

		btnShowReview.setBounds(12, 378, 97, 23);
		tablePane.add(btnShowReview);

		JPanel panel_1 = new JPanel();
		total.add(panel_1, BorderLayout.SOUTH);

		JLabel lblNewLabel_1 = new JLabel("��������");
		panel_1.add(lblNewLabel_1);

		panel_1.add(btnAccount);
		panel_1.add(btnCard);

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		setLayout(new BorderLayout());
		add("Center", total);
	}

	void eventProc(int memCode, String id) {
		BtnEvent evt = new BtnEvent();

		btnAccount.addActionListener(evt);
		btnCard.addActionListener(evt);
		btnCartIn.addActionListener(evt);
		btnCartOut.addActionListener(evt);
		btnShowReview.addActionListener(evt);
<<<<<<< HEAD
		btnDetail.addActionListener(evt);
		btnSearch.addActionListener(evt);
		// �Ҹ�, �ⱸ ����
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		cbCategory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				index = cbCategory.getSelectedIndex();
<<<<<<< HEAD
				
				if (index == 0) {// �Ҹ�ǰ�϶�
					System.out.println("�Ҹ�ǰ ����");
					ArrayList all;
					cbDetail.setVisible(false);
					tmShop = new ShopTableModel();
					try {
						orderNum = dao.aNum();
						all = dao.somoSearch();

						tmShop.data = all;
						tbTotal.setModel(tmShop);
						btnShowReview.setVisible(false);
=======
				if (index == 0) {
					System.out.println("�Ҹ�ǰ ����");
					ArrayList all;
					try {
						orderNum = dao.aNum();
						all = dao.somoSearch();
						tmShop.data = all;
						tbTotal.setModel(tmShop);
						btnShowReview.setVisible(false);
						// �޺��ڽ� �����ϸ� ��ٱ��� �ʱ�ȭ
//						DefaultTableModel model = (DefaultTableModel) tbShop.getModel();
//						model.setNumRows(0);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
						clearShopTb(tbShop);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
<<<<<<< HEAD
				} else {// �ⱸ�϶�
					System.out.println("�ⱸ ����");
					ArrayList all;
					cbDetail.setVisible(true);
					
					tmOrder = new OrderTableModel();
=======
				} else {
					System.out.println("�ⱸ ����");
					ArrayList all;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					try {
						orderNum = dao.mNum();
						all = dao.machineSearch();
						tmOrder.data = all;
						tbTotal.setModel(tmOrder);
<<<<<<< HEAD
						tbTotal.getColumnModel().getColumn(0).setResizable(false);
						tbTotal.getColumnModel().getColumn(0).setPreferredWidth(40);
						tbTotal.getColumnModel().getColumn(1).setResizable(false);
						tbTotal.getColumnModel().getColumn(1).setPreferredWidth(50);
						tbTotal.getColumnModel().getColumn(2).setResizable(false);
						tbTotal.getColumnModel().getColumn(2).setPreferredWidth(60);
						tbTotal.getColumnModel().getColumn(3).setResizable(false);
						tbTotal.getColumnModel().getColumn(3).setPreferredWidth(120);
						tbTotal.getColumnModel().getColumn(4).setResizable(false);
						tbTotal.getColumnModel().getColumn(4).setPreferredWidth(100);
						tbTotal.getColumnModel().getColumn(5).setResizable(false);
						tbTotal.getColumnModel().getColumn(5).setPreferredWidth(300);
						btnShowReview.setVisible(true);
						// �޺��ڽ� �����ϸ� ��ٱ��� �ʱ�ȭ
=======
						btnShowReview.setVisible(true);
						// �޺��ڽ� �����ϸ� ��ٱ��� �ʱ�ȭ
//						DefaultTableModel model = (DefaultTableModel) tbShop.getModel();
//						model.setNumRows(0);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
						clearShopTb(tbShop);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	}

	void clearShopTb(JTable tbShops) {
		DefaultTableModel model = (DefaultTableModel) tbShops.getModel();
		model.setNumRows(0);
	}

	class BtnEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object evt = e.getSource();
			// ī�� ���� ������ ��
			if (evt == btnCard) {
				int payMethod = 3;
				int rowCount = tbShop.getModel().getRowCount();
				int sum = 0;// �Ѽ���
				int price = 0;// �Ѱ���
				int quantity = 0; // ����
<<<<<<< HEAD
				int temp = 0;
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

				if (rowCount > 0) {
					for (int i = 0; i < rowCount; i++) {
						sum += Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 1)));
						quantity = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 1)));
<<<<<<< HEAD
						temp = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 2)));
						price = price + (quantity * temp);
=======
						int temp = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 2)));
						price = sum * temp;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					}
					System.out.println(quantity + " " + price);
				}

				// �Ҹ�ǰ
				if (index == 0) {
					// �ٿ� �ҷ��ͼ� �ֹ��̶� �ֹ� �� �����ϱ�
					try {
						dao.aOrder(memCode, orderNum, payMethod, sum, price);
						for (int i = 0; i < rowCount; i++) {
							// ���̺� �ִ°� list�� ��Ƽ� �����ϱ�
							String quantityStr = String.valueOf(tbShop.getModel().getValueAt(i, 1));
							int acc = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 3)));
							vo = new OrderVO(quantityStr, acc, orderNum);
							dao.aOrderDesc(vo);
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "�Ҹ�ǰ �ֹ� ���� : " + e2.getMessage());
						e2.printStackTrace();
					}
					SoCardPay sc = new SoCardPay(orderNum, price);
					sc.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					sc.setModal(true);
					sc.setVisible(true);
				} else { // �ⱸ
					try {
						dao.mOrder(memCode, orderNum, payMethod, sum, price);
						for (int i = 0; i < rowCount; i++) {
							// ���̺� �ִ°� list�� ��Ƽ� �����ϱ�
							String quantityStr = String.valueOf(tbShop.getModel().getValueAt(i, 1));
							int acc = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 3)));
							vo = new OrderVO(quantityStr, acc, orderNum);
							dao.mOrderDesc(vo);
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "�ⱸ �ֹ� ���� : " + e2.getMessage());
					}
<<<<<<< HEAD
					McardPay mc = new McardPay(orderNum, price);
=======
					McardPay mc = new McardPay(orderNum,price);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					mc.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					mc.setModal(true);
					mc.setVisible(true);
				}
<<<<<<< HEAD
				clearShopTb(tbShop);
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
				// ������ü ��������
			} else if (evt == btnAccount) {
				int payMethod = 2;
				int rowCount = tbShop.getRowCount();
				int sum = 0;// �Ѽ���
				int price = 0;// �Ѱ���
				int quantity = 0;// ����

				if (rowCount > 0) {
					for (int i = 0; i < rowCount; i++) {
						sum += Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 1)));
						quantity = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 1)));
						int temp = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 2)));
<<<<<<< HEAD
						price = price + (quantity * temp);
=======
						price = sum * temp;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					}
					System.out.println(quantity + " " + price);
				}
				// �Ҹ�ǰ
				if (index == 0) {
					try {
						dao.aOrder(memCode, orderNum, payMethod, sum, price);
						for (int i = 0; i < rowCount; i++) {
							// ���̺� �ִ°� list�� ��Ƽ� �����ϱ�
							String quantityStr = String.valueOf(tbShop.getModel().getValueAt(i, 1));
							int acc = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 3)));
							vo = new OrderVO(quantityStr, acc, orderNum);
							dao.aOrderDesc(vo);
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "�Ҹ�ǰ �ֹ� ���� : " + e2.getMessage());
						e2.printStackTrace();
					}
<<<<<<< HEAD
					SoAccountPay sa = new SoAccountPay(orderNum, price);
=======
					SoAccountPay sa = new SoAccountPay(orderNum,price);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					sa.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					sa.setModal(true);
					sa.setVisible(true);
				} else { // �ⱸ
					try {
						dao.mOrder(memCode, orderNum, payMethod, sum, price);
						for (int i = 0; i < rowCount; i++) {
							// ���̺� �ִ°� list�� ��Ƽ� �����ϱ�
							String quantityStr = String.valueOf(tbShop.getModel().getValueAt(i, 1));
							int acc = Integer.parseInt(String.valueOf(tbShop.getModel().getValueAt(i, 3)));
							vo = new OrderVO(quantityStr, acc, orderNum);
							dao.mOrderDesc(vo);
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "�ⱸ �ֹ� ���� : " + e2.getMessage());
					}
					MaccountPay ma = new MaccountPay(orderNum, price);
					ma.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					ma.setModal(true);
					ma.setVisible(true);
				}
<<<<<<< HEAD
				clearShopTb(tbShop);
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			} // īƮ�� �߰�
			else if (evt == btnCartIn) {

				int row = tbTotal.getSelectedRow();
				int code = Integer.parseInt(String.valueOf(tbTotal.getValueAt(row, 0)));
				int price = Integer.parseInt(String.valueOf(tbTotal.getValueAt(row, 4)));
				String name = String.valueOf(tbTotal.getValueAt(row, 1));
				int rowCount = tbShop.getRowCount();
<<<<<<< HEAD

				int sameCnt = 0;

				if (rowCount <= 0) {
					CartIn(name, price, code);
				} else {
					for (int i = 0; i < rowCount; i++) {
						int shopCode = Integer.parseInt(String.valueOf(tbShop.getValueAt(i, 3)));
						if (code == shopCode) {
							sameCnt += 1;
						}
					}
					if (sameCnt == 1) {
						JOptionPane.showMessageDialog(null, "�̹� �߰��� �����Դϴ�.");
						sameCnt = 0;
					} else {
=======
				
				int sameCnt = 0;
				
				if (rowCount <= 0) {
					CartIn(name, price, code);
				}else {
					for (int i = 0; i < rowCount; i++) {
						int shopCode = Integer.parseInt(String.valueOf(tbShop.getValueAt(i, 3)));
						if (code == shopCode) {
							sameCnt+=1;
						}
					}
					if(sameCnt == 1) {
						JOptionPane.showMessageDialog(null, "�̹� �߰��� �����Դϴ�.");
						sameCnt=0;
					}else {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
						CartIn(name, price, code);
					}
				}

			} // īƮ���� ����
			else if (evt == btnCartOut) {
				CartOut();
<<<<<<< HEAD

=======
				
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			} // ���� Ȯ��
			else if (evt == btnShowReview) {
				int row = tbTotal.getSelectedRow();
				String shareData = String.valueOf(tbTotal.getValueAt(row, 1));

				ReviewView rView = new ReviewView(shareData);
				rView.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				rView.setVisible(true);
			}
<<<<<<< HEAD
			// �󼼺���
			else if(evt == btnDetail) {
				int category = cbCategory.getSelectedIndex();
				int row = tbTotal.getSelectedRow();
				int sellerCode = Integer.parseInt(String.valueOf(tbTotal.getValueAt(row, 0)));
				String productName = String.valueOf(tbTotal.getValueAt(row, 1));
				
				if(category == 0) {
					// �Ҹ�ǰ
					try {
//						String img = dao.searchSomoImg(sellerCode, productName);
//						SomoShowDetailView ssd = new SomoShowDetailView(img);
						vo = new OrderVO();
						vo = dao.searchSomoAll(sellerCode, productName);
						SomoShowDetailView ssd = new SomoShowDetailView(vo);
						ssd.setVisible(true);
						ssd.setSize(540,700);
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}else if(category == 1 ) {
					// �ⱸ
					try {
//						String img = dao.searchImg(sellerCode, productName);
//						MachineShowDetailView msd = new MachineShowDetailView(img);
						vo = new OrderVO();
						vo = dao.searchMachineAll(sellerCode, productName);
						MachineShowDetailView msd = new MachineShowDetailView(vo);
						msd.setVisible(true);
						msd.setSize(799,679);
						
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			}
			// �˻�
			else if(evt == btnSearch){
				int category = cbCategory.getSelectedIndex();
				String txt= tfSearch.getText().toUpperCase();
				// �Ҹ�ǰ �˻�
				if(category ==0) {
					tmShop = new ShopTableModel();
					try {
						list = dao.somoFind(txt);
						tmShop.data = list;
						tbTotal.setModel(tmShop);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
					tfSearch.setText("");
				}// �ⱸ �˻�
				else if(category ==1) {
					int col = cbDetail.getSelectedIndex();
					
					tmOrder = new OrderTableModel();
					try {
						list = dao.machineFind(col, txt);
						tmOrder.data = list;
						tbTotal.setModel(tmOrder);
						tbTotal.getColumnModel().getColumn(0).setResizable(false);
						tbTotal.getColumnModel().getColumn(0).setPreferredWidth(40);
						tbTotal.getColumnModel().getColumn(1).setResizable(false);
						tbTotal.getColumnModel().getColumn(1).setPreferredWidth(50);
						tbTotal.getColumnModel().getColumn(2).setResizable(false);
						tbTotal.getColumnModel().getColumn(2).setPreferredWidth(60);
						tbTotal.getColumnModel().getColumn(3).setResizable(false);
						tbTotal.getColumnModel().getColumn(3).setPreferredWidth(120);
						tbTotal.getColumnModel().getColumn(4).setResizable(false);
						tbTotal.getColumnModel().getColumn(4).setPreferredWidth(100);
						tbTotal.getColumnModel().getColumn(5).setResizable(false);
						tbTotal.getColumnModel().getColumn(5).setPreferredWidth(300);
//						btnShowReview.setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					tfSearch.setText("");
				}
				
			}
		}
	}
	// īƮ�� �߰�
=======
		}
	}

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	void CartIn(String name, int price, int code) {
		Vector shop = new Vector();

		shop.add(name);
		shop.add(1);
		shop.add(price);
		shop.add(code);
		shop.add(orderNum);

		DefaultTableModel model = (DefaultTableModel) tbShop.getModel();
		model.addRow(shop);
		System.out.println("īƮ�� �߰�~");
	}
<<<<<<< HEAD
	// īƮ���� ����
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	void CartOut() {
		DefaultTableModel model = (DefaultTableModel) tbShop.getModel();
		int index = tbShop.getSelectedRow();

		if (index < 0) {
			System.out.println("������ ���� �����ϼ���");
		} else {
			model.removeRow(index);
		}
	}
}
<<<<<<< HEAD
// �ⱸ ���̺� ��
=======

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
class OrderTableModel extends AbstractTableModel {
	ArrayList data = new ArrayList();
	String[] columnNames = { "�ڵ�", "�ⱸ��", "������", "������", "����", "Ư¡" };

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return data.size();
	}

	public Object getValueAt(int row, int col) {
		ArrayList temp = (ArrayList) data.get(row);
		return temp.get(col);
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}
}
<<<<<<< HEAD
// �Ҹ�ǰ ���̺� ��
=======

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
class ShopTableModel extends AbstractTableModel {
	ArrayList data = new ArrayList();
	String[] columnNames = { "�ڵ�", "�Ҹ�ǰ��", "������", "������", "����", "�������" };

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return data.size();
	}

	public Object getValueAt(int row, int col) {
		ArrayList temp = (ArrayList) data.get(row);
		return temp.get(col);
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}
}

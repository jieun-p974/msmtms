package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import model.ASDAO;
import model.rec.AsVO;
import model.rec.AscurrentVO;
import view.AsReturnView.AscomtableModel.RecomtableModel;

public class AsReturnView extends JPanel {
	JTextField tfdate, tfReturn, tfmachinename, tfRtlist, tfASlist;
	JPanel panel;
	JComboBox asloccomboBox, reloccomboBox;
	JTable RTtable, AStable, table;
	JRadioButton ASrabtn, Returnrabtn;
	JButton appbtn, searchbutn, searchbutn1;
	ArrayList list;
	AscomtableModel tmAscom;
	RecomtableModel tmRecom;
	ASDAO asdao;
	AsVO asvo;
	AscurrentVO acvo;
	JTextField textFieldmem;
	private JTextField tfcomcode;
	private JTextField tfcomname;
	private JTextField tfcomtel;
	int memCode;
	String id;

	// constructor method
	public AsReturnView(int memCode, String id) {
		addLayout(memCode, id);
		event(memCode, id);

		this.memCode = memCode;
		this.id = id;

		try {
			asdao = new ASDAO();
			System.out.println("A/S,���� ���� ����");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "A/S,���� DB���� ���� : " + e.getMessage());
		}
//		textFieldmem.setText(id);
	}

	// ����ʵ� ��ü ����
	void addLayout(int memCode, String id) {
		this.memCode = memCode;
		this.id = id;
		AStable = new JTable();
		tfdate = new JTextField(15);
		tfmachinename = new JTextField(15);
		tfReturn = new JTextField(15);
		tfRtlist = new JTextField(15);
		tmAscom = new AscomtableModel();
		panel = new JPanel();
		asloccomboBox = new JComboBox();
		reloccomboBox = new JComboBox();
		textFieldmem = new JTextField();
		appbtn = new JButton("��û �ϱ�");

		tfmachinename = new JTextField();
		tfReturn = new JTextField();
		AStable = new JTable();
		tfASlist = new JTextField();
		RTtable = new JTable();
		searchbutn = new JButton(" �˻� ");
		tfRtlist = new JTextField();
		searchbutn1 = new JButton(" �˻� ");
		table = new JTable();
		ASrabtn = new JRadioButton("A/S");
		Returnrabtn = new JRadioButton("����");

		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setDragMode(1);
		desktopPane_2.setLayout(null);

		JLabel date = new JLabel("��� ��¥");
		date.setFont(new Font("����", Font.BOLD, 18));
		date.setBounds(22, 129, 89, 39);
		desktopPane_2.add(date);

		tfdate.setColumns(10);
		tfdate.setBounds(133, 127, 145, 39);
		desktopPane_2.add(tfdate);

		JLabel loc = new JLabel("A/S \uC5C5\uCCB4 \uAC80\uC0C9");
		loc.setFont(new Font("����", Font.BOLD, 18));
		loc.setBounds(22, 351, 132, 39);
		desktopPane_2.add(loc);

		asloccomboBox.setModel(
				new DefaultComboBoxModel(new String[] { "����", "�λ�", "����", "��õ", "����", "����", "����", "����", "����", "��õ" }));
		asloccomboBox.setFont(new Font("����", Font.BOLD, 15));
		asloccomboBox.setBounds(146, 352, 112, 39);
		desktopPane_2.add(asloccomboBox);

		appbtn.setFont(new Font("����", Font.BOLD, 15));
		appbtn.setBounds(385, 129, 170, 76);
		desktopPane_2.add(appbtn);

		JLabel machine = new JLabel("AS \uCF54\uB4DC");
		machine.setFont(new Font("����", Font.BOLD, 18));
		machine.setBounds(22, 80, 89, 39);
		desktopPane_2.add(machine);

		tfmachinename.setColumns(10);
		tfmachinename.setBounds(133, 75, 145, 39);
		desktopPane_2.add(tfmachinename);

		JLabel returnname = new JLabel("\uC218\uAC70 \uCF54\uB4DC");
		returnname.setFont(new Font("����", Font.BOLD, 18));
		returnname.setBounds(322, 80, 89, 39);
		desktopPane_2.add(returnname);

		tfReturn.setEditable(false);
		tfReturn.setColumns(10);
		tfReturn.setBounds(409, 75, 145, 39);
		desktopPane_2.add(tfReturn);

		JLabel appname = new JLabel("��û");
		appname.setFont(new Font("����", Font.BOLD, 25));
		appname.setBounds(33, 13, 78, 39);
		desktopPane_2.add(appname);

		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setDragMode(2);
		desktopPane_3.setLayout(null);

		JLabel applist = new JLabel("\uC2E0\uCCAD \uD604\uD669");
		applist.setFont(new Font("����", Font.BOLD, 25));
		applist.setBounds(12, 10, 208, 52);
		desktopPane_3.add(applist);

		JScrollPane sPASlist = new JScrollPane();
		sPASlist.setBounds(12, 525, 515, 385);
		desktopPane_3.add(sPASlist);

		AStable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "AS \uD604\uD669 \uCF54\uB4DC", "AS \uCF54\uB4DC", "AS \uC5C5\uCCB4 \uCF54\uB4DC",
						"AS \uB0A0\uC9DC", "AS \uC5EC\uBD80", "AS \uC5C5\uCCB4\uBA85",
						"AS \uC5C5\uCCB4 \uC5F0\uB77D\uCC98" }));
		AStable.getColumnModel().getColumn(0).setPreferredWidth(84);
		AStable.getColumnModel().getColumn(2).setPreferredWidth(89);
		sPASlist.setViewportView(AStable);

		tfASlist.setColumns(10);
		tfASlist.setBounds(286, 492, 144, 23);
		desktopPane_3.add(tfASlist);

		searchbutn.setBounds(436, 492, 91, 23);
		desktopPane_3.add(searchbutn);

		JScrollPane sPReturnlist = new JScrollPane();
		sPReturnlist.setBounds(12, 97, 515, 385);
		desktopPane_3.add(sPReturnlist);

		RTtable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "\uC218\uAC70 \uD604\uD669 \uCF54\uB4DC", "\uC218\uAC70 \uCF54\uB4DC",
						"\uC218\uAC70 \uC5C5\uCCB4 \uCF54\uB4DC", "\uC218\uAC70 \uB0A0\uC9DC",
						"\uC218\uAC70 \uC5EC\uBD80", "\uC218\uAC70 \uC5C5\uCCB4\uBA85",
						"\uC218\uAC70 \uC5C5\uCCB4 \uC5F0\uB77D\uCC98" }));
		RTtable.getColumnModel().getColumn(0).setPreferredWidth(93);
		RTtable.getColumnModel().getColumn(2).setPreferredWidth(92);
		RTtable.getColumnModel().getColumn(6).setPreferredWidth(106);
		sPReturnlist.setViewportView(RTtable);

		tfRtlist.setColumns(10);
		tfRtlist.setBounds(286, 64, 144, 23);
		desktopPane_3.add(tfRtlist);

		searchbutn1.setBounds(436, 64, 91, 23);
		desktopPane_3.add(searchbutn1);

		JLabel ASname = new JLabel("A/S");
		ASname.setFont(new Font("����", Font.BOLD, 18));
		ASname.setBounds(12, 496, 123, 23);
		desktopPane_3.add(ASname);

		JLabel Retrunname = new JLabel("\uC218\uAC70");
		Retrunname.setFont(new Font("����", Font.BOLD, 18));
		Retrunname.setBounds(12, 64, 123, 23);
		desktopPane_3.add(Retrunname);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(desktopPane_3, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(desktopPane_3, GroupLayout.PREFERRED_SIZE, 924, GroupLayout.PREFERRED_SIZE)
						.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 924, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 401, 577, 502);
		desktopPane_2.add(scrollPane);

		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "��ü �ڵ�", "��ü��", "����", "��ü ����ó", " URL ", "���� �ð�", "���" }));
		scrollPane.setViewportView(table);

		ASrabtn.setSelected(true);
		ASrabtn.setBackground(new Color(255, 255, 255));

		ButtonGroup bg = new ButtonGroup();

		Returnrabtn.setSelected(true);
		Returnrabtn.setBackground(new Color(255, 255, 255));

		ASrabtn.setHorizontalAlignment(SwingConstants.CENTER);
		ASrabtn.setBounds(251, 24, 113, 23);
		desktopPane_2.add(ASrabtn);

		Returnrabtn.setHorizontalAlignment(SwingConstants.CENTER);
		Returnrabtn.setBounds(382, 24, 113, 23);
		desktopPane_2.add(Returnrabtn);
		bg.add(ASrabtn);
		bg.add(Returnrabtn);

		// id ���� �ȵ�
		textFieldmem.setText(id);
		textFieldmem.setEditable(false);
		textFieldmem.setBounds(114, 25, 96, 21);
		desktopPane_2.add(textFieldmem);
		textFieldmem.setColumns(10);

		JLabel date_1 = new JLabel("\uC5C5\uCCB4 \uCF54\uB4DC");
		date_1.setFont(new Font("����", Font.BOLD, 18));
		date_1.setBounds(22, 178, 89, 39);
		desktopPane_2.add(date_1);

		JLabel date_1_1 = new JLabel("\uC5C5\uCCB4\uBA85");
		date_1_1.setFont(new Font("����", Font.BOLD, 18));
		date_1_1.setBounds(22, 227, 89, 39);
		desktopPane_2.add(date_1_1);

		JLabel date_1_2 = new JLabel("\uC5C5\uCCB4 \uC5F0\uB77D\uCC98");
		date_1_2.setFont(new Font("����", Font.BOLD, 18));
		date_1_2.setBounds(22, 276, 101, 39);
		desktopPane_2.add(date_1_2);

		tfcomcode = new JTextField(10);
		tfcomcode.setBounds(133, 178, 145, 39);
		desktopPane_2.add(tfcomcode);

		tfcomname = new JTextField(10);
		tfcomname.setBounds(133, 227, 145, 39);
		desktopPane_2.add(tfcomname);

		tfcomtel = new JTextField(10);
		tfcomtel.setBounds(133, 276, 145, 39);
		desktopPane_2.add(tfcomtel);

		JLabel loc_1 = new JLabel("\uC218\uAC70 \uC5C5\uCCB4 \uAC80\uC0C9");
		loc_1.setFont(new Font("����", Font.BOLD, 18));
		loc_1.setBounds(301, 351, 132, 39);
		desktopPane_2.add(loc_1);

		JComboBox reloccomboBox = new JComboBox();

		reloccomboBox.setModel(new DefaultComboBoxModel(
				new String[] { "\uC11C\uC6B8", "\uB300\uC804", "\uBD80\uC0B0", "\uB300\uAD6C", "\uACBD\uAE30\uB3C4" }));
		reloccomboBox.setFont(new Font("����", Font.BOLD, 15));
		reloccomboBox.setBounds(429, 352, 112, 39);
		desktopPane_2.add(reloccomboBox);

		panel.setLayout(gl_panel);
		setVisible(true);
		add(panel);
	}

	void event(int memCode, String id) {
		reloccomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if (o == reloccomboBox) {
					String reloc = (String) reloccomboBox.getSelectedItem();
					ArrayList all;
					try {
						String reloca = (String) reloccomboBox.getSelectedItem();
						selectTable(reloc);
					} catch (Exception t) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "��ü�˻� ���� :" + t.getMessage());
					}

				}
			}
		});

		appbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Object o = e.getSource();

				String assch = tfdate.getText();
				System.out.println(assch);
				int memcode = Integer.parseInt(textFieldmem.getText());
				System.out.println("4");
				int machinecode = Integer.parseInt(tfmachinename.getText());
				System.out.println("11");
				AscurrentVO acvo = new AscurrentVO(assch, memcode, machinecode);
				JOptionPane.showConfirmDialog(null, "��û�� �����Ͻðڽ��ϱ�?");
				try {
					asdao.appInsert(acvo);
					System.out.println("��û�Ϸ�!");
				} catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "��û ���� :" + e1.getMessage());
				}

			}
		});
		asloccomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if (o == asloccomboBox) {
					String asloc = (String) asloccomboBox.getSelectedItem();
					ArrayList all;
					try {
						String asloca = (String) asloccomboBox.getSelectedItem();
						selectTable(asloc);

					} catch (Exception eq) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "��ü�˻� ���� :" + eq.getMessage());
					}
					// tfmachinename.setText(asvo.get

				}

			}
		});
		ASrabtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("as ����");
//				tfmachinename.setText("as�Դϴ�.");
				tfmachinename.setEditable(true);
				tfReturn.setEditable(false);
			}
		});
		Returnrabtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���ż���");
//				tfReturn.setText("�����Դϴ�.");
				tfmachinename.setEditable(false);
				tfReturn.setEditable(true);
			}
		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int col = 0;
				int row = table.getSelectedRow();
				int asNum = (Integer) table.getValueAt(row, col);
				try {
					asvo = asdao.findAslist(asNum);

				} catch (Exception c) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, " �˻� ���� :" + c.getMessage());
				}
				tfcomcode.setText(String.valueOf(asvo.getAfsccode()));
				tfcomname.setText(asvo.getAfscname());
				tfcomtel.setText(asvo.getAfsctel());
				System.out.println("��ü �˻� ����");
			}
		});
	}

	// ȭ�鿡 �ʿ��� ��Ÿ�� ����
	void setStyle() {

		// �ؽ�Ʈ�ʵ� ������������ �ʵ��� ����
		tfASlist.setEditable(false);

		// �԰� �����ϴ� �ؽ�Ʈ�ʵ��� ���� ���� ( ���������� )
	}

	void selectTable(String str) {

		try {
			list = new ArrayList();
			list = asdao.AscomSearch(str);
			tmAscom.data = list;
			table.setModel(tmAscom);
			tmAscom.fireTableDataChanged();

		} catch (Exception eq) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "��ü�˻� ���� :" + eq.getMessage());
		}

	}

	class AscomtableModel extends AbstractTableModel {

		ArrayList data = new ArrayList();
		String[] columnNames = { "��ü �ڵ�", "��ü��", "����", "��ü ����ó", " URL ", "���� �ð�", "���" };

		// =============================================================
		// 1. �⺻���� TabelModel �����
		// �Ʒ� �� �Լ��� TabelModel �������̽��� �߻��Լ��ε�
		// AbstractTabelModel���� �������� �ʾұ⿡...
		// �ݵ�� ����� ���� �ʼ�!!!!

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

		// ===============================================================
		// 2. ������ �÷������� ��ȯ�ϱ�
		//
//                  �⺻������ A, B, C, D ��� �̸����� �÷����� �����ȴ�
		public String getColumnName(int col) {
			return columnNames[col];

		}

		void selectTable(String str) {

			try {
				list = new ArrayList();
				list = asdao.RecomSearch(str);
				tmAscom.data = list;
				table.setModel(tmAscom);
				tmAscom.fireTableDataChanged();

			} catch (Exception eq) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "��ü�˻� ���� :" + eq.getMessage());
			}

		}

		class RecomtableModel extends AbstractTableModel {

			ArrayList data = new ArrayList();
			String[] columnNames = { "��ü �ڵ�", "��ü��", "����", "��ü ����ó", " URL ", "���� �ð�", "���" };

			// =============================================================
			// 1. �⺻���� TabelModel �����
			// �Ʒ� �� �Լ��� TabelModel �������̽��� �߻��Լ��ε�
			// AbstractTabelModel���� �������� �ʾұ⿡...
			// �ݵ�� ����� ���� �ʼ�!!!!

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

			// ===============================================================
			// 2. ������ �÷������� ��ȯ�ϱ�
			//
//	                  �⺻������ A, B, C, D ��� �̸����� �÷����� �����ȴ�
			public String getColumnName(int col) {
				return columnNames[col];

			}
		}
	}
}

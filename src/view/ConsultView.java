package view;

<<<<<<< HEAD
import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Font;
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
=======
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
<<<<<<< HEAD
import javax.swing.UIManager;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import model.ConsultDAO;
import model.rec.ConsultVO;

public class ConsultView extends JPanel implements ActionListener {

	JTextField tfRepcode, tfMemCode, tfMememr, taivcon;
	JLabel lbivcon, lbivDate, lbReporter, lbRepdept, lbRepcode, lbMemCode, lbMememr, lbIvNow, lbBackground, lbTitle;
	JComboBox cbRepdept;
	JTable tbReporter, tbivList;
	JButton btnRegist, btnDelete;
	JScrollPane repoterScrollPane, interviewScrollPane;
	JDateChooser hopeDate;
	InterviewTableModel tmInterview;
	ConsultTableModel tmConsult;

	SimpleDateFormat simpleFormat;
	ConsultVO vo;
	ConsultDAO dao;

	int memCode;
	String id, emr, todayFm;
	ArrayList list;

	public ConsultView(int memCode, String id) {
		setBackground(new Color(255, 255, 255));
		this.memCode = memCode;
		this.id = id;

		newObject(memCode, id);
		addLayout();
		eventProc(memCode, id);

		tfMemCode.setText(String.valueOf(memCode));

		// �����ͺ��̽� ����
		try {
			dao = new ConsultDAO();
			emr = dao.findMemTel(memCode);
			tfMememr.setText(emr);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "��������߾�� : " + e.getMessage());
		}
		selectTable();
	}

	// ��ü����
	void newObject(int memCode, String id) {
		tmConsult = new ConsultTableModel();
		tmInterview = new InterviewTableModel();
		tfMemCode = new JTextField();
		tfMemCode.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfMememr = new JTextField();
		tfMememr.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfRepcode = new JTextField();
		tfRepcode.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		cbRepdept = new JComboBox();
		cbRepdept.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tbReporter = new JTable();
		tbReporter.setFont(new Font("����", Font.PLAIN, 12));
		tbivList = new JTable();
		tbivList.setFont(new Font("����", Font.PLAIN, 12));
		repoterScrollPane = new JScrollPane();
		interviewScrollPane = new JScrollPane();
		taivcon = new JTextField();
		taivcon.setForeground(UIManager.getColor("TextArea.foreground"));
		taivcon.setBackground(new Color(255, 255, 255));
		taivcon.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lbBackground = new JLabel("");
		lbBackground.setIcon(new ImageIcon(ConsultView.class.getResource("/Image/signup.jpg")));
		lbTitle = new JLabel("���");
		lbTitle.setFont(new Font("HY�߰��", Font.BOLD, 26));
		lbIvNow = new JLabel("��� ��û ��Ȳ");
		lbIvNow.setFont(new Font("HY�߰��", Font.BOLD, 15));
		lbMemCode = new JLabel("ȸ�� ��ȣ");
		lbMemCode.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lbMememr = new JLabel("��ȣ�� ������");
		lbMememr.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lbivDate = new JLabel("�����¥");
		lbivDate.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lbReporter = new JLabel("����");
		lbReporter.setFont(new Font("HY�߰��", Font.BOLD, 15));
		lbRepcode = new JLabel("�����ڵ�");
		lbRepcode.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lbivcon = new JLabel("��� ����");
		lbivcon.setFont(new Font("HY�߰��", Font.BOLD, 15));
		lbRepdept = new JLabel("���о�");
		lbRepdept.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		btnRegist = new JButton("���");
		btnRegist.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		btnDelete = new JButton("���");
		btnDelete.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		hopeDate = new JDateChooser();
		hopeDate.getCalendarButton().setFont(new Font("HY�߰��", Font.PLAIN, 12));
		simpleFormat = new SimpleDateFormat("yy/MM/dd");
	}

	// �ڸ���ġ
	void addLayout() {
		setLayout(null);
		tfMemCode.setEditable(false);
		tfMemCode.setColumns(10);
		tfMemCode.setBounds(12, 81, 100, 20);
		tfMememr.setEditable(false);
		tfMememr.setColumns(10);
		tfMememr.setBounds(12, 214, 120, 20);
		tfRepcode.setEditable(false);
		tfRepcode.setBounds(12, 326, 100, 20);
		tfRepcode.setColumns(10);
		lbTitle.setBounds(12, 10, 85, 26);
		lbIvNow.setBounds(164, 424, 110, 30);
		lbivcon.setBounds(164, 184, 80, 30);
		lbivDate.setBounds(12, 244, 100, 15);
		lbReporter.setBounds(164, 23, 80, 16);
		lbRepdept.setBounds(12, 122, 86, 15);
		lbRepcode.setBounds(12, 300, 100, 15);
		lbMemCode.setBounds(12, 56, 100, 15);
		lbMememr.setBounds(12, 190, 100, 15);
		lbBackground.setForeground(new Color(0, 128, 255));
		lbBackground.setBackground(new Color(0, 128, 255));
		lbBackground.setBounds(0, 44, 144, 611);

		tbReporter.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "�����ڵ�", "�����̸�", "���μ�" }));
		tbivList.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "����ڵ�", "��� ��� ��¥", "��� ����", "ȸ���ڵ�", "���� �ڵ�" }));

		repoterScrollPane.setBounds(164, 44, 630, 130);
		repoterScrollPane.setViewportView(tbReporter);
		interviewScrollPane.setBounds(164, 452, 630, 150);
		interviewScrollPane.setViewportView(tbivList);
		taivcon.setBounds(164, 214, 630, 183);
		cbRepdept.setModel(new DefaultComboBoxModel(new String[] { "A/S", "����", "����", "����" }));
		cbRepdept.setBounds(12, 147, 63, 20);
		btnRegist.setBounds(704, 405, 90, 22);
		btnDelete.setBounds(704, 612, 90, 22);
		hopeDate.setBounds(12, 270, 120, 20);

		add(tfMemCode);
		add(tfMememr);
		add(tfRepcode);
		add(taivcon);
		add(repoterScrollPane);
		add(interviewScrollPane);
		add(lbMemCode);
		add(lbTitle);
		add(lbIvNow);
		add(lbMememr);
		add(lbivDate);
		add(lbivcon);
		add(lbReporter);
		add(lbRepdept);
		add(lbRepcode);
		add(cbRepdept);
		add(btnRegist);
		add(btnDelete);
		add(hopeDate);
		add(lbBackground);
	}

=======
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import model.ConsultDAO;
import model.rec.ConsultVO;
import javax.swing.JTextArea;

public class ConsultView extends JPanel implements ActionListener{
	
	JTextField tfinDate, tfRepcode, tfMemCode, tfMememr;
	JLabel lblconLabel, lblwdateLabel_1, lblrepLabel_2, lblappLabel_2_1, lblmemcodeLabel_3;
	JComboBox cbRepdept;
	JTable tbReporter;
	JButton btnOkButton, btnCancelButton;
	JScrollPane scrollPane;
	
	ConsultTableModel tmConsult;
	
	ConsultVO vo;
	ConsultDAO dao;
	ArrayList list;
	
	int memCode;
	String id;
	
	public ConsultView(int memCode, String id) {
		this.memCode = memCode;
		this.id = id;
		setLayout(null);
		
		JLabel lbivcon = new JLabel("��� ����");
		lbivcon.setBounds(23, 426, 80, 30);
		add(lbivcon);
		
		JLabel lbivDate = new JLabel("�����¥");
		lbivDate.setBounds(23, 143, 90, 30);
		add(lbivDate);
		
		tfinDate = new JTextField();
		tfinDate.setBounds(136, 140, 120, 30);
		add(tfinDate);
		tfinDate.setColumns(10);
		
		JLabel lbReporter = new JLabel("����");
		lbReporter.setBounds(23, 252, 80, 30);
		add(lbReporter);
		
		JLabel lbRepdept = new JLabel("���о�");
		lbRepdept.setBounds(395, 182, 80, 30);
		add(lbRepdept);
		
		cbRepdept = new JComboBox();
		cbRepdept.setModel(new DefaultComboBoxModel(new String[] {"A/S", "����", "����", "����"}));
		cbRepdept.setBounds(395, 222, 80, 30);
		add(cbRepdept);
		
		tfRepcode = new JTextField();
		tfRepcode.setEditable(false);
		tfRepcode.setBounds(136, 203, 120, 30);
		add(tfRepcode);
		tfRepcode.setColumns(10);
		
		JLabel lbRepcode = new JLabel("�����ڵ�");
		lbRepcode.setBounds(23, 206, 90, 30);
		add(lbRepcode);
		
		JButton btnRegist = new JButton("���");
		btnRegist.setBounds(136, 608, 80, 30);
		add(btnRegist);
		
		JButton btnCancel = new JButton("���");
		btnCancel.setBounds(265, 608, 80, 30);
		add(btnCancel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 292, 452, 110);
		add(scrollPane);
		
		tbReporter = new JTable();
		tbReporter.setModel(new DefaultTableModel(
			new Object[][] { },
			new String[] {"�����ڵ�", "�����̸�", "���μ�"}));
		scrollPane.setViewportView(tbReporter);
		
		JTextArea taivcon = new JTextArea();
		taivcon.setBounds(23, 466, 452, 110);
		add(taivcon);
		
		JLabel lbMemCode = new JLabel("��㳻��");
		lbMemCode.setBounds(23, 43, 90, 30);
		add(lbMemCode);
		
		tfMemCode = new JTextField();
		tfMemCode.setEditable(false);
		tfMemCode.setColumns(10);
		tfMemCode.setBounds(136, 40, 120, 30);
		add(tfMemCode);
		
		JLabel lbMememr = new JLabel("��ȣ�� ������");
		lbMememr.setBounds(23, 87, 90, 30);
		add(lbMememr);
		
		tfMememr = new JTextField();
		tfMememr.setEditable(false);
		tfMememr.setColumns(10);
		tfMememr.setBounds(136, 84, 180, 30);
		add(tfMememr);
		newObject(memCode, id);
		eventProc(memCode, id);
		
		//�����ͺ��̽� ����
		try {
			dao = new ConsultDAO();
			System.out.println("���Ἲ��!");
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,  "��������߾�� : " + e.getMessage());
		}
	}
	
	//��ü����
	void newObject(int memCode, String id) {
		tmConsult = new ConsultTableModel();
	}
	
	//�ڸ���ġ
	void initialize() {
		
	}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	// �̺�Ʈ ����
	public void eventProc(int memCode, String id) {
		this.memCode = memCode;
		this.id = id;
<<<<<<< HEAD

		btnRegist.addActionListener(this);
		btnDelete.addActionListener(this);
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		tbReporter.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int col = 0;
				int row = tbReporter.getSelectedRow();
				String vNum = String.valueOf(tbReporter.getValueAt(row, col));
<<<<<<< HEAD
				tfRepcode.setText(vNum);
			}
		});

		cbRepdept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = (int) cbRepdept.getSelectedIndex();
				if (index == 0) { //as ����
=======
				
				tfRepcode.setText(vNum);
			}
		});
		
		cbRepdept.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cbRepdept.getSelectedIndex();
				if (index == 0) {
					System.out.println("A/S����");
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					ArrayList all;
					try {
						all = dao.ConSearch(index);
						tmConsult.data = all;
						tbReporter.setModel(tmConsult);
						tmConsult.fireTableDataChanged();
					} catch (Exception e1) {
						e1.printStackTrace();
<<<<<<< HEAD
						JOptionPane.showMessageDialog(null, "1�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 1) { // ���� ����
=======
						JOptionPane.showMessageDialog(null,  "1�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 1) {
					System.out.println("���ż���");
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					ArrayList all;
					try {
						all = dao.ConSearch(index);
						tmConsult.data = all;
						tbReporter.setModel(tmConsult);
						tmConsult.fireTableDataChanged();
					} catch (Exception e1) {
						e1.printStackTrace();
<<<<<<< HEAD
						JOptionPane.showMessageDialog(null, "2�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 2) { // ���� ����
=======
						JOptionPane.showMessageDialog(null,  "2�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 2) {
					System.out.println("���ż���");
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					ArrayList all;
					try {
						all = dao.ConSearch(index);
						tmConsult.data = all;
						tbReporter.setModel(tmConsult);
						tmConsult.fireTableDataChanged();
					} catch (Exception e1) {
						e1.printStackTrace();
<<<<<<< HEAD
						JOptionPane.showMessageDialog(null, "3�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 3) { // ���� ����
=======
						JOptionPane.showMessageDialog(null,  "3�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 3) {
					System.out.println("��������");
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					ArrayList all;
					try {
						all = dao.ConSearch(index);
						tmConsult.data = all;
						tbReporter.setModel(tmConsult);
						tmConsult.fireTableDataChanged();
					} catch (Exception e1) {
						e1.printStackTrace();
<<<<<<< HEAD
						JOptionPane.showMessageDialog(null, "4�޺�������߾�� : " + e1.getMessage());
=======
						JOptionPane.showMessageDialog(null,  "4�޺�������߾�� : " + e1.getMessage());
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
					}
				}
			}
		});
	}
<<<<<<< HEAD

	private void selectTable() {
		try {
			ArrayList list = new ArrayList();
			list = dao.findByIvcode(memCode);
			tmInterview.data1 = list;
			tbivList.setModel(tmInterview);
			tbivList.getColumnModel().getColumn(2).setResizable(false);
			tbivList.getColumnModel().getColumn(2).setPreferredWidth(290);
			tmInterview.fireTableDataChanged();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	class ConsultTableModel extends AbstractTableModel {
		ArrayList data = new ArrayList();
		String[] columnNames = { "�����ڵ�", "�����̸�", "���μ�" };

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return data.size();
		}

=======
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	class ConsultTableModel extends AbstractTableModel {
		ArrayList data = new ArrayList();
		String[] columnNames = {"�����ڵ�", "�����̸�", "���μ�"};
		
		public int getColumnCount() {
			return columnNames.length;
		}
		
		public int getRowCount() {
			return data.size();
		}
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		public Object getValueAt(int row, int col) {
			ArrayList temp = (ArrayList) data.get(row);
			return temp.get(col);
		}
<<<<<<< HEAD

=======
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		public String getColumnName(int col) {
			return columnNames[col];
		}
	}
<<<<<<< HEAD

	class InterviewTableModel extends AbstractTableModel {
		ArrayList data1 = new ArrayList();
		String[] columnNames1 = { "����ڵ�", "��� ��� ��¥", "��� ����", "ȸ���ڵ�", "���� �ڵ�" };

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return columnNames1.length;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return data1.size();
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			ArrayList temp1 = (ArrayList) data1.get(rowIndex);
			return temp1.get(columnIndex);
		}

		public String getColumnName(int col) {
			return columnNames1[col];
		}
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

		if (o == btnRegist) {// ��� ��û

			// ��� �����
			Date date = hopeDate.getDate();
			String ivDate = simpleFormat.format(date);
			String ivcon = taivcon.getText();
			int memcode = Integer.parseInt(tfMemCode.getText());
			int repcode = Integer.parseInt(tfRepcode.getText());
			ConsultVO vo = new ConsultVO(ivDate, ivcon, memcode, repcode);
			// ���� ��¥ yy/mm/dd���·� ����
			todayFm = simpleFormat.format(new Date(System.currentTimeMillis()));
			try {
				Date today = new Date(simpleFormat.parse(todayFm).getTime());
				Date hopeDay = new Date(simpleFormat.parse(ivDate).getTime());

				int compare = hopeDay.compareTo(today);
				if (compare < 0) {
					JOptionPane.showMessageDialog(null, "���� ��¥�� ���� �Ұ���");
				} else if (compare > 0) {
					try {
						dao.consultInsert(vo);
						selectTable();
						tfRepcode.setText("");
						cbRepdept.setSelectedIndex(0);
						tmConsult = new ConsultTableModel();
						tbReporter.setModel(tmConsult);
						taivcon.setText("");
						tfRepcode.setText("");
					} catch (Exception e1) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "��� ����");
					}
				} else {
					JOptionPane.showMessageDialog(null, "���� ���� �Ұ���");
				}
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (o == btnDelete) { // ��� ���
			int row = tbivList.getSelectedRow();
			int rNum = (Integer) tbivList.getValueAt(row, 0);
			String ivDate = (String) tbivList.getValueAt(row, 1);
			String ivcon = (String) tbivList.getValueAt(row, 2);
			int memcode = (Integer) tbivList.getValueAt(row, 3);
			int repcode = (Integer) tbivList.getValueAt(row, 4);

			ConsultVO vo = new ConsultVO(ivDate, ivcon, memcode, repcode);
			try {
				if (dao.isPossible(rNum) == false) {
					JOptionPane.showMessageDialog(null, "����� �Ϸ�� ���Դϴ�.");
				} else {
					dao.consultDelete(rNum, vo);
					selectTable();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
=======
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

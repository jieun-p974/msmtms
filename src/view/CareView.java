package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
=======
import java.util.ArrayList;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import model.CareDAO;
import model.rec.CareVO;
import view.CareView.CareTableModel;
import view.CareView.CaregiverTableModel;
<<<<<<< HEAD
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CareView extends JPanel implements ActionListener {
	JTextField tfCareGiver, tfMemCode;
	JLabel lblcgLabel, lblcssdateLabel_2, lblcsldateLabel, lblcgcodeLabel, lblmemcodeLabel_1, lbCareLocation, lblNewLabel;
	JButton btnOk, btnCancel;
	JComboBox comboBox;
	JTable cgtable, apptable;
	JScrollPane SPdesc, scrollPane, scrollPane_1;
	JDateChooser startDate, endDate;
	
=======

public class CareView extends JPanel implements ActionListener {
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JLabel lblcssdateLabel, lblcsldateLabel, lblmemcodeLabel, lblcgLabel, lbldescLabel;
	JLabel lblmemcodeLabel_1, lblcssdateLabel_2, lblcgcodeLabel;
	JButton btnOkButton, btnCancel;
	JComboBox comboBox;
	JScrollPane SPdesc, scrollPane, scrollPane_1;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	CareTableModel tmCare;
	CaregiverTableModel tmgiver;
	CareVO vo;
	CareDAO dao;
<<<<<<< HEAD
	
	ArrayList list;
	int memCode;
	String id, todayFm;
	SimpleDateFormat simpleFormat;


	public CareView(int memCode, String id) {
		setBackground(new Color(255, 255, 255));
		this.memCode = memCode;
		this.id = id;

		newObject();
		addLayout();
		eventProc(memCode, id);
		
=======
	ArrayList list;
	JTable cgtable;
	JTable apptable;
	int memCode;
	String id;

	/**
	 * Create the panel.
	 */
	public CareView(int memCode, String id) {
		this.memCode = memCode;
		this.id = id;

		// eventProc(); �� ���� �ʹٸ� ������ �ϰŶ�
		// ������ ���ؼ� �ϰ� �信�� ��ư �ϳ��ϳ��� �ִ°Ŵ�
		// ���������� Ȯ�δ����� �ǳ�

		newObject();
		initialize();
		eventProc(memCode, id);
		

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		// �����ͺ��̽� ����
		try {
			dao = new CareDAO();
			System.out.println("����Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "������߾�� : " + e.getMessage());
		}
		System.out.println("���� ���� ����Ʈ"+memCode);
		showBookList(memCode);
	}
	
	// ���� ���� ����Ʈ ����
	void showBookList(int memCode) {
		try {
			list = dao.findByCscode(memCode);
			tmgiver.data = list;
			apptable.setModel(tmgiver);
			tmgiver.fireTableDataChanged();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��ü ����
	void newObject() {
<<<<<<< HEAD
		btnOk = new JButton("��û");
		btnCancel = new JButton("���");
		comboBox = new JComboBox();
		tfCareGiver = new JTextField();
		tfMemCode = new JTextField();
=======
		btnOkButton = new JButton("��û");
		btnCancel = new JButton("���");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "����", "����", "�λ�", "���", "����" }));
		// ����
		textField = new JTextField();
		// ����
		textField_1 = new JTextField();
		// �������ڵ�
		textField_2 = new JTextField();
		// ȸ���ڵ�
		textField_3 = new JTextField();
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		lblcgLabel = new JLabel("������");
		lblcssdateLabel_2 = new JLabel("���۳�¥");
		lblcsldateLabel = new JLabel("���ᳯ¥");
		lblcgcodeLabel = new JLabel("�������ڵ�");
		tmCare = new CareTableModel();
		tmgiver = new CaregiverTableModel();
		scrollPane = new JScrollPane();
		cgtable = new JTable();
<<<<<<< HEAD
		scrollPane_1 = new JScrollPane();
		apptable = new JTable();
		lblmemcodeLabel_1 = new JLabel("ȸ���ڵ�");
		startDate = new JDateChooser();
		endDate = new JDateChooser();
		simpleFormat = new SimpleDateFormat("yy/MM/dd");
	}

	void addLayout() {
		setLayout(null);
		
		btnOk.setFont(new Font("HY�߰��", Font.PLAIN, 13));
		btnOk.setBounds(590, 604, 90, 22);
		add(btnOk);
		
		btnCancel.setFont(new Font("HY�߰��", Font.PLAIN, 13));
		btnCancel.setBounds(700, 604, 90, 22);
		add(btnCancel);
		
		comboBox.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		comboBox.setBounds(12, 147, 63, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "����", "����", "�λ�", "���", "����" }));
		add(comboBox);
		
		tfCareGiver.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfCareGiver.setEditable(false);
		tfCareGiver.setColumns(10);
		tfCareGiver.setBounds(12, 326, 100, 20);
		add(tfCareGiver);
		
		tfMemCode.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		tfMemCode.setEditable(false);
		tfMemCode.setText(String.valueOf(memCode));
		tfMemCode.setBounds(12, 81, 100, 20);
		tfMemCode.setColumns(10);
		add(tfMemCode);
		
		lblcgLabel.setFont(new Font("HY�߰��", Font.BOLD, 26));
		lblcgLabel.setBounds(12, 10, 85, 26);
		add(lblcgLabel);
		
		lblcssdateLabel_2.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lblcssdateLabel_2.setBounds(12, 190, 85, 15);
		add(lblcssdateLabel_2);
		
		lblcsldateLabel.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lblcsldateLabel.setBounds(12, 245, 100, 15);
		add(lblcsldateLabel);
		
		lblcgcodeLabel.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lblcgcodeLabel.setBounds(12, 300, 100, 15);
		add(lblcgcodeLabel);
		
		scrollPane.setBounds(164, 42, 630, 280);
		add(scrollPane);
		
		cgtable.setFont(new Font("����", Font.PLAIN, 12));
		cgtable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "�������ڵ�", "�����θ�", "�Ҽ�ȸ��", "����ó", "�޿��ڵ�", "����"}));
		scrollPane.setViewportView(cgtable);
		
		scrollPane_1.setBounds(164, 348, 630, 246);
		add(scrollPane_1);
		apptable.setFont(new Font("����", Font.PLAIN, 12));
		apptable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "���������ڵ�", "������", "������", "ȸ���ڵ�", "�������ڵ�", "��û��¥" }));
		scrollPane_1.setViewportView(apptable);
		
		lblmemcodeLabel_1.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lblmemcodeLabel_1.setBounds(12, 56, 100, 15);
		add(lblmemcodeLabel_1);
		
		startDate.setBounds(12, 214, 120, 20);
		add(startDate);
		endDate.setBounds(12, 270, 120, 20);
		add(endDate);
		
		lbCareLocation = new JLabel("����");
		lbCareLocation.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lbCareLocation.setBounds(12, 122, 86, 15);
		add(lbCareLocation);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src/Image/image437.png"));
		lblNewLabel.setBounds(0, 44, 144, 611);
		add(lblNewLabel);
=======
		cgtable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "�������ڵ�", "�����θ�", "�Ҽ�ȸ��", "����ó", "�޿��ڵ�", "����"}));
		scrollPane.setViewportView(cgtable);
		scrollPane_1 = new JScrollPane();
		apptable = new JTable();
		apptable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "���������ڵ�", "������", "������", "ȸ���ڵ�", "�������ڵ�", "��û��¥" }));
		scrollPane_1.setViewportView(apptable);
		lblmemcodeLabel_1 = new JLabel("ȸ���ڵ�");
	}

	// �ڸ���ġ
	void initialize() {
		setLayout(null);
		btnOkButton.setBounds(12, 369, 91, 23);
		add(btnOkButton);
		btnCancel.setBounds(663, 655, 91, 23);
		add(btnCancel);
		comboBox.setBounds(12, 77, 63, 21);
		add(comboBox);
		textField.setBounds(12, 168, 116, 21);
		add(textField);
		textField.setColumns(10);
		textField_1.setColumns(10);
		textField_1.setBounds(12, 224, 116, 21);
		add(textField_1);
		textField_2.setColumns(10);
		textField_2.setBounds(12, 280, 116, 21);
		add(textField_2);
		textField_3.setText(String.valueOf(memCode));
		textField_3.setBounds(12, 336, 116, 21);
		add(textField_3);
		textField_3.setColumns(10);
		lblcgLabel.setBounds(223, 127, 86, 15);
		add(lblcgLabel);
		lblcssdateLabel_2.setBounds(12, 143, 86, 15);
		add(lblcssdateLabel_2);
		lblcsldateLabel.setBounds(12, 199, 100, 15);
		add(lblcsldateLabel);
		lblcgcodeLabel.setBounds(12, 255, 100, 15);
		add(lblcgcodeLabel);
		scrollPane.setBounds(223, 152, 531, 205);
		add(scrollPane);
		scrollPane_1.setBounds(223, 404, 531, 246);
		add(scrollPane_1);

		lblmemcodeLabel_1.setBounds(12, 311, 100, 15);
		add(lblmemcodeLabel_1);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	}

	// �̺�Ʈ ����
	void eventProc(int memCode, String id) {

		this.memCode = memCode;
		this.id = id;
		
		// ���� ��û
<<<<<<< HEAD
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ������, ������
				Date start = startDate.getDate();
				Date end = endDate.getDate();

				String csstartdate = simpleFormat.format(start);
				String cslastdate = simpleFormat.format(end);

				// tf�� �ҷ�����
				int memcode = Integer.parseInt(tfMemCode.getText());
				int cgcode = Integer.parseInt(tfCareGiver.getText());

				// ���� ��¥ yy/MM/dd ���·� ����
				todayFm = simpleFormat.format(new Date(System.currentTimeMillis()));

				try {
					Date today = new Date(simpleFormat.parse(todayFm).getTime());
					Calendar cal = Calendar.getInstance();
					cal.add(Calendar.DATE, 3);
					Date available = cal.getTime();

					int compare = start.compareTo(available);
					if (compare > 0) {
						// ���ú��� 3�� �ڴϱ� ��û ����
						int compare2 = end.compareTo(start);
						if (compare2 > 0) {
							try {
								vo = new CareVO(csstartdate, cslastdate, memcode, cgcode);
								dao.careInsert(vo);
								JOptionPane.showMessageDialog(null, "��û �Ϸ�");

								showBookList(memCode);
								tfCareGiver.setText("");
							} catch (Exception e3) {
								// TODO: handle exception
								JOptionPane.showMessageDialog(null, "��û���� : " + e3.getMessage());
							}
						} else {
							JOptionPane.showMessageDialog(null, "�������� �����Ϻ��� ������մϴ�.");
						}
					} else {
						JOptionPane.showMessageDialog(null, "�������� ��û�Ϸκ��� 3�� ���Ŀ��� �մϴ�.");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

=======
		btnOkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				String csstartdate = textField.getText();
				String cslastdate = textField_1.getText();
				int memcode = Integer.parseInt(textField_3.getText());
				int cgcode = Integer.parseInt(textField_2.getText());

				System.out.println(csstartdate + " " + cslastdate);

				try {
					vo = new CareVO(csstartdate, cslastdate, memcode, cgcode);
					dao.careInsert(vo);
					JOptionPane.showMessageDialog(null, "��û �Ϸ�");
					showBookList(memCode);
				}catch (Exception e3) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "��û���� : " + e3.getMessage());
				}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			}

		});
		// ������ ���� ��������
		// ������ sysdate�� update
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int col = 0;
				int row = apptable.getSelectedRow();
<<<<<<< HEAD
				int sCode = (Integer) apptable.getValueAt(row, col);
				try {

					if (dao.isStarted(sCode) == true) {
						if (dao.isPossible(sCode) == false) {
							JOptionPane.showMessageDialog(null, "�̹� ����� ���� �Դϴ�.");
						} else {
							dao.CareModify(sCode);
							JOptionPane.showMessageDialog(null, "���úη� ���񽺰� ����˴ϴ�.");
							showBookList(memCode);
						}
					} else if(dao.isStarted(sCode)==false) {
						dao.careCancl(sCode);
						JOptionPane.showMessageDialog(null, "���� ��û�� ��ҵƽ��ϴ�.");
						showBookList(memCode);
					}

=======
				int sCode = (Integer)apptable.getValueAt(row, col);
				try {
					dao.CareModify(sCode);
					JOptionPane.showMessageDialog(null, "���úη� ���񽺰� ����˴ϴ�.");
					showBookList(memCode);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		// click�̿��� clik�ƴϿ���
		// ���̺��� ������ ������ �ڵ� ����
		cgtable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int col = 0;
				int row = cgtable.getSelectedRow();
				String vNum = String.valueOf(cgtable.getValueAt(row, col));

<<<<<<< HEAD
				tfCareGiver.setText(vNum);
=======
				textField_2.setText(vNum);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
			}
		});

		// ������ ������ ���� ����
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				if (index == 0) {
					System.out.println("���Ｑ��");
					ArrayList all;
					try {
						all = dao.CareSearch(index);
						tmCare.data = all;
						cgtable.setModel(tmCare);
						tmCare.fireTableDataChanged();
					} catch (Exception e1) {
						// TODO: handle exception
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "1�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 1) {
					System.out.println("��������");
					ArrayList all;
					try {
						all = dao.CareSearch(index);
						tmCare.data = all;
						cgtable.setModel(tmCare);
						tmCare.fireTableDataChanged();
					} catch (Exception e1) {
						// TODO: handle exception
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "2�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 2) {
					System.out.println("�λ꼱��");
					ArrayList all;
					try {
						all = dao.CareSearch(index);
						tmCare.data = all;
						cgtable.setModel(tmCare);
						tmCare.fireTableDataChanged();
					} catch (Exception e1) {
						// TODO: handle exception
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "3�޺�������߾�� : " + e1.getMessage());
					}

				} else if (index == 3) {
					System.out.println("��󵵼���");
					ArrayList all;
					try {
						all = dao.CareSearch(index);
						tmCare.data = all;
						cgtable.setModel(tmCare);
						tmCare.fireTableDataChanged();
					} catch (Exception e1) {
						// TODO: handle exception
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "4�޺�������߾�� : " + e1.getMessage());
					}
				} else if (index == 4) {
					System.out.println("���󵵼���");
					ArrayList all;
					try {
						all = dao.CareSearch(index);
						tmCare.data = all;
						cgtable.setModel(tmCare);
						tmCare.fireTableDataChanged();
					} catch (Exception e1) {
						// TODO: handle exception
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "5�޺�������߾�� : " + e1.getMessage());
					}
					// TODO Auto-generated method stub
				}
			}

		});
	}

	class CareTableModel extends AbstractTableModel {
		ArrayList data = new ArrayList();
		String[] columnNames = { "�������ڵ�", "�����θ�", "�Ҽ�ȸ��", "����ó", "�޿��ڵ�", "����" };

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

	class CaregiverTableModel extends AbstractTableModel {
		ArrayList data = new ArrayList();
		String[] columnNames = { "���������ڵ�", "������", "������", "ȸ���ڵ�", "�������ڵ�", "��û��¥" };

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
<<<<<<< HEAD
=======

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

package view;

<<<<<<< HEAD
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import model.ReviewDAO;
import model.rec.ReviewVO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
=======
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import model.ReviewDAO;
import model.rec.ReviewVO;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6

public class ReviewView extends JDialog{

	JTextField tfMachineName;
	JTable tbAcceptedReview;
<<<<<<< HEAD
	JLabel lbTitle, lbBackground, lbMachineName, lbRegistReview;
	JButton btnOk;
	ReviewVO vo;
	ReviewDAO dao;

	ReviewTableModel1 tmReview;
	
	ArrayList list;
	String machineName;
	
	public ReviewView(String machineName) {
		getContentPane().setBackground(new Color(255, 255, 255));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Image/rounded-rectangle (2).png"));
		getContentPane().setLayout(null);
		
		this.machineName = machineName;
=======

	ReviewVO vo;
	ReviewDAO dao;
	ArrayList list;

	ReviewTableModel tmReview;
	
	String machineName;

	
	public ReviewView(String machineName) {
		this.machineName = machineName;
		getContentPane().setLayout(null);
		newObject(machineName);
		tfMachineName.setText(machineName);
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		try {
			dao = new ReviewDAO();
			System.out.println("review 디비 연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "review DB연결 실패 : " + e.getMessage());
<<<<<<< HEAD
			e.printStackTrace();
		}
		newObject(machineName);
		tfMachineName.setText(machineName);
		addLayout();
=======
		}
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		selectTable(machineName);
	}

	void selectTable(String text) {
		// TODO Auto-generated method stub
		try {
			ArrayList list = new ArrayList();
			
			list = dao.ReviewSearch(text);
			System.out.println("뷰리스트" + list);
			tmReview.data = list;
			tbAcceptedReview.setModel(tmReview);
			tmReview.fireTableDataChanged();
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "리뷰 검색 실패 : " + e.getMessage());
<<<<<<< HEAD
			e.printStackTrace();
=======
			
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		}
	}
	
	void newObject(String machineName) {
<<<<<<< HEAD
		setSize(522,431);
		lbTitle = new JLabel("리뷰");
		lbTitle.setFont(new Font("HY중고딕", Font.PLAIN, 26));
		lbBackground = new JLabel("");
		lbBackground.setIcon(new ImageIcon("src/Image/image425.png"));
		tfMachineName = new JTextField();
		tmReview = new ReviewTableModel1();
		tfMachineName.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		btnOk = new JButton("확인");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbMachineName = new JLabel("기기명");
		lbMachineName.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lbRegistReview = new JLabel("등록된리뷰");
		lbRegistReview.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		
=======
		setSize(850,700);
		tfMachineName = new JTextField();
		tfMachineName.setEditable(false);
		tmReview = new ReviewTableModel();

		tfMachineName.setFont(new Font("굴림", Font.PLAIN, 15));
		tfMachineName.setBounds(84, 10, 210, 40);
		getContentPane().add(tfMachineName);
		tfMachineName.setColumns(10);

		JLabel lbMachineName = new JLabel("기기명");
		lbMachineName.setFont(new Font("굴림", Font.PLAIN, 15));
		lbMachineName.setBounds(12, 10, 60, 40);
		getContentPane().add(lbMachineName);

		JLabel lbRegistReview = new JLabel("등록된리뷰");
		lbRegistReview.setFont(new Font("굴림", Font.PLAIN, 15));
		lbRegistReview.setBounds(12, 76, 80, 40);
		getContentPane().add(lbRegistReview);

>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 126, 480, 227);
		getContentPane().add(scrollPane);
		tbAcceptedReview = new JTable();
		tbAcceptedReview.setModel(
				new DefaultTableModel(
			new Object[][] {{null, null, null, null},{null, null, null, null},{null, null, null, null},{null, null, null, null}},
			new String[] {"리뷰코드", "내용", "평점", "제품코드"}));
		scrollPane.setViewportView(tbAcceptedReview);
<<<<<<< HEAD
		tbAcceptedReview.setFont(new Font("돋움", Font.PLAIN, 12));
	}
	void addLayout() {
		setLocationRelativeTo(null);
		lbTitle.setBounds(12, 10, 66, 42);
		getContentPane().add(lbTitle);
		tfMachineName.setEditable(false);
		tfMachineName.setBounds(79, 73, 210, 20);
		getContentPane().add(tfMachineName);
		tfMachineName.setColumns(10);
		btnOk.setBounds(401, 363, 91, 23);
		getContentPane().add(btnOk);
		lbMachineName.setBounds(12, 73, 60, 20);
		getContentPane().add(lbMachineName);
		lbRegistReview.setBounds(12, 103, 80, 20);
		getContentPane().add(lbRegistReview);
		lbBackground.setBounds(0, 0, 508, 57);
		getContentPane().add(lbBackground);
	}
//	void event() {
//		btnOk.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
//	}
	
}

class ReviewTableModel1 extends AbstractTableModel {
=======
		tbAcceptedReview.setFont(new Font("Gulim", Font.PLAIN, 12));
	}

}

class ReviewTableModel extends AbstractTableModel {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	ArrayList data = new ArrayList();
	String[] columnNames = { "리뷰코드", "내용", "평점", "제품코드" };

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
		// TODO Auto-generated method stub
		ArrayList temp = (ArrayList) data.get(row);
		return temp.get(col);
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

}

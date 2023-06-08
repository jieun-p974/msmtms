package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import model.AllReviewDao;
import model.ReviewDAO;
import model.rec.ReviewVO;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class AllReview extends JPanel implements ActionListener {

	JTextField tfMachineName, tfReviewAvg, tfShopCode, tfMemberCode;
	JTable tbAcceptedReview;
	JButton btnEdit, btnRegist, btnDelete;
	JTextArea taReviewContent;

	ReviewVO vo;
	ReviewDAO dao;
	AllReviewDao aDao;
	ArrayList list;

	ReviewTableModel tmReview;
	
	int memCode;
	String machineName;

	public AllReview(int memCode, String machineName) {
		this.memCode = memCode;
		this.machineName = machineName;
		setLayout(null);
		newObject(memCode, machineName);
		eventProc(memCode, machineName);
		tfMemberCode.setText(String.valueOf(memCode));
		tfMachineName.setText(machineName);
		selectTable();
		try {
			dao = new ReviewDAO();
			System.out.println("review 디비 연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "review DB연결 실패 : " + e.getMessage());
		}
	}

	void newObject(int memCode, String machineName) {

		tfMachineName = new JTextField();
		tfShopCode = new JTextField();
		tfReviewAvg = new JTextField();
		tfMemberCode = new JTextField();
		tmReview = new ReviewTableModel();
		taReviewContent = new JTextArea();
		btnEdit = new JButton("수정");
		btnRegist = new JButton("등록");
		btnDelete = new JButton("삭제");

		tfShopCode.setFont(new Font("굴림", Font.PLAIN, 15));
		tfShopCode.setBounds(157, 71, 140, 40);
		add(tfShopCode);
		tfShopCode.setColumns(10);

		tfMachineName.setFont(new Font("굴림", Font.PLAIN, 15));
		tfMachineName.setBounds(87, 121, 210, 40);
		add(tfMachineName);
		tfMachineName.setColumns(10);

		tfReviewAvg.setFont(new Font("굴림", Font.PLAIN, 15));
		tfReviewAvg.setBounds(345, 600, 150, 40);
		add(tfReviewAvg);
		tfReviewAvg.setColumns(10);

		btnEdit.setFont(new Font("굴림", Font.PLAIN, 15));
		btnEdit.setBounds(217, 650, 80, 40);
		add(btnEdit);
		btnRegist.setFont(new Font("굴림", Font.PLAIN, 15));
		btnRegist.setBounds(15, 650, 80, 40);
		add(btnRegist);
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 15));
		btnDelete.setBounds(415, 650, 80, 40);
		add(btnDelete);

		JLabel lbMachineName = new JLabel("기기명");
		lbMachineName.setFont(new Font("굴림", Font.PLAIN, 15));
		lbMachineName.setBounds(15, 121, 60, 40);
		add(lbMachineName);

		taReviewContent.setFont(new Font("굴림", Font.PLAIN, 12));
		taReviewContent.setBounds(15, 458, 480, 132);
		add(taReviewContent);

		JLabel lbRegistReview = new JLabel("등록된리뷰");
		lbRegistReview.setFont(new Font("굴림", Font.PLAIN, 15));
		lbRegistReview.setBounds(15, 171, 80, 40);
		add(lbRegistReview);

		JLabel lbShopCode = new JLabel("주문상세내역코드");
		lbShopCode.setFont(new Font("굴림", Font.PLAIN, 15));
		lbShopCode.setBounds(15, 71, 120, 40);
		add(lbShopCode);

		JLabel lbReviewAvg = new JLabel("평점");
		lbReviewAvg.setFont(new Font("굴림", Font.PLAIN, 15));
		lbReviewAvg.setBounds(217, 600, 80, 40);
		add(lbReviewAvg);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 221, 480, 227);
		add(scrollPane);
		tbAcceptedReview = new JTable();
		tbAcceptedReview.setModel(
				new DefaultTableModel(
			new Object[][] {{null, null, null, null},{null, null, null, null},{null, null, null, null},{null, null, null, null}},
			new String[] {"리뷰코드", "내용", "평점", "제품코드"}));
		scrollPane.setViewportView(tbAcceptedReview);
		tbAcceptedReview.setFont(new Font("Gulim", Font.PLAIN, 12));
		
		JLabel lbMemberCode = new JLabel("회원코드");
		lbMemberCode.setFont(new Font("굴림", Font.PLAIN, 15));
		lbMemberCode.setBounds(15, 21, 120, 40);
		add(lbMemberCode);
		
		tfMemberCode.setEditable(false);
		tfMemberCode.setFont(new Font("굴림", Font.PLAIN, 15));
		tfMemberCode.setColumns(10);
		tfMemberCode.setBounds(157, 21, 140, 40);
		add(tfMemberCode);
	}

	void eventProc(int memCode, String machineName) {
		// TODO Auto-generated method stub

		btnEdit.addActionListener(this);
		btnRegist.addActionListener(this);
		btnDelete.addActionListener(this);
		tfMachineName.addActionListener(this);

		tbAcceptedReview.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int col = 0;
				int row = tbAcceptedReview.getSelectedRow();
				int rNum = (Integer) tbAcceptedReview.getValueAt(row, col);
				try {
					vo = dao.findByNum(rNum);
				} catch (Exception e1) {
					// TODO: handle exception
				}
				tfReviewAvg.setText(String.valueOf(vo.getAvg()));
				tfShopCode.setText(String.valueOf(vo.getCode()));
				taReviewContent.setText(String.valueOf(vo.getContent()));
				System.out.println("검색  성공");
			}
		}); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o == btnRegist) {
			String avg = tfReviewAvg.getText();
			String content = taReviewContent.getText();
			int code = Integer.parseInt(tfShopCode.getText());
			ReviewVO vo = new ReviewVO(avg, content, code);

					try {						
				dao.reviewRegist(vo);
					clearScreen();
					System.out.println("등록 완료");
					}catch (Exception e3) {
						// TODO: handle exception
						System.out.println("등록 실패");
					}	
			
		} else if (o == btnEdit) {
			String avg = tfReviewAvg.getText();
			String content = taReviewContent.getText();
			int code = Integer.parseInt(tfShopCode.getText());
			vo = new ReviewVO(avg, content, code);
			int row = tbAcceptedReview.getSelectedRow();
			int rNum = (Integer) tbAcceptedReview.getValueAt(row, 0);
			vo.setNum(rNum);
			
			try {
				int cnt = dao.reviewEdit(vo);
				selectTable();
				if (cnt > 0) {
					System.out.println("수정 완료");
					clearScreen();
				} else {
					System.out.println("수정 실패");
				}
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "리뷰 수정 실패!! : " + e2.getMessage());
			}

		} else if (o == btnDelete) {
			int row = tbAcceptedReview.getSelectedRow();
			int rNum = (Integer) tbAcceptedReview.getValueAt(row, 0);
			vo.setNum(rNum);
			
			try {
				int cnt = dao.reviewDelete(vo);
				selectTable();
				if (cnt > 0) {
					clearScreen();
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "리뷰 삭제 실패!! : " + e2.getMessage());
			}
		} else if (o == tfMachineName) {
			String text = (String)tfMachineName.getText();
			selectTable();
		}
	}

	private void selectTable() {
		// TODO Auto-generated method stub
		String text = tfMachineName.getText();
		try {
			ArrayList list = new ArrayList();

			list = aDao.ReviewSearch(text);
			System.out.println("뷰리스트" + list);
			tmReview.data = list;
			tbAcceptedReview.setModel(tmReview);
			tmReview.fireTableDataChanged();
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "리뷰 검색 실패 : " + e.getMessage());

		}
	}

	void clearScreen() {
		tfReviewAvg.setText(null);
		taReviewContent.setText(null);
	}
}

class ReviewTableModel extends AbstractTableModel {
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

package view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import model.LoginDAO;
import model.rec.LoginVO;

public class Same extends JFrame{
	private ArrayList<LoginVO> lvo;
   //������� ����
   JButton btn;
   JRadioButton[] rbt;
   ArrayList<LoginVO> list;
   String tel;
   LoginVIEW lgv;
   MemlogVIEW mev;
   MyPageView mpv;
   LoginDAO dao;
   LoginVO vo;
   public Same() {
	   lvo = new ArrayList<LoginVO>();
   }

   
	public void addlvo(LoginVO lv) {
	        lvo.add(lv);
	}
	// ���̵� �ߺ� Ȯ��
    public boolean isIDOverlap(String ID) {
    	return lvo.contains(new LoginVO());
    }
    // ȸ�� ����
	public void withdraw(String ID) {
		lvo.remove(getLoginVO(ID));
    }
	// ���� ���� ��������
	public LoginVO getLoginVO(String ID) {
		return lvo.get(lvo.indexOf(new LoginVO()));
	}
	// ȸ������ �ƴ��� Ȯ��
	public boolean contains(LoginVO lv) {
		return lvo.contains(lv);
	}



		
}


	

 


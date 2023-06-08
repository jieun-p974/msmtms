package view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import model.LoginDAO;
import model.rec.LoginVO;

public class Same extends JFrame{
	private ArrayList<LoginVO> lvo;
   //멤버변수 선언
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
	// 아이디 중복 확인
    public boolean isIDOverlap(String ID) {
    	return lvo.contains(new LoginVO());
    }
    // 회원 삭제
	public void withdraw(String ID) {
		lvo.remove(getLoginVO(ID));
    }
	// 유저 정보 가져오기
	public LoginVO getLoginVO(String ID) {
		return lvo.get(lvo.indexOf(new LoginVO()));
	}
	// 회원인지 아닌지 확인
	public boolean contains(LoginVO lv) {
		return lvo.contains(lv);
	}



		
}


	

 


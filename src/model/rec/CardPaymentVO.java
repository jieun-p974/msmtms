package model.rec;

public class CardPaymentVO {
	int num, scode;
	String payway, cardnum, cardwarranty, cvc, cardcom, cardpwdf2;

<<<<<<< HEAD
	public CardPaymentVO() {

	}

	public CardPaymentVO(String cardnum, String cardwarranty, String cvc, String cardcom, String cardpwdf2, int scode) {
=======
	public CardPaymentVO( ) {
		
	}
	
	public CardPaymentVO( String cardnum, String cardwarranty, String cvc, String cardcom,
		 String cardpwdf2, int scode ) {
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		this.cardnum = cardnum;
		this.cardwarranty = cardwarranty;
		this.cvc = cvc;
		this.cardcom = cardcom;
		this.cardpwdf2 = cardpwdf2;
		this.scode = scode;
<<<<<<< HEAD

	}

	public int getNum() {
=======
		
	}

	public int getNum() { 
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPayway() {
		return payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public String getCardwarranty() {
		return cardwarranty;
	}

	public void setCardwarranty(String cardwarranty) {
		this.cardwarranty = cardwarranty;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public String getCardcom() {
		return cardcom;
	}

	public void setCardcom(String cardcom) {
		this.cardcom = cardcom;
	}

	public String getCardpwdf2() {
		return cardpwdf2;
	}

	public void setCardpwdf2(String cardpwdf2) {
		this.cardpwdf2 = cardpwdf2;
	}

	public int getScode() {
		return scode;
	}

	public void setScode(int scode) {
		this.scode = scode;
	}
<<<<<<< HEAD

=======
	
	
	
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

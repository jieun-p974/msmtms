package model.rec;

public class AccountPaymentVO {
	int num, scode;
<<<<<<< HEAD
	String account, name, bank, date, cashbill;

	public AccountPaymentVO() {

	}

	public AccountPaymentVO(String account, String name, String bank, String cashbill, int scode) {

=======
	String  account, name, bank, date, cashbill;
	
	
	public AccountPaymentVO( ) {
		
	}
	
	public AccountPaymentVO(String  account,String  name,String  bank, String  cashbill, int scode) {
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
		this.account = account;
		this.name = name;
		this.bank = bank;
		this.cashbill = cashbill;
		this.scode = scode;
<<<<<<< HEAD

=======
		
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getScode() {
		return scode;
	}

	public void setScode(int scode) {
		this.scode = scode;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCashbill() {
		return cashbill;
	}

	public void setCashbill(String cashbill) {
		this.cashbill = cashbill;
	}
<<<<<<< HEAD

=======
	
	
	
>>>>>>> 179478197bac651ab9a71fda36490aadc2b117d6
}

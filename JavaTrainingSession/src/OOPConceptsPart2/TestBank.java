package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		 System.out.println(USBank.min_bal);
		
	HSBCBank hs = new HSBCBank();
	hs.credit();
	hs.debit();
	hs.transferMoney();
	hs.educationloan();
	hs.carloan();
	
	//dynamic polymorphisim
	//child class object can be referred by parent interface refernce var
	
	 USBank b = new HSBCBank();
	 b.credit();
	 b.debit();
	 b.transferMoney();
	 
	

	}

}

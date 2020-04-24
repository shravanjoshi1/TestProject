package OOPConceptsPart2;

public class HSBCBank implements USBank, BrazilBank { //We are achieving multiple inheritance
	//has -a -relationship
	
	//if a class is implementing any interface, then it is mandatory to define/override all the methods of interface
	
	//US Bank Method
	public void credit() {
		System.out.println("HSBC---Credit");
	}
    public void debit(){
    	System.out.println("HSBC---debit");
    	
    }
	
	public void transferMoney(){
		System.out.println("HSBC---transferMoney");
		
	}
	//Separate Method of HSBC Bank
	
	public void educationloan() {
		System.out.println("hsbc--education loan");
	}
	
	public void carloan() {
		System.out.println("hsbc---car loan");
	}
	//Brazil bank method
	public void mutualFund() {
		System.out.println("hsbc----mutual fund");
	}

}

package trial.book;

public class Account {
	
	int accNo;
	String customerName;

	float balance;

	public String fundTransfer(float amt) {
	//System.out.println(balance);
	//System.out.println(benAcc.balance);
	if(balance<amt) {
		System.out.println("Sorry boss u hv no enough funds");
		return "Sorry boss u hv no enough funds";
	}
	else {
		balance=balance-amt;
		//benAcc.balance=benAcc.balance+amt;
		
	}
	return "I have trasfered the amount"+amt;
	//write the b logic 
}
}

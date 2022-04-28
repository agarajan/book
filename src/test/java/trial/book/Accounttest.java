package trial.book;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//@TestInstance(Lifecycle.PER_CLASS)
public class Accounttest {
	
	
	
	@Test
	public void testFundTransfer()
	{
		List<String> l=new ArrayList<String>();
		
		System.out.println("I am called after before all");
		Account acc=new Account();
		
		acc.balance=1000;
		//System.out.println("result printed"+acc.fundTransfer(100));
		
		
		
		assertEquals(acc.fundTransfer(100),"I have trasfered the amount100.0");

		assertEquals(acc.balance,900,0);
		assertEquals(acc.fundTransfer(100),"I have trasfered the amount100.0");

		assertEquals(acc.balance,800,0);
		
		assertEquals(acc.fundTransfer(200),"I have trasfered the amount200.0");

		assertEquals(acc.balance,600,0);
		assertEquals(acc.fundTransfer(100),"I have trasfered the amount100.0");

		assertEquals(acc.balance,500,0);
		assertEquals(acc.fundTransfer(600),"Sorry boss u hv no enough funds");
		

		
	}
	
	@BeforeAll
	public static void firstMethodPassing()
	{
		System.out.println("I am the first method called before any test");
	}

		

}

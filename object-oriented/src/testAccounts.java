import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Current;
import com.ibm.bank.Savings;

public class testAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Accounts a1=new Accounts(" ABC", 50000);
//		a1.deposit(50000);
//		a1.summary();
//		
//		Accounts a2=new Accounts(" DEF", 35000);
//		a2.withdraw(10000);
//		a2.summary();
//		
//		Accounts a3=new Accounts(" GHI", 25000);
//		a3.withdraw(30000);
//		a3.summary();
//		Savings s1=new Savings("ABC");
//		s1.deposit(1000);
//		s1.withdraw(2000);
//		s1.summary();
//		Current c1=new Current("Ben");
//		c1.summary();
//		c1.withdraw(3000);
//		c1.withdraw(5000);
//		c1.summary();
//		c1.deposit(2000);
//		c1.deposit(4000);
//		c1.summary();
		AccountFactory factory=new AccountFactory();
		Bank s=factory.openSavingsAccount("polo");
		
//		Savings s=new Savings("polo");
		try {
			s.withdraw(100);
		}catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}

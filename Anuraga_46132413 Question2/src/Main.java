import com.cg.exception.InsufficientBalanceException;
import com.cg.modal.Account;
import com.cg.modal.Transaction;
public class Main 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account(123,7000);
		a1.setAccountHolderName("Anu");
		a1.setOpenedDate("25/09/2021");
		System.out.println("Account Holder Name : " + a1.getAccountHolderName());
		System.out.println("Account Opened Date : " + a1.getOpenedDate());
		System.out.println("Account Number      : " + a1.getAccountNumber());
		System.out.println("Account Balance     : " + a1.getBalance());
		try
		{
			Transaction.withdraw(a1,1000);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("After transaction balance : "+a1.getBalance());
		

	}

}

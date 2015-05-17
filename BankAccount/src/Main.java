public class Main 
{

	public static void main(String[] args)
	{
		Account savingsAccount = new Account (123, "Savings", 456);
		//savingsAccount.UpdateAmountSecurely(500, "admin");
		savingsAccount.UpdateAmountSecurely(0, null);
		savingsAccount.UpdateAmountSecurely(0, "thief");
		//savingsAccount.m_amount=(0);
		//System.out.println("Updated amount in account id " + savingsAccount.getM_accountId() + " to " + savingsAccount.getM_amount());

	}
}


public class Account 
{
	private int m_accountId = -1;
	private String m_accountName;
	private int m_customerId = -1;
	private double m_amount = 0.0;

	public Account(int accountId, String accountName, int customerId)
	{
		setAccountId(accountId);
		setAccountName(accountName);
		setCustomerId(customerId);
	}


	public String getM_accountName() 
	{
		return m_accountName;
	}


	private void setAccountName(String accountName)
	{
		m_accountName = accountName;
	}
// i also forgot to put an A in (set Account name) 

	public int getM_customerId() 
	{
		return m_customerId;
	}


	private void setCustomerId(int customerId) 
	{
		m_customerId = customerId;
	}

/* using the debuger i found that I didnt put a C in customer 
 * (that is where a break point is */
	public double getAmount()
	{
		return m_amount;
	}


	public void setAmount(double amount) 
	{
		m_amount = amount;
	}


	public int getAccountId() 
	{
		return m_accountId;
	}


	public void setAccountId(int accountId) 
	{
		m_accountId = accountId;
	}



	public void UpdateAmount(double newAmount)
	{
		setAmount(newAmount);
	}

	public void UpdateAmountSecurely(double newAmount, String password)
	{
		if (password != null) 
			//always do a null check
		{
			if (password.equals("admin"))
			{
				UpdateAmount(newAmount);
				System.out.println("Updated amount in account id " + getAccountId() + " to " + getAmount());
			}
			else
			{
				System.out.println("Call the police! Unsecure access!!");
			}
			//this is where either (else will be choosen)
		}
		else 
			System.out.println("Null pasword submitted, please cheeck and resubmit.");
	}
}

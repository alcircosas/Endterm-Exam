package ecpe205;

public class Checking extends Account
{
	public Checking(int accountNumber)
	{
		super(accountNumber);
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public String getAccountInfo()
	{
		return("Checking Account Information\nAcct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}

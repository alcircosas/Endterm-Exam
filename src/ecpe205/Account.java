package ecpe205;
public abstract class Account
{
	protected int accountNumber;
	protected double balance;

	public Account(int acctNum)
	{
		accountNumber = acctNum;
		setBalance(0.0);
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	public abstract int getAccountNumber();
	public abstract double getBalance();
	public abstract String getAccountInfo();
}



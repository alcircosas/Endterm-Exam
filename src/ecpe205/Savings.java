package ecpe205;

public class Savings extends Account
{
	private double interestRate;

	public Savings(int accountNumber, double interest)
	{
		super(accountNumber);
		setInterestRate(interest);
	}

	public void setInterestRate(double interest)
	{
		interestRate = interest;
	}
	public double getInterestRate()
	{
		return interestRate;
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
		return("Savings Account Information\nAccount Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}
}


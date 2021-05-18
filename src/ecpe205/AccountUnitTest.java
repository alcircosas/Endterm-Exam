package ecpe205;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;

class AccountUnitTest {
	@Test
	void checking ()
	{
		Checking checking = new Checking (1);
		JOptionPane.showMessageDialog (null, checking.getAccountInfo());

	}
	@Test
	void savings ()
	{
		Savings savings = new Savings (1, 0);
		JOptionPane.showMessageDialog (null, savings.getAccountInfo());
	}
		public static void main(String[] args)
		{
			Checking aCheckingAccount = new Checking(1);
			Savings aSavingsAccount = new Savings(2, 0);

			JOptionPane.showMessageDialog (null, aCheckingAccount.getAccountInfo());
			JOptionPane.showMessageDialog (null, aSavingsAccount.getAccountInfo());
		}

	{
		Account[] accountArray = new Account[10];
		
		accountArray[0] = new Checking(1);
		accountArray[1] = new Checking(2);
		accountArray[2] = new Checking(3);
		accountArray[3] = new Checking(4);
		accountArray[4] = new Checking(5);
		accountArray[5] = new Savings(6, 0);
		accountArray[6] = new Savings(7, 0);
		accountArray[7] = new Savings(8, 0);
		accountArray[8] = new Savings(9, 0);
		accountArray[9] = new Savings(10, 0);
		
		for(int i = 0; i < accountArray.length; ++i)
			JOptionPane.showMessageDialog(null, accountArray[i].getAccountInfo() + "\n");
	}
}

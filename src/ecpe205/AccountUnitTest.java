package ecpe205;

import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;

class AccountUnitTest {
		public static void main(String[] args)
		{
			Checking aCheckingAccount = new Checking(1);
			Savings aSavingsAccount = new Savings(2);

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
		accountArray[5] = new Savings(6);
		accountArray[6] = new Savings(7);
		accountArray[7] = new Savings(8);
		accountArray[8] = new Savings(9);
		accountArray[9] = new Savings(10);
		
		for(int i = 0; i < accountArray.length; ++i)
			System.out.println(accountArray[i].getAccountInfo() + "\n");
	}
}

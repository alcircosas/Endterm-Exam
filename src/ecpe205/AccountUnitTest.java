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
	}



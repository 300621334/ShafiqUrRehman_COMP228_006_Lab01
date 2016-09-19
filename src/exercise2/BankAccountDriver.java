package exercise2;
import java.util.Scanner;
import javax.swing.JOptionPane;//Needed for GUI

public class BankAccountDriver {

	public static void main(String[] args) {
		double amount = 0;
		String message;
		
BankAccount account1 = new BankAccount();//instantiate account
Scanner input = new Scanner(System.in); //init Scanner
//System.out.print(account1.getAccountInfo());
account1.getAccountInfo();//display account info


//prompt user to select from withdraw or deposit:
System.out.printf("\n%s\n%s\n%s\n", "Select", "(1) - Deposit", "(2) - Withdraw");
String choice = input.nextLine();

switch(choice)
{
case "1":
	System.out.print("\nHow much would you like to deposit: ");
	amount = input.nextDouble();
	account1.deposit(amount);
	break;
case "2":
	System.out.print("\nHow much would you like to withdraw:");
	amount = input.nextDouble() * -1;
	while((account1.getBalance() + amount) < 0)
	{
		System.out.println("\nWithdrawal amount exceeded account balance");
		System.out.print("\nHow much would you like to withdraw:");
		amount = input.nextDouble() * -1;
	}
	account1.withdraw(amount);
	break;
}

input.close();
//System.out.print(account1.getAccountInfo());//display account info
account1.getAccountInfo();//display account info
	}

}

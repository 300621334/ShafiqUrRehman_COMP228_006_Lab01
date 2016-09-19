package exercise2;
/**Author: SHAFIQ-UR-REHMAN
 * program to record and display bank account information*/

public class BankAccount {
	public int account;
	public double balance;
	public String name;
	String display = "";
		
	//constructor
	public BankAccount()
	{
		this.account = 1001;
		this.balance = 100.00;
		this.name = "Bill";
	}
	
	//getters
	public int getAccount()
	{
		return account;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
	public double getBalance()
	{
		return balance;
	}
	
	public void withdraw(double amount)
	{
		balance = balance + amount;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
		
	public void getAccountInfo()
	{
		
		/*display += String.format("\n%20s%20s%20s\n", "Account Number", "Name", "Balance");
		display += String.format("%s", "-------------------------------------------------------------\n");
		display += String.format("%20d%20s%20.2f", account,name,balance);
		return display;*/

				
		System.out.printf("\n%20s%20s%20s\n", "Account Number", "Name", "Balance");
		System.out.printf("%s", "-------------------------------------------------------------\n");
		System.out.printf("%20d%20s%20.2f", account,name,balance);	
	}
	

}

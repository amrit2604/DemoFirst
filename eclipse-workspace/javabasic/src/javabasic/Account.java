package javabasic;

public class Account 
{
	String acc_holder_name;
	long acc_num;
	double balance;

	public Account(String acc_holder_name, long acc_num, double balance)
	{
		this.acc_holder_name = acc_holder_name;
		this.acc_num = acc_num;
		this.balance = balance;
				
	}
	 
	public void deposit(double bal)
	{
	   balance=balance+bal;
	}
	
	public void withdraw(double bal)
	{
	 if(balance>bal)
	{
	balance=balance-bal;
	}
	else 
	{
		System.out.println("Insufficient balance");
	}
	}
	public void display()
	{
		System.out.println("Account Holder Name : "+acc_holder_name);
		System.out.println("Account Number : "+acc_num);
		System.out.println("Balance : "+balance);
	}
	public static void main(String[] args)
	{
		Account a1=new Account("Supriti", 2345678, 1000.0);
		a1.display();
		System.out.println("-------------");
		a1.deposit(500.0);
		a1.display();
		System.out.println("-------------");
		a1.withdraw(1700.0);
		a1.display();
	}
	}


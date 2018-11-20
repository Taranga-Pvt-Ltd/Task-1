package com.atm.praveen;

public class Customer {																							//FOR CUSTOMERS
	public int custnoa=1,custnob=2,custnoc=3;
    public int pina=11,pinb=22,pinc=33;
    public String custnamea="praveen",custnameb="kumar",custnamec="himavanth";
    
	public Customer()
	{
	 
	 int pin;
	 final int CHECKING_ACCOUNT=1;
	 final int SAVING_ACCOUNT=1;
	} 
	
	public boolean match()
	 {
		ATM atm=new ATM();
		 final int CHECKING_ACCOUNT=1;
		 return custnoa>CHECKING_ACCOUNT||custnob>CHECKING_ACCOUNT||custnoc>CHECKING_ACCOUNT;
		
	 }
	 
	public void getAccount()
	{
		BankAccount bc=new BankAccount();
		bc.BankAccount();
	}
	 
}

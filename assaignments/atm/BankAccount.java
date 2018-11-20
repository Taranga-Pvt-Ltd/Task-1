package com.atm.praveen;

import java.util.Scanner;

public class BankAccount {
	double balancea=10000,balanceb=30000,balancec=40000;
	
	public void BankAccount()
	{
		int a=11,b=22,c=33;
	}
	
	public void deposit()																		//FOR MONEY DEPOSIT
	{
		KeyPad kp=new KeyPad();
	Customer cc=new Customer();
		
		System.out.println("enter the amount to be deposited: ");
		Scanner sc=new Scanner(System.in);
		double amt=sc.nextDouble();
		if(cc.custnoa==1 || cc.custnob==2 || cc.custnoc==3)
		{
			if(cc.custnoa==1)
		{
			double depa=balancea+amt;
			System.out.println("AMOUNT CREADICTED..NEW BALANCE:"+depa);
		}
		else if(cc.custnob==2)
		{
			double depb=balanceb+amt;
			System.out.println("AMOUNT CREADICTED..NEW BALANCE:"+depb);
		}
		else if(cc.custnoc==3)
		{
			double depc=balancec+amt;
			System.out.println("AMOUNT CREADICTED..NEW BALANCE:"+depc);
		}
		sc.close();
		} 
	}
	
	public void withdraw()																					//FOR MONEY WITHDRAW 
	{
		Customer cc=new Customer();
		if(cc.custnoa==1 || cc.custnob==2 || cc.custnoc==3)
		{
		System.out.println("AMOUNT TO BE WITHDRAW?: ");
		Scanner sc=new Scanner(System.in);
		double amt=sc.nextDouble();
		if(cc.custnoa==1 && balancea>500 )
		{
			double wd=balancea-amt;
			System.out.println("WITHDRWED AMOUNT = "+amt+"\n NEW BALANCE:"+wd);
		}
		else if(cc.custnob==2 && balanceb>500)
		{
			double wd=balanceb-amt;
			System.out.println("WITHDRWED AMOUNT = "+amt+"\n NEW BALANCE:"+wd);
		}
		else if(cc.custnoc==3 && balancec>500)
		{
			double wd=balancec-amt;
			System.out.println("WITHDRWED AMOUNT = "+amt+"\n NEW BALANCE:"+wd);
		}
		sc.close();
		} 
	}
}

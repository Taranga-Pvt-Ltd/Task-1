package com.atm.praveen;

import java.util.Scanner;

public class ATM {
	
	BankAccount ba=new BankAccount();
	Customer cc=new Customer();
	Scanner sc=new Scanner(System.in);
	KeyPad kp=new KeyPad();
	
	public ATM()
	{
		
	}

	public void AtmMain()												//ATM MAIN MENU
	{
		System.out.println("TYPE OF ACCOUNT?");
		System.out.println("1.BALANCE CHECKING?\n 2.WITHDRAW\n 3.DEPOSITE\n");
		int select=sc.nextInt();
		
		if(select==1)
		{
			if(cc.custnoa==1)
				
				System.out.println("BALANCE:"+ba.balancea);
			else if(cc.custnob==2)
				System.out.println("BALANCE:"+ba.balanceb);
			else if(cc.custnoc==3)
				System.out.println("BALANCE:"+ba.balancec);
		}
		else if(select==2)
		{
			Accounttype();
			
		}
		else if(select==3)
		{
			ba.deposit();
			System.exit(0);
		}
		else
		{
			System.out.println("INVALID SELECTION TYPE..EXIT");
			System.exit(0);
			
		}
	}

	private void Accounttype() {									//ACCOUNT TYPE
		System.out.println("ACCOUNT TYPE?");
		System.out.println("1.CURRENT ACCOUNT");
		System.out.println("2.SAVINGS ACCOUNT\n");
		int sel=sc.nextInt();
		if(sel==1 || sel==2)
			ba.withdraw();
		System.exit(0);
		sc.close();
	}
}

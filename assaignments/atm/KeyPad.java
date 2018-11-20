package com.atm.praveen;

import java.util.Scanner;

public class KeyPad {
	double value;
	int cn,pin;																			//customer number and pin number

	public void KeyPad()																// for atm keypad
	{
		ATM atm=new ATM();
		System.out.println("\n\t\t\tWELCOME TO THE ITIE \n");
		System.out.println("INSERT ATM CARD PLZ\n");
		Customer cc=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("PIN?:");
		int pin=sc.nextInt();
		
		if(pin!=cc.pina && pin!=cc.pinb && pin!=cc.pinc)
		{
			System.out.println("WRONG PIN ,TRY AGAIN");
		System.exit(0);
		}else if(pin==cc.pina || pin==cc.pinb || pin==cc.pinc)
		    {
			System.out.println("ENTER CUSTOMER NUMBER:");
			int cn=sc.nextInt();
			if(cn!=cc.custnoa && cn!=cc.custnob && cn!=cc.custnoc)
			{
				System.out.println("WRONG CUSTOMER NUMBER ,TRY AGAIN");
				System.exit(0);
			}
			else if(pin==cc.pina && cn==cc.custnoa)
			{
				System.out.println("YOUR ACCOUNT NAME IS PRAVEEN\n");
				atm.AtmMain();
				
			}
			else if(pin==cc.pinb && cn==cc.custnob)
			{
				System.out.println("YOUR ACCOUNT NAME IS KUMAR\n");
				atm.AtmMain();	
			}
			else if(pin==cc.pinc && cn==cc.custnoc)
			{
				System.out.println("YOUR ACCOUNT NAME IS HIMAVANTH\n");
				atm.AtmMain();	
			}
			else
			{
				System.out.println("INVALID USER");
				System.exit(0);
			}
		   }
	}

}

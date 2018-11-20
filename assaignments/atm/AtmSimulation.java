package com.atm.praveen;

import java.io.IOException;

public class AtmSimulation {											//ATM SIMULATION 
	public static void main(String[] args) throws IOException
	{
	 ATM atm=new ATM();
	 Bank b=new Bank();
	 Customer cc=new Customer();
	 BankAccount ba=new BankAccount();
	 KeyPad kp=new KeyPad();
	 
	 kp.KeyPad();
	}
}

package com.accenture.thread;

import java.util.Scanner;

class Account
{
	int amount=0;
	synchronized public void printAmount()
	{
		if(amount<=0)
		{
			System.out.println("Thread sent to waiting state");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Current Amount: "+amount);
		}
	}
	public void deposit(int amount)
	{
		this.amount=amount;
		System.out.println("Amount initialized");
		synchronized(this)
		{
			notify();
		}
		System.out.println("Thread resumed");
	}
}
public class AccountThreadDemo {

	public static void main(String[] args)
	{
		Account account=new Account();
		Scanner sc=new Scanner(System.in);
		Thread t1=new Thread()
				{
				public void run()
				{
					account.printAmount();
				}
				};
				Thread t2=new Thread()
				{
				public void run()
				{
					System.out.print("Enter Amount");
					account.deposit(sc.nextInt());
				}
				};
				t1.start();
				t2.start();

	}

}

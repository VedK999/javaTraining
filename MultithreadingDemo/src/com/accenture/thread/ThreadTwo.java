package com.accenture.thread;

public class ThreadTwo extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<8;i++)
		{
			System.out.println("Thread Name: "+Thread.currentThread().getName()+" "+i);
		}
	}
}

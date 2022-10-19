package com.accenture.thread;

public class ChildThread implements Runnable
{
	int table=2;

	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			//System.out.println(table+"X"+i+"="+(table*i));
			System.out.println("Current Thread: "+Thread.currentThread().getName());
		}
	}

}

package com.accenture.thread;

public class TestThread2 {

	public static void main(String[] args) 
	{
		ChildThread t1=new ChildThread();
		ChildThread t2=new ChildThread();
		Thread thread1=new Thread(t1,"Thread One");
		Thread thread2=new Thread(t2,"Thread Two");
		thread1.start();
		thread2.start();
		
	}

}

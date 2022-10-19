package com.accenture.thread;

public class TestThread {

	public static void main(String[] args) 
	{
		System.out.println("Current Thread Name: "+Thread.currentThread().getName());
		ThreadOne t1=new ThreadOne();
		ThreadTwo t2=new ThreadTwo();
		ThreadTwo t3=new ThreadTwo();
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("T1 Priority: "+t1.getPriority());

		System.out.println("T2 Priority: "+t2.getPriority());

		System.out.println("T3 Priority: "+t3.getPriority());
		
		
	}

}

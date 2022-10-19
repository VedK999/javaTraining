package com.accenture.lkm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo1 {

	public static void main(String[] args) throws IOException 
	{
		//BufferedReader buf=new BufferedReader(new FileReader("c://users//kausar.khan//data.txt"));
		String str=null;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter some string");
		str=buf.readLine();
		int c=0;
		/*
		 * while((c=buf.read())!=-1) { System.out.print(" "+(char)c); }
		 */
		System.out.println(" Data: "+str);
	}

}

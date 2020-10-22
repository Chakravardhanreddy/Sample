package com.nttdata.ChracterStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {
	
	public static void process(String str)
	{
		System.out.println("Processing..."+str+"\n");
	}
	
	void ReadFromFile()
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String line="";
		while(!(line.equalsIgnoreCase("quit"))&&!line.equalsIgnoreCase("exit"))
				{
			System.out.println("enter..");
			try {
				line=bf.readLine();
			} catch(IOException e)
			{
				e.printStackTrace();
			}
				}
		
	}
	
	public static void main(String[] args) {
		
		
		BufferReaderEx b=new BufferReaderEx();
		b.ReadFromFile();
	}

}

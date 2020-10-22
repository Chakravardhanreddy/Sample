package com.nttdata.ByteStrea;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	
	void writeData()
	{
		
		DataOutputStream dout;
		try {
			dout =new DataOutputStream(new FileOutputStream("phone.txt"));
			dout.writeInt(12);
			dout.writeDouble(14.5);
			dout.writeBoolean(true);
			dout.writeChar('6');
			dout.writeLong(26479);
			System.out.println("data is written");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	void readData()
	{
		try
		{
			DataInputStream din=new DataInputStream(new FileInputStream("phone.txt"));
			int a=din.readInt();
			double b=din.readDouble();
			boolean c=din.readBoolean();
			
			char d=din.readChar();
			long e=din.readLong();
			System.out.println("values read from File are :"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
		} catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DataOutputStreamEx d=new DataOutputStreamEx();
		//d.writeData();
		d.readData();
	}
	

}

package com.nttdata.ByteStrea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	
	void writeToFile()
	{
		
		try {
			FileOutputStream out = new FileOutputStream("C:/Users/DELL/Documents/java/new.txt");
			
			out.write(65);
			out.close();
			System.out.println("file is written");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	void readFromFile()
	{
		
		try {
			FileInputStream in= new FileInputStream("C:/Users/DELL/Documents/java/new.txt");
			
			int i=in.read();
			
			System.out.println((char)i);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		FileOutputStreamEx f=new FileOutputStreamEx();
		f.writeToFile();
		//f.readFromFile();
		
		
	}

}

package com.nttdata.ByteStrea;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrittenEx {
	
	void writeToFile()
	{
		try {
		FileWriter w=new FileWriter("C:/Users/DELL/Documents/java/Character/new.txt");
		w.write("Java Training");
		w.close();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		FileWrittenEx f=new FileWrittenEx();
		f.writeToFile();
	
	}

	

}
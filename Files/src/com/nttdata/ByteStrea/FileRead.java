package com.nttdata.ByteStrea;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	void readFile()
	{
	try {
	FileReader fr=new FileReader("C:/Users/DELL/Documents/java/Character/new.txt");
	int i;
	while((i=fr.read())!=-1)
	{
	System.out.print((char)i);

	}

	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}






	public static void main(String[] args) {
	// TODO Auto-generated method stub
	FileRead fre=new FileRead();
	System.out.println("File has been read");
	fre.readFile();
	}


}

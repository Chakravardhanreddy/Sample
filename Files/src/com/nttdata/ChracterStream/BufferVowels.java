package com.nttdata.ChracterStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferVowels {
	
	void writeToFile()
	{
	try
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/DELL/Documents/fileexample/vowel.txt"));
		bw.write(" hyd");
		bw.close();
		System.out.println("written to file");
	} catch(IOException e)
	{
		e.printStackTrace();
	}
	

}
	
	void readFromFile()
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:/Users/DELL/Documents/fileexample/vowel.txt"));
			int vow_count=0;
			String vow_str=br.readLine();
			for(int i=0;i<vow_str.length();i++)
			{
				char ch=vow_str.charAt(i);
				if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
				{
					vow_count++;
				}
			}
			System.out.println("number of vowels in :\n"+vow_str+"\n"+vow_count);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		
		
		BufferVowels bv=new BufferVowels();
		bv.writeToFile();
		bv.readFromFile();
	}
}

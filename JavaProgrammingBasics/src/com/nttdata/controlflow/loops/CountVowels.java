package com.nttdata.controlflow.loops;

public class CountVowels {
public static void main(String[] args) {
	String s="hello i am new to java and just learning";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
			count++;
			
	}
	System.out.println("number of vowels are" +count);
	
}
}

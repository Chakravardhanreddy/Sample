package com.nttdata.controlflow.loops;

public class Anagram {
	public static void main(String[] args) {
		
		String s1="software";
		String s2="swearoft";
		String r="";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
					r+=s2.charAt(j);
			}
		}
		System.out.println(r);
		if(r.compareTo(s1)==0)
			System.out.println("given string is anagram");
		else
			System.out.println("given string is not anagram");
	}

}

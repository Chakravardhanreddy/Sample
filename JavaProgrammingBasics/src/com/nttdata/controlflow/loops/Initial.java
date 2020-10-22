package com.nttdata.controlflow.loops;

public class Initial {
	public static void main(String[] args) {
		String s="Cheemala Chakravardhanreddy";
		String r="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				break;
			else
				r=r+s.charAt(i);
		}
		System.out.println(r);
	}

}

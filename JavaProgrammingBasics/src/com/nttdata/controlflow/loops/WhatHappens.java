package com.nttdata.controlflow.loops;

public class WhatHappens {
	public static void main(String[] args) {
		 String original="software";
		 StringBuffer result=new StringBuffer("hi");
		 int index=original.indexOf('a');
		 result.setCharAt(0, original.charAt(0));//1
		 result.setCharAt(1, original.charAt(original.length()-1));//2
		 result.insert(1, original.charAt(4));//3
		 result.append(original.substring(1,4));//4
		 result.insert(3, original.substring(index,index+2)+" ");//5
		 System.out.println(result);
	}

}

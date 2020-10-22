package com.nttdata.Assignment;

public class Message {
	
	Message(String m)
	{
		System.out.println(m);
		
	}

	public static void main(String[] args) {
		
		
		Messager m=Message::new;
		m.getMessage("Hi");
	}
}

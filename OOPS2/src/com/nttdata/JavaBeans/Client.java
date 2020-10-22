package com.nttdata.JavaBeans;

public class Client {
	public static void main(String[] args) {
		Marks mks1 = new Marks(97, 95, 98);
		MarksDao mdao1 = new Student("Chakri");
		mdao1.createMarks(mks1);

		

		
		Marks mks2 = new Marks(90, 85, 80);
		MarksDao mdao2 = new Student("Rajesh");
		mdao2.createMarks(mks2);
	}

}

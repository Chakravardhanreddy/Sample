package com.nttdata.controlflow.loops;

public class Convert {
	public static void main(String[] args) {
		String base5String = "230";
		int result = Integer.valueOf(base5String, 5);
		System.out.println(result);
	}

}

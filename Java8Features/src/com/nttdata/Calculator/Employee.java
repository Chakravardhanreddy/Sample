package com.nttdata.Calculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Employee {
	
	
	
	int empId;
	String name;

	
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	



	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(12,"chakri"));
		list.add(new Employee(14,"rajesh"));
		list.add(new Employee(15,"naveen"));
		
		Collections.sort(list, (e1,e2)->{
			return e1.name.compareTo(e2.name);
		});
		
		for(Employee e:list)
		{
			System.out.println("Name are :"+e.name);
		}
		
		}
	}



package InheritanceAssignments;
import java.util.Scanner;

public class Employee {
	

	int eid;
	String ename;
	String eadd;
	String edoj;
	int basesal=20000;

	Scanner scan =new Scanner(System.in);

	public void input()
	{
	System.out.println("enter employee id: ");
	eid =scan.nextInt();
	System.out.println("enter employee name: ");
	ename=scan.next();
	System.out.println("enter employee address: " );
	eadd=scan.next();
	System.out.println("enter employee doj ");
	edoj=scan.next();
	}

	public void display()
	{
	System.out.println("employee id is : "+eid);
	System.out.println("employee name is :"+ename);
	System.out.println("employee address is :"+eadd);
	System.out.println("employee doj is :"+edoj);
	System.out.println("employee base salary "+basesal);
	}




}

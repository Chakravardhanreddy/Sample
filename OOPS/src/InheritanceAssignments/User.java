package InheritanceAssignments;
import java.util.Scanner;
public class User extends Employee {
	Scanner scan=new Scanner(System.in);

	double usersal;
	double i;
	double in;
	public void usersalary()
	{
	System.out.println("enter the incentive to be added to the basesal");
	i=scan.nextInt();
	in=i/100;
	usersal=basesal+basesal*in;
	System.out.println("user salary is "+usersal);


}
}

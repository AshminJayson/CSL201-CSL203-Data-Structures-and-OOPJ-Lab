import java.lang.*;
import java.util.*;

public class manager extends employee
{
	String department;
	
	manager()
	{
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department : ");
		department = sc.nextLine();
	}

	void display()
	{
		super.display();
		System.out.println("Department : " + department);
	}
}

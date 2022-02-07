import java.lang.*;
import java.util.*;

public class officer extends employee
{
	String specialization;
	
	officer()
	{
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter specialization : ");
		specialization = sc.nextLine();
	}

	void display()
	{
		super.display();
		System.out.println("Specialization : " + specialization);
	}
}

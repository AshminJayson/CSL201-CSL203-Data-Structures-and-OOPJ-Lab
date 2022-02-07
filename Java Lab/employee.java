import java.lang.*;
import java.util.*;

public class employee
{
	String name;
	int age;
	int phn_num;
	String address;
	int salary;

	employee()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter age : ");
		age = sc.nextInt();
		System.out.println("Enter phn number : ");
		phn_num = sc.nextInt();
		System.out.println("Enter address : ");
		address = sc.next();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();

	}

	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Phn num : "  + phn_num);
		System.out.println("Address : " + address);
	        System.out.println("Salary : " + salary);	
	}

	void printsalary()
	{
		System.out.println("Salary : " + salary);
	}
}

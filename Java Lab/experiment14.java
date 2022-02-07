//Ashmin Jayson S3DS Roll No : 15
//Program 14 : Program to illustrate heirarchial inheritence
//Date : 20/12/2021

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

public class exp14{
	public static void main(String[] args){
	System.out.println("\nEnter officer details : ");
	officer of = new officer();
	System.out.println("\nEnter manager details : ");
	manager mg = new manager();
	System.out.println("\nOfficer Details : ");
	of.display();
	System.out.println("\nManager Details : ");
	mg.display();
}}

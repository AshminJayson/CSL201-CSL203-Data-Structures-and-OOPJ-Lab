//Ashmin Jayson S3DS
//Program to illustrate inheritance 
//Date : 13/12/2021

import java.lang.*;
import java.util.*;

public class engineer extends employee
{	
	void display()
	{//super.display();
		System.out.println("The class is engineer");}
	void calcsalary()
	{//super.calcsalary();
	System.out.println("The salary of the engineer is 20000");}

	public static void main(String[] args)
	{
		employee ob = new employee();
		ob.display();
		ob.calcsalary();
		ob = new engineer();
		ob.display();
		ob.calcsalary();
	}
}

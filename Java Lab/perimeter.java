//Ashmin Jayson S3DS
//Program to find the perimeter of a rectangle using default and parameterized constructor
//Date : 13/12/2021



import java.lang.*;
import java.util.*;

public class perimeter
{
	int l;
	int b;

	perimeter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle 2 : ");
		l = sc.nextInt();
		b = sc.nextInt();
		int p = l + b;
		p = p * 2;
		System.out.println("The perimeter of the rectangle is : " + p);
	}

	perimeter(int a, int c)
	{
	l = a;
	b = c;
	int p = l + b;
	p =p * 2;
	System.out.println("The perimeter of the rectangle is : " + p);
	}


	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int l, b;
	System.out.println("Enter the length and breadth of rectangle 1 : ");
	l = sc.nextInt();
	b = sc.nextInt();
	perimeter ob = new perimeter(l, b);
	
	perimeter rec = new perimeter();
	
	}
}

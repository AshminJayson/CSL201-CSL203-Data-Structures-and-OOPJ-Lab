package ashmin15;

import java.lang.*;
import java.util.*;

public class overload {

	
		double area(double r)
		{
			return 3.14 * r * r;
		}
		
		double area(double l, double b)
		{
			return l * b;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		overload ob = new overload();
		while(true) {
		System.out.println("MENU");
		System.out.println("1. Area of circle ");
		System.out.println("2. Area of rectangle ");
		System.out.println("3. Area of triangle ");
		System.out.println("4. Exit");
		int dec = 0;
		dec = sc.nextInt();
		double val = 0;
		if(dec == 1)
		{
			System.out.println("Enter the length of the radius : ");
			double r = sc.nextDouble();
			val = ob.area(r);
		}
		
		if(dec == 2)
		{
			System.out.println("Enter the lenght and breadth of the rectangle : ");
			double l = sc.nextDouble();
			double b = sc.nextDouble();
			val = ob.area(l, b);
		}
		
		if(dec == 3)
		{
			System.out.println("Enter the length of base and height");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			val = ob.area(a, b);
			val /= 2;
		}
		
		if(dec == 4)
			break;
		
		System.out.println("The area of the selected figure is " + val + "\n\n\n");
		}
	}

}

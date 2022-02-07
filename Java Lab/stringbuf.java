//Ashmin Jayson S3DS
//Program to illustrate the methods of StringBuffer class
//Date : 13/12/2021


import java.lang.*;
import java.util.*;

public class stringbuf
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the required string : ");
		str = sc.nextLine();
		StringBuffer stb = new StringBuffer(str);

		char cont = 'y';
		while(cont == 'y')
		{
			int dec;
			System.out.println("Press 1 to insert a string onto the input string : ");
			System.out.println("Press 2 to replace a character on the input string :");
			System.out.println("Press 3 to append a string to the end of input string : ");
			dec = sc.nextInt();

			switch(dec)
			{
				case 3 : System.out.println("Enter the string to be appended : ");
					 String app = new String();
					 app = sc.next();
					 stb.append(app);
					 System.out.println("The appended string is : " + stb);
					 break;
				
				case 1 : System.out.println("Enter the string to be inserted : ");
					 String ins = new String();
					 ins = sc.next();
					 System.out.println("Enter the position/index of insertion :");
					 int pos = sc.nextInt();
					 stb.insert(pos, ins);
					 System.out.println("The modified string is : " + stb);
					 break;

				case 2 : System.out.println("Enter the position of character to be modified : ");
					 pos = sc.nextInt();
					 System.out.println("Enter the new character : ");
					 char mod = sc.next().charAt(0);
					 stb.setCharAt(pos, mod);
					 System.out.println("The modified string is : " + stb);
					 break;
			}

			System.out.println("Do you wish to return to menu (y/n) : ");
			cont = sc.next().charAt(0);
		}
	}
}


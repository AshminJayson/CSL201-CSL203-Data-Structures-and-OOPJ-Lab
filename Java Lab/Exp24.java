//Experiment No 24 : Program to find the word, line and character count in a file
//Ashmin Jayson S3 DS Roll No : 15
//Date : 07/02/2022

import java.util.*;
import java.lang.*;
import java.io.*;

public class Exp24{
	public static void main(String[] args)
	{
		try{
		FileReader obj = new FileReader("exp24data.txt");
		BufferedReader br = new BufferedReader(obj);
		int charcount = 0;
		int linecount = 0;
		int wordcount = 0;
		String str;
		while((str = br.readLine()) != null)
		{
			linecount++;
			for(int i = 0; i < str.length(); i++)
			{	charcount++;
				if(str.charAt(i) == ' ')wordcount++;

		}
			if(str.charAt(str.length() - 1) != ' ')wordcount++;
		}

		System.out.println("Character count is : " + charcount);
		System.out.println("Word count is : " + wordcount);
		System.out.println("Line count is : " + linecount);

		}
		catch(Exception ae)
		{
			System.out.println("Exception caught " + ae);
		}
	}
}

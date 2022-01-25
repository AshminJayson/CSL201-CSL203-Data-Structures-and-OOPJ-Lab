import java.util.*;
import java.lang.*;
import java.io.*;

public class filem
{
	public static void main(String[] args)
	{
		try
		{
			String path1 = "C:\\MY FILES\\Working Files\\Class Assignment\\Java\\data.txt";
			String path2 = "C:\\MY FILES\\Working Files\\Class Assignment\\Java\\paste.txt";
			FileInputStream fin = new FileInputStream(path1);
			FileOutputStream fout = new FileOutputStream(path2);
			int i = 0;
			while((i = fin.read()) != -1)
			{
				fout.write(i);
			}
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException exc)
		{
			System.out.println("File Not Found");
		}
		catch(IOException exc)
		{
			System.out.println("IO Exception");
		}
	}
}

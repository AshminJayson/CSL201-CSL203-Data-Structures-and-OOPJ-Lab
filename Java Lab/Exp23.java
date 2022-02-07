//Experiment No 23 : Program to print the contents of a file
//Ashmin Jayson S3 DS Roll No : 15
//Date : 07/02/2022


import java.io.*;
import java.util.Scanner;
class Exp23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            File fp=new File("exp23data.txt");
            System.out.println("File already exists.");
            System.out.println("Displaying content in that file:");
            Scanner read=new Scanner(fp);
            int c=1;
            while(read.hasNextLine())
            {
                String s=read.nextLine();
                System.out.println(c+"."+s);
                c++;
            }
        }catch (FileNotFoundException e)
        {
            System.out.println("File was not found.");
        }
    }
}

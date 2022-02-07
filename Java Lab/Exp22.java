//Experiment No 22 : String Tokenizer in Java
//Ashmin Jayson S3 DS Roll No : 15
//Date : 07/02/2022

import java.util.*; 
class Exp22
{
    public static void main(String args[]) 
    {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers (with one space gap):");
        String s = sc.nextLine();
        StringTokenizer str = new StringTokenizer(s, " ");
        System.out.println("Displaying each integer entered,");
        while (str.hasMoreTokens()) 
        {
            String temp = str.nextToken();
            n = Integer.valueOf(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("Sum= " + sum);
    }
}

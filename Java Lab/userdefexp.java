import java.lang.*;
import java.util.*;

class userexception extends Exception
{
    userexception(String s)
    {
        super(s);
    }
}

public class userdefexp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Input a number between 0 and 5 ");
            int a = sc.nextInt();
        if(a < 0)
            throw new userexception("Input is less than 0");
        else if(a > 5)
            throw new userexception("Input is greater than 5");  else System.out.println("The entered value is : " + a );                      
        }
        catch(userexception usr)
        {
            System.out.println("Exception has been caught");
            System.out.println(usr.getMessage());
        }
        finally{
            System.out.println("Exception (if any) has been handled");
        }
        sc.close();
    }
}
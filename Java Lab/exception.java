import java.lang.*;
import java.util.*;

public class exception {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers to perform division upon : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try 
        {
            int c = a / b;
            System.out.println("The value of " + a + " / " + b + " is : " + c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero not allowed ");
        }
        finally
        {
            System.out.println("The exception (if any) has been caught and handled");
        }

        sc.close();

    }
    
}

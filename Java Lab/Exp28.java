//Experiment No 28 : Threads
//Ashmin Jayson S3 DS Roll No : 15
//Date : 07/02/2022


import java.lang.*;
import java.util.*;


public class Exp28 extends Thread  {
	public int value;
	public void setVal(int a) {
		value = a;
	}
	public void run()
	{	
		sync();
	}
	
	synchronized void sync() {
		try {
		if(this.getName() == "Generator Thread") {
		int n = 5;
		while(n > 0) {
		n--;
		gen();
		this.wait(1000);
		}
		
		}
		else if(this.getName() == "Odd Thread") {
			System.out.println("Thread name : " + this.getName());
			System.out.println("Cube of " + value + " is : " + (value * value * value));
		}
		else {
			System.out.println("Thread name : "  + this.getName());
			System.out.println("Square of " + value + " is : " + (value * value));
		}
		
		}
		catch (Exception e) {
			System.out.println("Exception Found : " + e);
		}
	}
		
	void gen() {
		Random r =  new Random();
		int a = r.nextInt(100);
//		System.out.println(a);
		Thread odds = new Exp28();
		odds.setName("Odd Thread");
		Thread evens = new Exp28();
		evens.setName("Even Thread");
		if(a % 2 == 0) {
			((Exp28) evens).setVal(a);
			evens.start();
		}
		else {
			((Exp28) odds).setVal(a);
			odds.start();
		}
		}
	
	public static void main(String[] args)
	{
		Thread ob = new Exp28();
		ob.setName("Generator Thread");

		ob.start();
	}
}

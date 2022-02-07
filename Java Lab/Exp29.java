import java.lang.*;
import java.util.*;

class odd extends Thread{
	public void run() {
		System.out.println("Odd thread running");
	for(int i = 1; i < 100; i = i + 2)
	System.out.println(i);	
	}
}

class even extends Thread{
	public void run() {
		System.out.println("Even thread running");
	for(int i = 0; i < 100; i = i + 2)
	System.out.println(i);
	}
}

public class Exp29 extends Thread {
	public static void main(String[] args) {
		Thread ob = new odd();
		Thread oa = new even();
		ob.start();
		oa.start();
	}
}

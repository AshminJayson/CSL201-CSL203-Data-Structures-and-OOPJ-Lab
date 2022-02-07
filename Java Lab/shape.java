//Ashmin Jayson S3DS Roll No : 15
//Program 15 ; Program to illustrate abstract classes in java
//Date : 20/12/2021

import java.lang.*;
import java.util.*;

public abstract class shape{
	public abstract void numberofsides();

	public static void main(String[] args){
		rectangle re = new rectangle();
		triangle te = new triangle();
		hexagon he = new hexagon();
		re.numberofsides();
		te.numberofsides();
		he.numberofsides();
	}
}

class rectangle extends shape{
	public void numberofsides(){
		System.out.println("Number of sides of rectangle : 4 ");
	}}

class triangle extends shape{
	public void numberofsides(){
		System.out.println("Number of sides of triangle : 3 ");
	}}

class hexagon extends shape{
	public void numberofsides(){
		System.out.println("Number of sides of hexagon : 6 ");
	}}



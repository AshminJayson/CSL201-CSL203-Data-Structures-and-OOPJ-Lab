//Experiment No 27 : Binary Search
//Ashmin Jayson S3 DS Roll No : 15
//Date : 07/02/2022

import java.util.*;
import java.lang.*;

public class Exp27{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int n = sc.nextInt();
	
	int ar[] = new int[n];
	System.out.println("Enter the elements of the array in ascending order : ");
	for(int i = 0; i < n; i++)
		ar[i] = sc.nextInt();

	System.out.println("Enter the element to be searched for : ");
	int ele = sc.nextInt();

	int front = 0, rear = n - 1;
	int flag = 0;
	int index = 0;
	
	while(front <= rear)
	{
		int mid = front + rear;
		mid /= 2;
		if(ar[mid] == ele)
		{
			index = mid;
			flag = 1;
			break;
		}
		else if(ar[mid] < ele)
			front = mid + 1;
		else 
			rear = mid - 1;	
	}

	if(flag == 1)
		System.out.println("The element " + ele + " is found at index : " + index);
	else
		System.out.println("Element not found");
	}}

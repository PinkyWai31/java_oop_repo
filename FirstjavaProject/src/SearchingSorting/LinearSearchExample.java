package SearchingSorting;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("The number of elements:");
		int n = sc.nextInt();
		
		int []A = new int [n];
		for (int i = 0; i<A.length; i++)
		{
			System.out.print("Enter a value");
			A[i] = sc.nextInt();
		}
		
		System.out.print("Enter Search Key");
		int key = sc.nextInt();
		
		LinearSearch(A, key);
		
	}
	
	public static void LinearSearch (int [] A , int key)
	{
		int i;
		for (i = 0; i<A.length; i++)
		{
			if (key == A[i])
			{
				System.out.println(key +" is found at index "+i);
				break;
			}
		}
		
		if (i == A.length)
		{
			System.out.println(key + " is not found");
		}
	}

}

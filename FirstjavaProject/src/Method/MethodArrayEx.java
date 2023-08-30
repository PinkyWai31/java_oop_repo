package Method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodArrayEx {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] A = new int [5];
		
		input(A,A.length);
		display(A);
		
		int index = maxValue(A, A.length);
		System.out.print("\n Larger element is " +A[index]+"at index" +index);

	}
	
	public static void input (int [] a, int n)
	{
		for (int i =0; i < n ;i++)
		{
			System.out.print("Enter a value:");
			a[i] = sc.nextInt();
		}
	}
	
	public static void display(int [] a)
	{
		for (int i:a)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int maxValue(int [] a, int n)
	{
		//Arrays.sort(a);
		//return a.length-1;
		
		int max = a [0];
		int index = 0;
		for (int i = 1; i<n; i++)
		{
			if (a [i] > max) {
				max = a[i];
			index = i;}
		}
		
		return index;
		
	}

}

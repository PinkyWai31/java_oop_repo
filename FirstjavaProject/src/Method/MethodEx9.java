package Method;

import java.util.Scanner;

public class MethodEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int length = sc.nextInt();
		System.out.print("Enter width");
		int width = sc.nextInt();
		
		System.out.println("Area =" +area(length,width));
		System.out.println("Perimeter "+Perimeter(length,width));

	}
	
	public static int area(int l, int w)
	{
		return (l*w);
	}
	
	public static int Perimeter (int l, int w)
	{
		return (2*(l+w));
	}

}

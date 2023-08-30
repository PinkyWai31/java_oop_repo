package SampleProgram;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length, breadth, area;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the length of the rectangle");
	      length = sc.nextInt();
	      System.out.println("Enter the breadth of the rectangle");
	      breadth = sc.nextInt();
	      area = length* breadth;
	      System.out.println("Area of the rectangle is"+area);

	}

}

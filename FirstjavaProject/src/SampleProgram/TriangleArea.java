package SampleProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the width of the Triangle:");
        double b= sc.nextDouble();

        System.out.println("Enter the height of the Triangle:");
         double h= sc.nextDouble();

              double area=(b*h)/2;
     System.out.println("Area of Triangle is: " + area);

	}

}

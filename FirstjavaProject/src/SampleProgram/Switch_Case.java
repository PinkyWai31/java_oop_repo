package SampleProgram;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		Scanner sc=new Scanner(System.in);
		
        do {
	    System.out.println("Enter '+' or '-' or '*' or '/'");
	    String con=sc.nextLine();
	    System.out.println("Enter First Value");
	    int a=sc.nextInt();
	    System.out.println("Enter Second Value");
	    int b=sc.nextInt();
	    
	    switch(con) {
	        case "+":
	            System.out.println("Result: " + (a + b));
	            break;
	        case "-":
	            System.out.println("Result: " + (a - b));
	            break;
	        case "*":
	            System.out.println("Result: " + (a * b));
	            break;
	        case "/":
	            if (b != 0) {
	                System.out.println("Result: " + (a / (double) b));
	            } else {
	                System.out.println("Cannot divide by zero");
	            }
	            break;
	        default:
	            System.out.println("Invalid operator");
	            flag = true;
	            break;
	    }
        } while (flag = true);
		
		

	}

}

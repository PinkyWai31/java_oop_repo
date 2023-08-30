package SampleProgram;

import java.util.Scanner;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username= sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		
		for (int i =0; i<=3; i++)
		{
			if (username == "maungmaung")
			{
				System.out.println("Correct Username");
			}
			
			else if (password =="123")
			{
				System.out.println("Correct Password");
			}
				
		}

	}

}

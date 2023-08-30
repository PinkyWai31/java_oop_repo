package oobpackage;

import java.util.Scanner;

public class Student1 {
	
	private String name; 
	  private int age;
	  
	  public void setName(String n) {
	    name = n;
	  }
	  
	  public void setAge(int a) {
	    age = a;
	  }
	  
	  public String getName() {
	    return name;
	  }
	  
	  public int getAge() {
	    return age;
	  }
	  
	  
	  

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter Name");
	    String name = scan.nextLine();
	    
	    System.out.println("Enter Age");
	    int age = scan.nextInt();
	    
	    
	    Animal_GetterSetter dog = new Animal_GetterSetter();
	    
	    dog.setName(name);
	    dog.setAge(age);
	    
	    System.out.println("Name is "+dog.getName());
	    System.out.println("Age is "+dog.getAge());

		

	}

}

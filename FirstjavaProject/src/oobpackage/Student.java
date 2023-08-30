package oobpackage;

public class Student {
	
	public Student ()
	{
		System.out.println("Student Constructor");
	}
	
	public Student (String name) {
		System.out.println("Name is " +name);
	}
	public static void main (String [] args)
	{
		Student st = new Student ();
		Student st2 = new Student ("Pinks");
		Student st3 = new Student ("Helene");
		
		System.out.println("");
	}

	}

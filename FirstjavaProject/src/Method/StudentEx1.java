package Method;

public class StudentEx1 {
	
	String name;
	int age;
	static String module = "Unit 1 Progamming";
	
	public void createStudent ()
	{
		System.out.println("Create Stdent object ="+name+""+age);
	}
	
	public static void display()
	{
		System.out.println(module);
	}

	public static void main(String[] args) {
		
		StudentEx1 st1 = new StudentEx1();
		st1.name = "Su Su";
		st1.age = 20;
		st1.createStudent();
		
		StudentEx1 st2 = new StudentEx1();
		st2.name = "Aung Aung";
		st2.age = 20;
		st2.createStudent();
		
		System.out.println(StudentEx1.module);
		StudentEx1.display();

	}

}

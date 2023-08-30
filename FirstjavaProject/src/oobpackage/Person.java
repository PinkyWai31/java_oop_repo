package oobpackage;

public class Person {
	
	String name;
	int age;

	public Person()
	{
		 name = "Pinky Wai";
		 age = 19;
	}
	
	public Person (String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		Person person1 =new Person();
		System.out.println(person1.name +" " +person1.age);
		Person person2 = new Person("Henry", 19);
		System.out.println(person2.name +" " +person2.age);

	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	public void setAge(int age2) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

}

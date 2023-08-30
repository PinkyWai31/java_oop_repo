package oobpackage;

public class Animal {
	
	public String name;
	public int height;
	private String gender;
	
	public String getGender(String Something)
	{
		this.gender = Something;
		return this.gender;
	}
	
	public  void getAnimal()
	{
		name = "KiKi";
		height = 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = new Animal();
		System.out.println(dog.name);	// null as no value is assigned yet
		dog.getAnimal();	//assign value by invoking method
		System.out.println(dog.name);	// Kiki
		System.out.println(dog.height);	// 4
		System.out.println(dog.gender);	//null as no value is assigned yet
		System.out.println(dog.getGender("female"));	//Gender
	}

}

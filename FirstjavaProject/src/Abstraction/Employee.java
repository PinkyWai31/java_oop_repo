package Abstraction;

public abstract class Employee {
	private String name;
	public String address;
	public int number;
	
	Employee(String name, String address, int number)
	{
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public abstract double computepay();
	
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	

}

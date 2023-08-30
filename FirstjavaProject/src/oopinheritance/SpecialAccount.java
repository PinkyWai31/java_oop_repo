package oopinheritance;

public class SpecialAccount extends Account{

	public SpecialAccount(String name, double withdraw)
	{
		super(name);
		this.withdraw = withdraw;
	}
	
	public void getResult()
	{
		System.out.println("Username" +this.name);
		System.out.println("TotalAccount " + getAmount());
		System.out.println("Withdraw Amount " + this.withdraw);
		System.out.println("Remaining Amount " +(getAmount() - this.withdraw));
	}
	
	public static void main (String [] args)
	{
		SpecialAccount sa = new SpecialAccount ("Mg Mg",300);
		sa.setAmount(1000);
		sa.getResult();
		System.out.println(sa.name + sa.withdraw);
	}
}

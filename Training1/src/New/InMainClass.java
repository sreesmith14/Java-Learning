package New;

 class Emp{
	int empid;
	String empname="Fireboltt";
	final int x=888;
	public String getDetails()
	{
		return empid+" -- "+empname;
		
	}
	public Emp() {
		System.out.println("from emp");
	}
	public Emp(int empid)
	{
		//this method used for construcytor of the same class
		//Super or this method be called together First line.
	this("Hello");
		this.empid = empid;
		System.out.println("from emp"+ empid);
	}
	public Emp(String str)
	{
		System.out.println("From emp with str:" +str);
	}
}

class Manager extends Emp{
	String dept ="IT";
	public Manager()
	{
		super(500); // Used to invoke base class constructor
		System.out.println("from mgr");
	}
	public String getDetails()
	{ // Override
		return super.getDetails()+"--"+dept;
	}
	public void viewSalary()
{
		}
}
class Salary{ // POlymorphic object can access overridden method,Can access a regular of the parint class.
	
}

public class InMainClass {
public static void main(String[] args) {
	//Emp em = new Emp();
	//System.out.println(em.getDetails());
	
	//Manager mgr = new Manager();
	//System.out.println(mgr.getDetails());
	
	Emp em= new Manager();
	System.out.println(em.getDetails());
	
}
}
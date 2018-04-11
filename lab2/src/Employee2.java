

public class Employee2 
{
	public static void
	 main(String [] args)
	{
	    Date joiningDate = new Date(21, 10, 1995);
		Employee e1 = new Employee("sai", "atluri",12000, "A",joiningDate); 
		Employee e2 = new Employee("venkat", "s",20000, "B",joiningDate); 
		e1.display();
		
	    System.out.println("");
		e2.display();
		}
}

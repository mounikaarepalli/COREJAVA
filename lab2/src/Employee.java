
public class Employee 
{
	int emp_id;
	String first_name, last_name;
	double salary;
	String grade;
	static int count=12164;
	Date joiningDate;
	
    Employee(String fn, String ln, double sal, String grad, Date joiningDate)
    {
    	this.joiningDate =joiningDate;
    	first_name=fn;
    	last_name=ln;
    	salary=sal;
    	grade=grad;
    	emp_id=count++;}
    
	public void display()
	{		
		
		System.out.println("First Name of employee is:\t"+first_name);
		System.out.println("last Name of employee is:\t"+last_name);
		System.out.println("salary of employee is:\t"+salary);
		System.out.println("grade of employee is:\t"+grade);
		System.out.println("Employee id is:\t"+emp_id);
		System.out.println("Date of joining is:\t"+joiningDate);
    }
	}

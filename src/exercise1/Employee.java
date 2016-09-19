package exercise1;
/**Author: SHAFIQ-UR-REHMAN
 * program to record and display information about employees */

public class Employee {
	
	public int id;
	public double salary;
	public String fName, lName;

	//default constructor
	public Employee(){}
	
	//multi-argument constructor
	public Employee(int id,	String fName, String lName, double salary)
	{
		this.id = id;
		this.salary = salary;
		this.fName = fName;
		this.lName = lName;
	}
	
	//getters
	public int getEmployeeID()
	{
		return id;
	}
	public String getEmployeeFirstName()
	{
		return this.fName;
	}
	public String getEmployeeLastName()
	{
		return lName;
	}
	public double getEmployeeSalary()
	{
		return salary;
	}
	
	//setter
	public void setEmployee(int id,	String fName, String lName, double salary)
	{
		this.id = id;
		this.salary = salary;
		this.fName = fName;
		this.lName = lName;
	}
	
	public void getEmployeeInformation()
	{
	System.out.printf("The employee information is as follows:\nEmployee ID: %d\nFirst Name: %s\nLast Name: %s\nSalary: %f",
			id,fName,lName,salary);	
	}
	


}

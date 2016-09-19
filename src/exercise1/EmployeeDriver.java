package exercise1;
import java.util.Scanner;
/**Author: SHAFIQ-UR-REHMAN
 *Driver for the Employee class */

//create class
public class EmployeeDriver {

	public static void main(String[] args) {
		//initiate Scanner to obtain user input
		Scanner input = new Scanner(System.in);
		
		//initiate objects of Employee class
		Employee emp1 = new Employee(1, "Bill", "Smith", 50000.00);
		Employee emp2 = new Employee();
		
		//declare variables:
		String fName, lName, name;
		int id;
		double salary;
		
		//prompt for input
		System.out.print("Please enter employee ID: ");
		//accept user entry
		id = input.nextInt();
		input.nextLine();//had to put this blank scanner because without this next 2 print statements fire simultaneously
		//http://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-nextint-or-other-nextfoo
		
		
		System.out.print("Please enter first name: ");
		 fName = input.nextLine();
		
		System.out.print("Please enter last name: ");
		lName = input.nextLine();
		
		System.out.print("Please enter salary: ");
		salary = input.nextDouble();
		input.nextLine();//
		
		//check if salary entered was negative
		while(salary < 0)
			{
			System.out.println("The value provided is negative. Please enter salary amount again: ");
			salary = input.nextDouble();
			}
		
		//call setter to set emp2 values
		emp2.setEmployee(id,fName,lName,salary);
		
		
		// Prompt for first name to display the details of
		System.out.print("Please enter first name of the employee that you would like to see the details about:");
		name = input.nextLine();
	
		
		
		//If I used == inside if statement then following code didn't work. Reason is that in Java, using == for non-primitive expressions will always compare object references.
		//http://stackoverflow.com/questions/5331827/simple-if-else-statement-not-working
		
		if(name.equals(emp1.getEmployeeFirstName()))
		{
			emp1.getEmployeeInformation();
		}
		else if(emp2.getEmployeeFirstName().equals(name))
		{
			emp2.getEmployeeInformation();
		}
	}

}

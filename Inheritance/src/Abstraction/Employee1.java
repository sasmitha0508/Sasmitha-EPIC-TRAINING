package Abstraction;
abstract class Employees {

    // Create variables
    int employeeId;
    String employeeName;
    double basicSalary;

    // Create constructor
    Employees(int employeeId, String employeeName, double basicSalary) {
       this.employeeId=employeeId;
       this.employeeName=employeeName;
       this.basicSalary=basicSalary;
    }

    // Create method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
    }

    // Create an abstract method for salary calculation
    // Each employee type should calculate salary differently
    abstract double calculatesalary();
}


// Employee with fixed salary + bonus
class PermanentEmployees extends Employees {
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;
  
    PermanentEmployees(int employeeId, String employeeName,
                      double basicSalary, double bonus) {
      super(employeeId, employeeName, basicSalary);
     
      this.bonus=bonus;
      
    }

    // Override the abstract method
    @Override
    double calculatesalary() {
     return basicSalary=basicSalary+bonus;
    }
}


// Employee whose salary depends on hours worked
class ContractEmployees extends Employees {
	int employeeId;
    String employeeName;
    double basicSalary;
    int hoursWorked;
    double hourlyRate;

    ContractEmployees(int employeeId, String employeeName,
                     double basicSalary, int hoursWorked,
                     double hourlyRate) {
    	 super(employeeId, employeeName, basicSalary);
         this.hoursWorked=hoursWorked;
         this.hourlyRate=hourlyRate;
       
    }

    // Override the abstract method
    @Override
    double calculatesalary() {
      return basicSalary=hoursWorked*hourlyRate;
    }
}
public class Employee1 {
	 public static void main(String[] args) {

	        // Create Permanent Employee
	        PermanentEmployees p =
	            new PermanentEmployees(101, "Arun", 30000, 5000);

	        // Create Contract Employee
	        ContractEmployees c =
	            new ContractEmployees(102, "Rahul", 0, 160, 250);


	        // Display employee details
	        p.displayEmployee();
	        System.out.println("Total Salary : " +p. calculatesalary());

	        System.out.println();

	        c.displayEmployee();
	        System.out.println("Total Salary : " +c. calculatesalary());
	    }
	}


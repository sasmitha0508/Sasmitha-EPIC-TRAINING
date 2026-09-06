package Abstraction;
abstract class Employee{
	String name;
	Employee(String n){
		this.name=n;
	}
    abstract int calculateSal();
    
}
class FullTimeEmployee extends Employee{
	String name;
    int salary;
    FullTimeEmployee(String name ,int sal) {
        super(name);
        this.salary=sal;
    }
    @Override
    int calculateSal(){
    	return salary;
    	
    }
    
}
class PartTimeEmployee extends Employee{
	
	String name;
    int salary;
    int hours;
    
    PartTimeEmployee(String name ,int sal,int hours) {
        super(name);
        this.salary=sal;
        this.hours=hours;
    }
    @Override
    int calculateSal(){
    	return salary*hours;
    	
    }
}

public class Main {
public static void main(String[] args) {
	Employee obj1=new FullTimeEmployee("sasmitha",10000);
	Employee obj2=new PartTimeEmployee("Ragul",1000,8);
	obj1.calculateSal();
	obj2.calculateSal();
}
}

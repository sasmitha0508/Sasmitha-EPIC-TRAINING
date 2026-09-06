package programs;
class Employee{
	String name;
	Employee(String name){
		this.name=name;
	}
}
class payment extends Employee{
	int salary;
	payment(String name,int salary){
		super(name);
		this.salary=salary;
	}
}
public class Super {
public static void main(String[] args) {
	payment ptm=new payment("sas",100000);
	System.out.println(ptm.name);
	System.out.println(ptm.salary);
}
}

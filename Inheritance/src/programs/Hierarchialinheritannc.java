package programs;
class Vehicle{
	void drive(String a) {
		System.out.println("Drive Vehicle"+a);
	}
}
class car extends Vehicle{
	void drive(String a,String b) {
		System.out.println("Drive car"+a+b);
	}
}
class bike extends Vehicle{
	void drive(String a,String b,String c) {
		System.out.println("Drive bike");
	}
}
public class Hierarchialinheritannc {
public static void main(String[] args) {
	car c=new car();
	bike b=new bike();
	c.drive("car");
	b.drive("bike");
	c.drive("Swift","bmw");
}
}

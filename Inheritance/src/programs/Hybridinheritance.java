package programs;
class Vehicle1{
	void drive(String a) {
		System.out.println("Drive Vehicle"+a);
	}
}
class car1 extends Vehicle1{
	void drive(String a,String b) {
		System.out.println("Drive car"+a+b);
	}
}
class bike1 extends Vehicle1{
	void drive1() {
		System.out.println("Drive bike1");
	}
}
class Ecar extends car1{
	void engine() {
		System.out.println("Drive Ecar");
	}
}
class bike2 extends bike1{
	void run() {
		System.out.println("Drive bike2");
	}
}
class bike3 extends bike2{
	void run1() {
		System.out.println("Drive bike3");
	}
}
public class Hybridinheritance {
	public static void main(String[] args) {
		Ecar e=new Ecar();
		bike3 b3=new bike3();
		e.engine();
		b3.drive1();
		b3.run();
		b3.drive("car");
		
		
	}
}

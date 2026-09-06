package programs;
class Animal{
	int a=10;
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal {
	int b=20;
	void sound() {
		System.out.println("Dog barks");
	}
}
public class Polymorphism {
public static void main(String[] args) {
	Animal aobj=new Animal();
	Animal bobj=new Dog();//object binding
	aobj.sound();
	bobj.sound();
}
}
//In overriding parent class (Animal) have method sound(),child class(Dog) inherits and redefine the  same method sound()in parent class
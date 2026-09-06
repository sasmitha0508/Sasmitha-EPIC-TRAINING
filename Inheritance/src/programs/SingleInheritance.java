package programs;
class ClassA{
	int a=10;
	void data(int a,int b) {
		System.out.println(a+b);
	}
}
class ClassB extends ClassA {
	int b=20;
	void data(int a) {
		System.out.println(-a);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		ClassB bobj=new ClassB();
		System.out.println("a="+bobj.a );
		System.out.println("b="+bobj.b);
		bobj.data(10);

	}
}

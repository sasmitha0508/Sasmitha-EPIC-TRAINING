package programs;
class A1{
	void data(int a) {
		System.out.println(a);
	}
}
class B1 extends A1 {
	void data(int a, int b) {
		System.out.println(a+b);
	}
}
class C1 extends B1{
	void data(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class MultilevelInheritance {
public static void main(String[] args) {
	B1 bobj=new B1();
	C1 cobj=new C1();
	bobj.data(10,20);
	cobj.data(10,20,30);
	cobj.data(10);
	
}
}

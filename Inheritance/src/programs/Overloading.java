package programs;
class mydata{
	void printdata(int a) {
		System.out.println("one");
	}
void printdata(int a ,int b) {
	System.out.println("Two");
	}
void printdata(int a,int b,int c) {
	System.out.println("Three");
}
	
}
public class Overloading {
	public static void main(String[] args) {
		mydata d=new mydata();
		d.printdata(10);
		d.printdata(10,20);
		d.printdata(10,20,30);
	}

}

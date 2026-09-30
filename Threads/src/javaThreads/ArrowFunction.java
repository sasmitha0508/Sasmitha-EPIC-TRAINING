package javaThreads;
public class ArrowFunction {

	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			System.out.println("Hello");
		});
		Thread t2=new Thread(()->{
			System.out.println("Hii");
		});
		System.out.println("One");
		t1.start();
		t2.start();
		System.out.println("Two");
		
	}

}

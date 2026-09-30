package javaThreads;

class MyData extends Thread{
	//Contains task
	public void run() {
//		System.out.println("print Data");
		for(int i=1;i<=5;i++) {
			System.out.println("Run"+i);
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class JustThreads {

	public static void main(String[] args)throws InterruptedException {
//		System.out.println("Hello");
//		MyData t1=new MyData();
//		MyData t2=new MyData();
//		t1.start();//execute the run() which contains the task
//		t2.start();
//		System.out.println("Hii");
		MyData t1=new MyData();
		t1.start();
		t1.join();
		for(int i=1;i<=5;i++) {
			System.out.println("Main"+i);
		}

	}

}

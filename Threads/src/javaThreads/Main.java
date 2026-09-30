package javaThreads;

class Data extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
		System.out.println("Run1:"+i);
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e);
		}
		}
	}
}
class Data1 extends Thread{
	public void run() {
		for(int j=0;j<=5;j++) {
		System.out.println("Run2:"+j);
		try {
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		}
	}
}
public class Main {

	public static void main(String[] args)throws Exception {
    Data d1=new Data();
    Data1 d2=new Data1();
     d1.start();
     d1.join();
     d2.start();
     d2.join();
	}

}

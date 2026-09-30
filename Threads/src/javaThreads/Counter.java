package javaThreads;

class Counter1 {
    int count = 0;
    public void incrementCount() {
        count++;
    }
}
class MyThread extends Thread {
    Counter1 count;
    MyThread(Counter1 count) {
        this.count = count;
    }
    public void run() {
        for(int i = 0; i < 10; i++) {
//        	try { it make the thread to produce output 0
//        		Thread.sleep(1000);
//        	}catch(Exception e) {
//        		System.out.println(e);
//        	}
            count.incrementCount();
        }
    }
}
public class Counter {
    public static void main(String[] args) throws Exception {
        Counter1 c = new Counter1();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println(c.count);
    }
}
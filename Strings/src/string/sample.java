package string;

public class sample {
public static void main(String[] args) {
	//String constant pool-memory location
	String srt1="Hello";//100
	String srt2="Hello";//100
	//heap
	String str3=new String("Hello");//200
	String str4=new String("Hello");//300
	System.out.println(srt1==srt2);// == -check value and memory address

}
}

package problems;
import java.util.*;
public class Countoddeven {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =s.nextInt();
		
		int even=0;
		int odd=0;
		
		while(n!=0) {
			int digit =n%10;
			if(digit%2==0) {
				even++;
			}
			else {
				odd++;
			}
			n = n/10;
		}
		
		System.out.println(even);
		System.out.println(odd);
		
		s.close();
	}

}

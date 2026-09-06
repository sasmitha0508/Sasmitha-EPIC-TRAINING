package string;

import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//3
		if(n==1){
		    System.out.println("1");
		}
		else{
		    String str = "1";
		    
		    String emt="";
		    for(int k=1;k<n;k++){//3
		        System.out.println(str);//11
		        emt="";
		        for(int i=0;i<str.length();){
		            
		            int count = 1;
		            int j;
		            for(j=i+1;j<str.length();j++){
		                if(str.charAt(i)==str.charAt(j)){
		                    count++;
		                }
		                else{
		                    break;
		                }
		            }
		            emt+=count;//2
		            emt+=str.charAt(i);//21
		            i=j;
		            if(j==str.length()){
		                break;
		            }
		        }
		        str=emt;//21
		    }
		    System.out.println(str);
		}
	}
}


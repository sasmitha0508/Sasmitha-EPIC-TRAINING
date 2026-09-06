package programs;

public class MinMax {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,7};
		int min=arr[0];
		int max=arr[0];
		for(int a: arr) {
			if(min>a) {
				min=a;
			}
		    if(max<a) {
				max=a;
			}
		
	}
		System.out.println("Minimum number:"+min);
		System.out.println("Minimum number:"+max);
	}

}

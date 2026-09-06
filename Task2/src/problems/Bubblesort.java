package problems;
import java.util.Arrays;

public class Bubblesort {

	
	public class BubbleSortExample {
	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        // Outer loop tracks the number of passes
	        for (int i = 0; i < n - 1; i++) {
	            // Inner loop compares adjacent elements
	            for (int j = 0; j < n - i - 1; j++) {
	                // Swap if the current element is greater than the next
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] data = {5, 3, 8, 4, 2};
	        bubbleSort(data);
	        System.out.println("Sorted Array: " + Arrays.toString(data));
	    }
	    
	}
}

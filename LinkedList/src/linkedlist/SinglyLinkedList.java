package linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
//Using Built-in function
public class SinglyLinkedList {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        LinkedList<Integer> list = new LinkedList<>();

	        while (true) {

	            System.out.println("\n1 -> Insert Beginning");
	            System.out.println("2 -> Insert End");
	            System.out.println("3 -> Insert Middle");
	            System.out.println("4 -> Display");
	            System.out.println("5 -> Exit");

	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1 -> {
	                    System.out.print("Enter value: ");
	                    int value = sc.nextInt();
	                    list.addFirst(value);
	                }

	                case 2 -> {
	                    System.out.print("Enter value: ");
	                    int value = sc.nextInt();
	                    list.addLast(value);
	                }

	                case 3 -> {
	                    System.out.print("Enter value: ");
	                    int value = sc.nextInt();

	                    int middle = list.size() / 2;
	                    list.add(middle, value);
	                }

	                case 4 -> {
	                    System.out.println("List: " + list);
	                }

	                case 5 -> {
	                    System.out.println("Program ended.");
	                    return;
	                }

	                default -> System.out.println("Invalid choice!");
	            }
	        }
	    }
}

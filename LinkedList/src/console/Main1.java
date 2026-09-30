package console;

import java.util.Scanner;

class Customer {

    String cusName;
    String cusEmail;

    Customer(String name, String email) {
        this.cusName = name;
        this.cusEmail = email;
    }
}

class Node {

    Customer data;
    Node next;

    Node head = null;
    Node tail = null;

    Node() {
    }

    Node(Customer data, Node add) {
        this.data = data;
        this.next = add;
    }

    void insertData(Customer cus) {

        Node obj = new Node(cus, null);

        if (head == null) {
            head = obj;
        } else {
            tail.next = obj;
        }

        tail = obj;
    }

    void createCustomer(Scanner sc) {

        System.out.println("Enter the name:");
        String name = sc.next();

        System.out.println("Enter the email:");
        String email = sc.next();

        Customer cus = new Customer(name, email);

        insertData(cus);
    }

    void displayCustomer() {

        Node temp = head;

        if (head == null) {
            System.out.println("No customers available.");
            return;
        }

        while (temp != null) {

            System.out.println("Name: " + temp.data.cusName);
            System.out.println("Email: " + temp.data.cusEmail);

            temp = temp.next;
        }
    }
}

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node li = new Node();

        while (true) {
            System.out.println("\n1) Create Customer");
            System.out.println("2) Display Customer");
            System.out.println("3) Exit");
            int n = in.nextInt();
            switch (n) {
            case 1:
                li.createCustomer(in);
                break;
            case 2:
                li.displayCustomer();
                break;
            }
        }
    }
}
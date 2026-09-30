package queue;

import java.util.Scanner;

class CircularqueueImplementation {

    int n = 6;
    int[] queue = new int[n];
    int front = -1;
    int rear = -1;

    void enQueue(Scanner in) {
        if ((rear + 1) % n == front) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }

            System.out.println("Enter the value: ");
            rear = (rear + 1) % n;
            queue[rear] = in.nextInt();
        }
    }

    void deQueue(Scanner in) {
        if (front == -1) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Removed element: " + queue[front]);

            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % n;
            }
        }
    }

    void displayQueue() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");

            int i = front;

            while (true) {
                System.out.println(queue[i]);

                if (i == rear) {
                    break;
                }

                i = (i + 1) % n;
            }
        }
    }
}

public class CircularQueue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CircularqueueImplementation cq = new CircularqueueImplementation();

        int choice;

        do {
            System.out.println("\n1. EnQueue");
            System.out.println("2. DeQueue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            choice = in.nextInt();

            switch (choice) {

                case 1:
                    cq.enQueue(in);
                    break;

                case 2:
                    cq.deQueue(in);
                    break;

                case 3:
                    cq.displayQueue();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        in.close();
    }
}
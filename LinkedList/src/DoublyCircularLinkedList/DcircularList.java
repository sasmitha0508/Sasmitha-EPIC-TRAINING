package DoublyCircularLinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node prev,next;
    Node head=null;
    Node tail=null; 
    
    public Node(Node prev,int data,Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    Node(){
    	
    }
    
    
    public void insertData(Scanner in){
        System.out.println("Enter the no of data: ");
        int n = in.nextInt();
        System.out.println("Enter the val: ");
        for(int i=0;i<n;i++){
            int val = in.nextInt();
            Node obj = new Node(null,val,null);
            if(head==null) {
            	head=obj;
            }
            else {
            	obj.prev=tail;
        		tail.next=obj;
            }
            tail=obj;
            head.prev=obj;
            tail.next=head;
        }
    }
    void insertANode(Scanner in) {
        System.out.println("Enter the value:");
        int val = in.nextInt();

        System.out.println("Enter the position:");
        int pos = in.nextInt();

        Node newNode = new Node(null, val, null);

        Node temp = head;
        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
        
    }
    void insertFront(Scanner in) {
        System.out.println("Enter the value:");
        int val = in.nextInt();
        Node front = new Node(null, val, head);
        if(head==null) {
        	head=front;
        	tail=front;
        }
        else {
        head.prev = front;
        head = front;
        tail.next=front;
        }
    }
    void insertback(Scanner in) {
        System.out.println("Enter the value:");

        int val = in.nextInt();

        Node back = new Node(null, val, null);
        back.prev = tail;
        back.next = head;
        tail.next = back;
        head.prev = back;

        tail = back;
    }
    void displayData(){
    	Node temp = head;
		do{
	    System.out.println(temp.data);
	    temp=temp.next;
	}while(temp!=head);
}
}

public class DcircularList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Node node=new Node();
	node.insertData(sc);
	node.displayData();
	node.insertANode(sc);
	node.displayData();
	node.insertFront(sc);
	node.displayData();
	node.insertback(sc);
	node.displayData();
	
	
}
}

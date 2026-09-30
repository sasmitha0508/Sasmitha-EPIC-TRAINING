package linkedlist;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node head = null,tail=null;
    
    Node(int data,Node add){
        this.data=data;
        this.next = add;
    }
    
    Node(){
        
    }
    
    void insertData(Scanner in){
        System.out.println("Enter the no of Data: ");
            int n = in.nextInt();//3-->10,20,30
            for(int i=0;i<n;i++){
                int val = in.nextInt();//10
                Node obj = new Node(val,null);
                if(head==null){
                    head = obj;
                    tail=obj;
                }
                else{
                    tail.next = obj;
                    tail=obj;
                }
            }
    }
    
    void displayData(){
        	Node temp = head;
    		while(temp!=null){
		    System.out.println(temp.data);//40
		    temp=temp.next;//null
		}
    }
    
    void insertANode(Scanner in){
        System.out.println("Enter the value: ");
        int val = in.nextInt();//55
        System.out.println("Enter the position: ");
        int pos = in.nextInt();//4
        
        Node newNode = new Node(val,null);//8000
        if(pos==1){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node temp = head;//1000
        //          0<2
        for(int i=0;i<pos-2;i++){
            temp=temp.next;
            //i=0==>temp=2000;
            //i=1==>temp=3000;
        }
        //temp=3000;
        if(temp.next==null) {
        	tail=newNode;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        }
    }  
    void insertfront(Scanner in) {
    	System.out.println("Enter the value: ");
        int val = in.nextInt();//55
        Node front=new Node(val,head);
        head=front;
    }
    void insertback(Scanner in) {
    	System.out.println("Enter the value: ");
        int val = in.nextInt();//55
        Node back=new Node(val,null);
        tail.next=back;
        tail=back;
    }
    void delete(Scanner in) {
    	 System.out.println("\nEnter value to delete:");
         int value = in.nextInt();

         Node current = head;
         Node prev = null;

         while (current != null) {

             if (current.data == value) {

                 if (prev == null) {
                     head = current.next;
                 }
                 else {
                     prev.next = current.next;
                 }
                 if (current == tail) {
                     tail = prev;
                 }

                 break;
             }

             prev = current;
             current = current.next;
         }
    }
    
}
public class Main
{
	public static void main(String[] args) { 
	 
	    Scanner in = new Scanner(System.in);
	    Node node = new Node();
	    
		node.insertData(in);
        node.displayData();
        node.insertANode(in);
        node.displayData();
        node.insertfront(in);
        node.displayData();
        node.insertback(in);
        node.displayData();
        node.delete(in);
        node.displayData();
	}
}
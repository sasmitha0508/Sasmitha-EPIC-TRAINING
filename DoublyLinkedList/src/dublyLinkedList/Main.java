package dublyLinkedList;
import java.util.Scanner;
class Node{
    Node prev;
    int data;
    Node next;
    Node head=null;
    Node tail=null;   
    Node(Node prev,int data,Node next) {
    	this.prev=prev;
    	this.data=data;
    	this.next=next;
    }   
    Node(){
    	
    }
    void inertData(Scanner in) {
    	System.out.println("Enter No.of data:");
    	int n=in.nextInt();
    	System.out.println("Enter the values:");
    	for(int i=0;i<n;i++) {
    		int val=in.nextInt();
        	Node obj= new Node(null,val,null);
        	if(head==null) {
        		head=obj;
        	}
        	else {
        		obj.prev=tail;
        		tail.next=obj;
        	}
        	tail=obj;
        	
    	}
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
        }
    }
    void insertback(Scanner in) {
    	System.out.println("Enter the values:");
    	int val=in.nextInt();
    	Node back=new Node(null,val,null);
    	tail.next=back;
    	back.prev=tail.next;
    	tail=back;
    	
    }
    
    void insertANode(Scanner in) {
        System.out.println("Enter the value:");
        int val = in.nextInt();

        System.out.println("Enter the position:");
        int pos = in.nextInt();

        Node newNode = new Node(null, val, null);

        Node temp = head;

        if(pos==1) {
        	newNode.next=head;
        	head.prev=newNode;
        	head=newNode;
        	
        }
        else {
        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }
        
        if(temp.next==null) {
        	temp.next=newNode;
        	newNode.prev=temp;
        	tail=newNode;
        }
        else {
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        }
        }
    }
    void deleteData(Scanner in) {
        System.out.println("Enter the value:");
        int val = in.nextInt();
        Node current = head;
        while (current != null) {

            if (current.data == val) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                    else {
                        tail = null;
                    }
                }            
                else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }
   

    void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    void displayData(){
    	Node temp = head;
		while(temp!=null){
	    System.out.println(temp.data);//40
	    temp=temp.next;//null
	}
}
}

public class Main {
    public
    static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	Node node = new Node();
//		Node obj1= new Node(null,10,null);
//		Node head=obj1;
//		Node tail=obj1;
//		Node obj2=new Node(null,20,null);
//		obj2.prev=obj1;
//		obj1.next=obj2;
//		tail=obj2;
//		Node obj3=new Node(null,30,null);
//		obj3.prev=obj2;
//		obj2.next=obj3;
//		tail=obj3;	
//		Node temp = tail;
//		while(temp!=null){
//		    System.out.println(temp.data);
//	    temp = temp.prev;
//		}
		//node.displayData();
    	while(true) {
    		 System.out.println("\n1 -> Insert data");
	            System.out.println("2 -> Insert middle ");
	            System.out.println("3 -> Insert front");
	            System.out.println("4 -> Insert back");
	            System.out.println("5 -> Delete Data");
	            System.out.println("6 -> Display Reverse");
	            System.out.println("7 -> Exit");
	            
	            int n=in.nextInt();
	            switch(n) {
	            case 1:
	            	node.inertData(in);
	            	node.displayData();
                    break;
	            case 2:
	            node.insertANode(in);
	    		node.displayData();
	    		 break;
	            case 3:
		            node.insertFront(in);
		    		node.displayData();
		    		 break;
	            case 4:
		            node.insertback(in);
		    		node.displayData();
		    		 break;	
	            case 5:
		            node.deleteData(in);
		    		node.displayData();
		    		 break;	
                case 6:		 
            	node.displayReverse();
            	break;
                case 7: {
                    System.out.println("Program ended.");
                    return;
                }
	            }
    	}	
	}
}

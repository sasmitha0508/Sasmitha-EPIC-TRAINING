package circularLinkedList;

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
    void insertData(Scanner in) {
    	System.out.println("Enter No.of Data:");
    	int n=in.nextInt();
    	System.out.println("Enter the data:");
    	for(int i=0;i<n;i++) {
    		int val=in.nextInt();
    		Node obj =new Node(val,null);
    		if(head==null) {
    			head=obj;
    		}
    		else {
    			tail.next=obj;
    		}
    		
    		tail=obj;
    		obj.next=head;
    	}
    }
    void insertfront(int val) {
    	Node front=new Node(val,head);
    	head=front;	
    	tail.next=front;
    }
    void insertback(int val) {
    	Node back=new Node(val,null);
    	if(head==null) {
			head=back;
		}
		else {
			tail.next=back;
		}
		
		tail=back;
		back.next=head;
    }
    void insertANode(int val,Node temp) {
    	 Node newNode = new Node(val,null);
         newNode.next = temp.next;
         temp.next = newNode;
    	}
    	
   
    void insertDataByPosition(Scanner in){
        boolean flag = true;
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        System.out.println("Enter the position: ");
        int pos = in.nextInt();
        Node temp = head;
        for(int i=0;i<pos-2;i++){
            if(temp.next!=head){
                temp=temp.next;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            
            if(pos==1){
            	insertfront(val);
            }
            else if(temp.next == head){
            	insertback(val);
            }
            else{
            	insertANode(val,temp);
            }
        }
        else{
            System.out.println("Invalid Position");
        }
    }
}
public class CircularLinkedList {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Node node=new Node();
		node.insertData(sc);
		
	}

}

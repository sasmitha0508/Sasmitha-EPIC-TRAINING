package stack;

import java.util.Scanner;

class Main{
    int n = 10;
    int[] stack = new int[n];
    int top = -1;
    //push
    public void push(Scanner in){
        System.out.println("Enter a value: ");
        int val = in.nextInt();
        if(top==n-1){
            System.out.println("Stack Overflow");
        }
        else{
        	 top++;
            stack[top] = val;
        }
        
    }
    public void pop(Scanner in){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
           System.out.println("Deleted element:"+stack[top]);
           top--;
        }
        
    }
    public void peek() {
    	if(isEmpty()) {
    		System.out.println("Stack is Empty");
    	}
    	else {
    		System.out.println(stack[top]);
    	}
    }
    public boolean isEmpty() {
    	if(top==-1) {
    		return true;
    	}
    	return false;
    }
    void  display() {
    	for(int i=top;i>=0;i--) {
    		System.out.println(stack[i]);
    	}
    }
    
    //pop
    //peak
    //isEmpty
    //display
}


public class StackImplementation {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	Main obj=new Main();
	while(true) {
		System.out.println("1) PUSH");
		System.out.println("2) POP");
		System.out.println("3) Peek");
		System.out.println("4) Is Empty");
		System.out.println("5) Display");
		
		int n=in.nextInt();
		switch(n) {
		case 1:
			obj.push(in);
			break;
		case 2:	
			obj.pop(in);
			break;
		case 3:
		    obj.peek();
		    break;

		case 4:
		    System.out.println(obj.isEmpty());
		    break;
		case 5:	
			obj.display();
			break;
		}
	}
}
}

package Abstraction;

import java.util.Scanner;

abstract class Payment1{
	int transaction_id;
	String customer_Name;
	int Amount;
	Payment1(int transaction_id,String customer_Name,int Amount){
		this.transaction_id=transaction_id;
		this.customer_Name=customer_Name;
		this.Amount=Amount;
	}
	abstract boolean Validating_payment();
	abstract void Processing_payment();
	abstract double Cal_trans_fee();
	abstract double Cal_cashback();
	abstract double Cal_final_amount();
}
class CreditCardPayment extends Payment1{
	String cardNum;
	boolean validate_cardnumber() {
		if(cardNum.length()==16) {
			return true;
		}
		else {
			return false;
		}
	}
	CreditCardPayment(int transaction_id, String customer_Name,int Amount,String cardNum){
		super(transaction_id,customer_Name,Amount);
		this.cardNum=cardNum;
	}
	 @Override
	boolean Validating_payment() {
		return Amount>0;
	}
	 @Override
	void Processing_payment() {
		 if(Validating_payment()) {
		System.out.println("Processing the payment for the user"+customer_Name);
		 }else {
			 System.out.println("Process not succesfull");
		 }
	}
	 @Override
	double Cal_trans_fee(){
		return this.Amount*0.02;
	}
	 @Override
	double Cal_cashback(){
		return this.Amount*0.05;
	}
	 @Override
	double Cal_final_amount(){
		return  this.Amount+Cal_trans_fee();
	}
}
class UPI_payment extends Payment1{
	String UPI_ID;
	int Transc_fee;
	UPI_payment(String UPI_ID,String customer_Name,int Amount){
		super(0,customer_Name,Amount);
		this.UPI_ID=UPI_ID;
	}
	 @Override
	boolean Validating_payment() {
		return Amount>0;
	}
	 @Override
	 void Processing_payment() {
		 if(Validating_payment()) {
				System.out.println("Processing the payment for the user"+customer_Name);
				 }else {
					 System.out.println("Process not succesfull");
				 }
	}
	 @Override
	double Cal_trans_fee(){
		return Amount*0.5/100;
	}
	 @Override
	double Cal_cashback(){
		return Amount*2/100;
	}
	 @Override
	double Cal_final_amount(){
		return Amount+Cal_trans_fee();
	}
}
class net_banking extends Payment1{
	int Transc_fee;
	int acc_num;	
	net_banking(int acc_num,String customer_Name,int Amount){
		super(0,customer_Name,Amount);
		this.acc_num=acc_num;
		this.acc_num=acc_num;
		
	}
	 @Override
	boolean Validating_payment() {
		return Amount>0;
	}
	 @Override
	 void Processing_payment() {
		 if(Validating_payment()) {
				System.out.println("Processing the payment for the user"+customer_Name);
				 }else {
					 System.out.println("Process not succesfull");
				 }
	}
	 @Override
	double Cal_trans_fee(){
		return Amount*1/100;
	}
	 @Override
	double Cal_cashback(){
		return Amount*1/100;
	}
	 @Override
	double Cal_final_amount(){
		return Amount+Cal_trans_fee();
	}
}

public class Payment {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	        while (true) {
	            System.out.println("1. Credit Card Payment");
	            System.out.println("2. UPI Payment");
	            System.out.println("3. Net Banking");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int n = sc.nextInt();
	            switch (n) {
	            case 1:
	                System.out.println(" Credit Card Payment ");
	                System.out.print("Enter Transaction ID: ");
	                int transaction_id = sc.nextInt();
	                System.out.print("Enter Customer Name: ");
	                String customer_Name = sc.nextLine();
	                System.out.print("Enter Amount: ");
	                int Amount = sc.nextInt();
	                System.out.print("Enter Card Number: ");
	                String cardNum = sc.nextLine();
	                CreditCardPayment c1 = new CreditCardPayment(transaction_id, customer_Name, Amount, cardNum);
	                System.out.println("Payment Valid: "+c1.Validating_payment());
	                c1.Processing_payment();
	                System.out.println("Transaction Fee: "+ c1.Cal_trans_fee());
	                System.out.println("Cashback: "+ c1.Cal_cashback());
	                System.out.println("Final Amount: "+ c1.Cal_final_amount());
	                break;
	            case 2:
	                System.out.print("Enter UPI ID: ");
	                String UPI_ID = sc.nextLine();
	                System.out.print("Enter Customer Name: ");
	                String upi_customer = sc.nextLine();
	                System.out.print("Enter Amount: ");
	                int upi_amount = sc.nextInt();
	                UPI_payment u1 =new UPI_payment( UPI_ID, upi_customer, upi_amount);          
	                System.out.println("Payment Valid: "+u1.Validating_payment());
	                u1.Processing_payment();
	                System.out.println("Transaction Fee: "+ u1.Cal_trans_fee());
	                System.out.println("Cashback: "+ u1.Cal_cashback());
	                System.out.println("Final Amount: "+ u1.Cal_final_amount());
	                break;
	            case 3:
	                System.out.print("Enter Transaction ID: ");
	                int net_transaction_id = sc.nextInt();
	                System.out.print("Enter Customer Name: ");
	                String net_customer = sc.nextLine();
	                System.out.print("Enter Amount: ");
	                int net_amount = sc.nextInt();
	                System.out.print("Enter Account Number: ");
	                int acc_num = sc.nextInt();
	                net_banking n1 =new net_banking(net_transaction_id,net_customer, net_amount);           
	                break;
	            }
	        }


	}

}

package Projectsofjava;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		 int balance = 10000,withdraw ,deposit;
		  Scanner sc = new Scanner(System.in);
		  
		  while(true)
		  {
			  System.out.println("Automated teller machine ");
			  System.out.println("choose 1 for withdraw ");
			  System.out.println("choose 2 for deposit ");
			  System.out.println("choose 3 for check balance ");
			  System.out.println("choose 4 for Exit");
			  System.out.print("choose the operator you want to perform :");
		 
			   int choice = sc.nextInt();
			   switch(choice) {
			   case 1 :System.out.print("enter money to be withdraw:");
			    withdraw = sc.nextInt();
			    
			    if(balance>= withdraw )
			    {
			    	balance = balance- withdraw ;
			    	System.out.print("Please collect your money");
			    }
			    else {
			    	System.out.println("Insufficent Balance ");
			    }
			     System.out.println(" ");
			     break;
			   case 2:
				   System.out.println("Enter money to the deposite :");
				    deposit= sc.nextInt();
				     
				    balance = balance +deposit;
				     System.out.println("Your money has successfully deposited ");
				     System.out.println(" ");
				     break;
			   case 3:
				   System.out.println("balance :" + balance);
				   System.out.println("");
				    break;
				    
			   case 4:
				   System.exit(0);
			   }
		  }
		
	}

}

import java.util.Scanner;

public class GuessingNumberProject {

	public static void main(String[] args) {
	
		
		int attempt =1;
		int userGuessNumber =0;
		int secretNumber =(int)(Math.random() * 99 +1);
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to  Guess Number Game \n You will be Asked To Guess A number To Win the game \n You Have Maximum 5 Attempt Limit ");
		
		do {
			System.out.print("Enter a guess number Between 1 to 100\n");
			
			
		
			if(userInput.hasNextInt()) {
				userGuessNumber = userInput.nextInt();
				if(userGuessNumber == secretNumber) {
					
					System.out.println("Ohooo! , your Number u=is corrext . you will Win  the game ");
					break;
				}
				else if(userGuessNumber < secretNumber)
					System.out.println("Your guess Number is Smaller.");
				else if(userGuessNumber > secretNumber)
					System.out.println("Your guess Number is Greater. ");
				
				if(attempt==5) {
					System.out.println("You Have exceeded the maximum attempt . Try again");
					break;
					
				}
				attempt++;
				

	}else {
		System.out.println("Enter a valid Integer Number");
		break;
		
	}
		}
			while (userGuessNumber != secretNumber);
			
			}
	
     }



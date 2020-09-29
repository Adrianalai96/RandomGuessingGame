
import java.util.Random;
import java.util.Scanner;

public class Randomnumbergame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int randnum = rand.nextInt(100);
		boolean userguess = false;
		int numberoftries = 0;
		Scanner input = new Scanner(System.in);
		
		int userinput;
		int highguess=100;
		int lowguess=0;
		int repeat;
		
	
		while ( !userguess) 
		{
			numberoftries = numberoftries +1;
			
			System.out.println("Enter your guess: ");
			
			userinput = input.nextInt(); 
			System.out.println("Number of guesses: " + numberoftries);
			
			if (userinput > highguess)
			{
				System.out.println("	>>> Guess must be betweeen " + lowguess + " and " + highguess);
			}
			
			if (userinput < lowguess)
			{
				System.out.println("	>>> Guess must be betweeen " + lowguess + " and " + highguess);
			}
			
			
			
			if (userinput < randnum) 
			{
				
				System.out.println("your guess is too low");
				lowguess = userinput; 
				
				System.out.println("Enter your next guess between " + lowguess + " and " + highguess);
				
			}
			
			if (userinput == randnum) 
			{
				System.out.println("Congradulations, you guessed correctly");
				System.out.println("Try again? type ( 1 ) for yes or (2) for no");
				repeat = input.nextInt();  
				if (repeat == 1) 
				{
					userguess = false;
					numberoftries = 0;
					lowguess = 0;
					highguess = 100;
					randnum = rand.nextInt(100);
					
					
				}
				if (repeat == 2)
				{
					System.out.println("Thanks for playing...");
					userguess = true;
					
					
					
				}
								
			}  
			
			if (userinput > randnum)
			{
				System.out.println("your guess is too high");
				highguess = userinput;
				System.out.println("Enter your next guess between " + lowguess + " and " + highguess);
				
				
			}
			
			
		}
		
		

	}

}

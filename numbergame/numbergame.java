package numbergame;
//import randomnumber;
import java.util.Scanner;
public class numbergame

{
	public static void main(String[] args) 
	{
		Scanner val = new Scanner(System.in);
		System.out.println("WELCOME TO NUMBER GUESSING GAME");
		System.out.println();
		System.out.println("********************************");
		
		int min=1;
		int max=100;
		int turn=1;
		int maximumturns=10;
		int totalattempts=0;
		randomnumber randval=new randomnumber(min,max);
		boolean playing=true;
		
		while(playing)
		{
			int generatenumber=randval.getrandomnumber();
			
			int attempts=0;
			System.out.println("round "+turn+"guess it");
			 boolean guessedCorrectly = false;
			while(attempts<maximumturns)
			{
				System.out.println("enter you guessing");
				System.out.println("-------------------");
				
				
				
				if(val.hasNextInt())
				{
					int playerguess=val.nextInt();
				attempts++;
				
				
				
				
				
					if (playerguess == generatenumber) 
					{
	                    System.out.println("Congratulations! You guessed the correct number ");
	                    System.out.println("Attempts : "+attempts);
	                    guessedCorrectly = true;
	                    playing=false;
	                    break;
	                    
	                } 
					else if (playerguess < generatenumber)
	                {
	                    System.out.println("Too low! Try again.");
	                }
					else 
	                {
	                    System.out.println("Too high! Try again.");
	                }
				
				}
				else
				{
					System.out.println("invalid input");
					val.next();
				}
				
			}
			if (!guessedCorrectly)
			{
                System.out.println("Sorry, you did not guess the correct number. It was: " + generatenumber);
            }

			totalattempts =totalattempts+ attempts;
			turn++;
			
			System.out.print("Do you want to play again? (yes/no): ");
            String again = val.next().toLowerCase();
            playing = again.equals("yes");
			
			
		}
		System.out.println();
		
		System.out.println("! ! !  Game Over ! ! !");
		
		val.close();
	}
}
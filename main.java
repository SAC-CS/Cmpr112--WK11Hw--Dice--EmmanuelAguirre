// Emmanuel Aguirre
// Cmpr-112
// Wk11 HW
// 5/4/14
// main.java

import java.util.Scanner;
public class main 
{
	public static void main(String[]args)
	{
		Dice diceGame = new Dice(1);
		Scanner in = new Scanner(System.in);
		String ans = "n";
		
		System.out.println("Welcome to the Dice Simulator!\n\n");
		do
		{
			diceGame.Throw();
			System.out.println("You rolled a: " + diceGame.Value());
			System.out.print(" Do you want to roll again?(y/n): ");
			ans = in.next();
		}while( (ans.equals("Y")) || (ans.equals( "y")) );
		
		System.out.println("\n\nThere were " + diceGame.numThrows() + " throws.\n"
							+ "Below is your roll history.\n");
		diceGame.displayHistory();
	}
}
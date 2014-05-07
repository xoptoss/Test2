import java.util.Scanner;


public class mainClass {

	public static void main(String[] args) {
		double dVal;
		int amount,guess;
		Scanner tKeyboard = new Scanner(System.in);

		//Ask user how many dices
		System.out.println("How manny Dices would you like to roll?");
		amount = tKeyboard.nextInt();
		dice Dice = new dice(amount);
	
		//ask to guess number	
		System.out.println("Guess What The Dices Land on");
		guess = tKeyboard.nextInt();		
		
		//Throw Dices
		Dice.Throw(amount);	
		
		//compare guess and value 
		dVal=Dice.value;
		System.out.println("Dices Add up to "+Dice.value);
		if(guess <= dVal*1.1 && guess>= dVal*0.9) {
			System.out.println("You win!");
		}
		else{
			System.out.println("You Lose!");
		}
	}

}

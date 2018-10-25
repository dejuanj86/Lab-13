package RockPaperScissorsApp;
import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private Scanner sc;

    public HumanPlayer(String name){
        this.name = name;
        roshValue = Roshambo.Scissors;
    }

    Roshambo generateRoshamboValue() {
        System.out.println("Please enter Rock, Paper, or Scissors");
        String userInput = RockPaperScissorApp.sc.nextLine();
        roshValue = Roshambo.valueOf(userInput);
        return roshValue;
    }

	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}
}

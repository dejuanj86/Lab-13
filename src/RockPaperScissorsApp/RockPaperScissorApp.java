package RockPaperScissorsApp;
import java.util.Scanner;

public class RockPaperScissorApp {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

		        HumanPlayer human = new HumanPlayer("Dejuan");
		        ComputerPlayer computer = new ComputerPlayer("Computer");
		        Player rock = new Player("Rock Player");
		        Player currPlayer = null;
		        int userInt =-1;
		        char userChar = 'g';
		        Roshambo ourRosh;
		        Roshambo oppRosh;


		        System.out.println("Welcome to the Rock Paper Scissors game");

		        do{
		            System.out.println("Enter 1 to play against a Computer, any other number to play against Rock Player");
		            userInt = sc.nextInt();
		            sc.nextLine();
		            if (userInt==1)
		                currPlayer = computer;
		            else
		                currPlayer = rock;

		            System.out.println("You chose "+ currPlayer.getName());
		            ourRosh = human.generateRoshamboValue();
		            oppRosh = currPlayer.generateRoshamboValue();
		            generateWinner(ourRosh, oppRosh);


		            System.out.println("Would you like to continue (y/n)");
		            userChar = sc.nextLine().toLowerCase().charAt(0);

		        }while (userChar=='y');


		    }

		    private static void generateWinner(Roshambo ourRosh, Roshambo oppRosh) {
		        if (ourRosh==Roshambo.Rock && oppRosh==Roshambo.Scissors || ourRosh==Roshambo.Scissors && oppRosh == Roshambo.Paper
		                ||ourRosh==Roshambo.Paper && oppRosh==Roshambo.Rock){
		            System.out.println("You won! Opponent chose " + oppRosh);
		        }
		        else if (ourRosh == oppRosh){
		            System.out.println("You tied. Opponent chose " + oppRosh);
		        }
		        else{
		            System.out.println("You lost. Opponent chose " +oppRosh );
		        }
		    }

		
	}



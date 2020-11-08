//Rock Paper Scissors Game (Kamara)
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors2 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        Random Rand = new Random();

        //Score variables for user and computer plus a counter for the scores.
        int compScore = 0;
        int userScore = 0;
        int counter = 0;

        //Strings to be used within the game
        String Draw = "0 points Awarded, It's a draw!";
        String userLost = "Sorry you lost this round";
        String userWin = "Well Done You won this round!";
        String uPoints = "Your Points: ";
        String cPoints = "Computer Points: ";

        //Start of Game
        System.out.println("Welcome to Rock, Paper and Scissors");

        //Score counter starts at 0 & generates random number between 1 & 3
        while (counter == 0) {
            int compChoice = 1 + Rand.nextInt(3);

            //Asks user to input a choice
            System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors");
            int playerChoice = Scan.nextInt();

            //for when the game results in a draw
            if (playerChoice == compChoice) {
                System.out.println(Draw);

                //User lost round output
            } else if (playerChoice == 1) {
                if (compChoice == 2) {
                    System.out.println("Computer selected paper");
                    System.out.println(userLost);
                    compScore++;
                    System.out.println(cPoints + compScore);
                    System.out.println(uPoints + userScore);

                    //when user wins round output
                } else if (compChoice == 3) {
                    System.out.println("Computer Selected Scissors");
                    System.out.println(userWin);
                    userScore++;
                    System.out.println(cPoints + compScore);
                    System.out.println(uPoints + userScore);

                }

                //when user wins output2
            } else if (playerChoice == 2) {
                if (compChoice == 1)
                    System.out.println("Computer Selected Rock");
                System.out.println(userWin);
                userScore++;
                System.out.println(cPoints + compScore);
                System.out.println(uPoints + userScore);

                //when user loses round output2
            } else if (playerChoice == 3) {
                if (compChoice == 1) {
                    System.out.println("Computer Selected Rock");
                    System.out.println(userLost);
                    compScore++;
                    System.out.println(cPoints + compScore);
                    System.out.println(uPoints + userScore);

                    // when user wins round output3
                } else if (compChoice == 2) {
                    System.out.println(" Computer Selected Paper");
                    System.out.println(userWin);
                    userScore++;
                    System.out.println(cPoints + compScore);
                    System.out.println(uPoints + userScore);

                    // whoever scores 5 first wins the whole game
                } if (userScore == 5) {
                    System.out.println("Yaay! You Won The Game");
                    counter++;
                }
                if (compScore == 5) {
                    System.out.println("Oh No! You Lost The Game");
                    counter++;
                }
            }
        }
    }
}






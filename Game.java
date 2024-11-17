/**
 * Class Game:
 *  The game "ROCK, Paper and Scissors" is a game of 2 players where each
 *  player hides one hand behind his back and choses one of the 3 gestures,
 *  using his hand, that symbolizes one of the items: A fist symbolizes the
 *  ROCK, an open hand symbolizes the Paper and two fingers symbolizes the
 *  scissors.
 *  
 *  The players exposes their hands simultaneously, and one of them is
 *  declared as the winner, based on the item chosen, where Paper beats
 *  ROCK (because it wraps the ROCK), ROCK beats Scissors (because it breaks
 *  the Scissors), and Scissors beats Paper (because it cuts the Paper).
 *  If both players show the same items, it is a tie (no winner).
 *  
 *  Input:
 *  Each player choses an item: the program gets the item from the user,
 *  where R identifies the ROCK, P identifies the Paper, and S identifies 
 *  the Scissors.
 *  The program assumes the input is always valid and does not check it.
 *  
 *  Output:
 *  If player 1 wins, the program prints "Player 1 wins."
 *  If player 2 wins, the program prints "Player 2 wins."
 *  If it is a tie, the program prints "Game ends with a tie."
 *
 *  For example:
 *  If the input is 'S' for the 1st player and 'R' for the 2nd players,
 *  then the output is "Player 2 wins."
 *  If the input is 'P' for the 1st player and 'R' for the 2nd players,
 *  then the output is "Player 1 wins."
 *  If the input is 'R' for the 1st player and 'R' for the 2nd players,
 *  then the output is "Game ends with a tie."
 *
 * @author (Zvika Barak)
 * @ID (050982479)
 * @version (12.11.2024)
 */

import java.util.Scanner;   // import the Scanner class

public class Game
{
    public static void main(String[] args)
    {
        final char ROCK = 'R';
        final char PAPER = 'P';
        final char SCISSORS = 'S';
        final int TIE = 0;
        
            // construct the object scan to be used to get input from the user
        Scanner scan = new Scanner (System.in);
        
            // print the 1st prompt and ask the 1st player to input his object
        System.out.println("Enter first player's object:");
            // get the object entered and assign it to player 1
        char player1 = scan.next().charAt(0);
            // print the 2nd prompt and ask the 2nd player to input his object
        System.out.println("Enter second player's object:");
            // get the object entered and assign it to player 2
        char player2 = scan.next().charAt(0);
            // calculate who is the winner (0=tie, 1=1st player, 2=2nd player
        int winner = TIE;
        if (player1 != player2)
        {
            winner = 1;
            if ((player1 == SCISSORS && player2 == ROCK) || 
                (player1 == PAPER && player2 == SCISSORS) ||
                (player1 == ROCK && player2 == PAPER))
                winner = 2;
        }
        if (winner == TIE)
            System.out.println("Game ends with a tie.");
        else
            System.out.println("Player " + winner + " wins.");
    }   // end of method main
}   //end of class Game

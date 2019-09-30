/*
 * I'm thinking about a number. Guess it. If you've ever played that game of some version
 * of it then you're ready for the next assignment. The computer will "pick" a number.
 * Actually, you'll program one in the code.
 * Create a number-guessing game using a while loop. The loop will allow a user to guess
 * until the secret number is guessed.
 */


import java.util.Scanner;

public class GuessNumber {
    public static void main(String args[]){
        final int SECRET_NUMB = 5;
        int guess = 0;
        boolean cont = true;

        Scanner keybd = new Scanner(System.in);
        System.out.println("I am thinking about a number between 1 and 10...\nCan you guess it?");

        while (cont) {
            guess = keybd.nextInt();
            if (guess < SECRET_NUMB)
                System.out.println("It's too low. Guess again.");
            else if (guess > SECRET_NUMB)
                System.out.println("It's too high. Guess again.");
            else {
                System.out.println("That's right! You are a good guesser.");
                cont = false;
            }
        }
    }
}

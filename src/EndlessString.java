/*
 * The following program should allow the user to input as many things as they want
 * until they want to stop. Each time it is supposed to repeat with what the user
 * said BUT in all upper-case letters.
 */

import java.util.Scanner;

public class EndlessString {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.println("Enter a string. Type \'q\' to quit:");
        userInput = keyboard.nextLine();

        while (!userInput.equalsIgnoreCase("q")) {
            System.out.println(userInput.toUpperCase());
            userInput = keyboard.nextLine();
        }
    }
}

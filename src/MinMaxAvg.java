/*
 * Write a program to accept test scores from a user to find the
 * minimum, maximum, and average test scores.
 */
import java.util.Scanner;

public class MinMaxAvg {
    public static void main (String args[]){
        int min=0, max=0, sum=0;
        double avg=0.0;
        int score, counter=0;

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");
        score = keybd.nextInt();

        while (score != -1) {
            if ((min == 0) || (min > score))
                min = score;

            if ((max == 0) || (max < score))
                max = score;

            sum += score;
            counter++;

            System.out.println("Enter next test score. Type -1 to quit.");
            score = keybd.nextInt();
        }

        if (counter > 0)
            avg = sum / counter;

        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}

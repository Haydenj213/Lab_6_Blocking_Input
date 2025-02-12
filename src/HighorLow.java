import java.util.Scanner;
import java.util.Random;


public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int val = generator.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Hello! Please input your guess as to what the random number could be.");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                done= true;

            } else {
                trash = in.nextLine();
                System.out.println("\nYou input " + trash + " as your guess");
                System.out.println("Please try guessing again with a whole integer (Number).");
            }
        } while(!done);

        System.out.println(val);

        if (guess > val)
            System.out.println("Looks like your guess was higher than the random number.");
        else if (guess < val)
            System.out.println("Looks like your guess was lower than the random number.");
        else if (guess == val)
            System.out.print("Looks like you are right on the money with your guess!");

    }
}

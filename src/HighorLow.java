import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        int val = gen.nextInt(10) + 1;
        int userGuess = 0;
        boolean done = false;

        do {
            System.out.println("Guess a number between 1-10: ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();
                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 10");
                }
            }
        } while (!done) ;

            System.out.println("The random number was: " + val);

            if (userGuess > val) {
                System.out.println("Your guess was too high!");
            } else if (userGuess < val) {
                System.out.println("Your guess was too low!");
            } else {
                System.out.println("Congratulations! Your guess was on the money!");
            }
            in.close();

    }
}

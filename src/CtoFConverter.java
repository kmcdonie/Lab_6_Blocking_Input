import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int faren;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter your temperature in Celsius: ");
            if (in.hasNextInt()) {
                int celsius = in.nextInt();

                faren = (celsius * 9 / 5) + 32;
                System.out.println("Your temperature in Fahrenheit is " + faren);
            } else {
                trash = in.nextLine();
                System.out.println("You entered a bad input, try again");
            }
        } while (!done);

        in.close();
    }
}

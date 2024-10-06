import java.util.Scanner;
public class FuelCosts{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;

        boolean done = false;

        do {
            System.out.println("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                if (gallonsInTank > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid input! Gallons must be positive number");
                }
            }
        } while (!done);

        do {
            done = false;
            System.out.println("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                if (fuelEfficiency > 0) {
                    done = true;

                } else {
                    System.out.println("Invalid input! Fuel efficiency must be positive number");
                }
            }
        } while (!done);

        do {
            done = false;
            System.out.println("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon > 0) {
                    done = true;

                } else {

                    System.out.println("Invalid input! Price must be positive number");
                }
            }
        } while (!done);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distance = gallonsInTank * fuelEfficiency;

        System.out.println("Cost per 100 miles: " + costPer100Miles);
        System.out.println("Distance the car can go with full tank of gas: " + distance);

        in.close();
    }
}

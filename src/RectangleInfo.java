import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;

        boolean done = false;

        do {
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid input! Width must be positive number");
                }
            }
        } while (!done);

        do {
            done = false;
            System.out.println("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid input! Height must be positive number");
                }
            }
        } while (!done);

        double area = width * height;
        double perimeter = (width * 2) + (height * 2);
        double diagonal = (width * width) + (height * height);

        System.out.println("The area of your rectangle is " + area + " and the perimeter of the rectangle is " + perimeter);
        System.out.println("The length of the diagonal is " + diagonal);

        in.close();
    }
}

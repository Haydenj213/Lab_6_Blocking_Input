import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double height = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        String trash1 = "";
        String trash2 = "";
        boolean done = false;

        do {
            System.out.println("Hello! Please input the height of the rectangle.");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash1 = in.nextLine();
                System.out.println("\nYou input " + trash1 + " as your height. ");
                System.out.println("Please enter a valid number to use as the height.");
            }
        } while(!done);

        do {
            System.out.println("Hello! Please input the width of the rectangle.");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash2 = in.nextLine();
                System.out.println("\nYou input " + trash2 + " as your width. ");
                System.out.println("Please enter a valid number to use as the width.");
            }
        } while(!done);

        perimeter = (2 * height) + (2 * width);
        area = height * width;

        double a = Math.pow(height, 2);
        double b = Math.pow(width, 2);
        double c = a + b;
        double diagonal = Math.sqrt(c);

        System.out.println("The perimeter of your rectangle is " + perimeter);
        System.out.println("The area of your rectangle is " + area);
        System.out.println("The diagonal of your rectangle is " + diagonal);
    }
}
import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double tankSize = 0.0;
        double fuelEfficiency = 0.0;
        double gasPrice = 0.0;
        double hundredMileCost = 0.0;
        double maxDistance = 0.0;
        String trash1 = "";
        String trash2 = "";
        String trash3 = "";
        boolean done = false;

        do {
            System.out.println("Hello. First, please enter how many gallons of gas your cars gas tank can hold.");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash1 = in.nextLine();
                System.out.println("\nYou input " + trash1 + " as your gas tank amount.");
                System.out.println("Please provide an actual number for how many gallons of gas your cars gas tank can hold.");
            }
        } while(!done);

        do {
            System.out.println("Next, please enter the fuel efficiency of your vehicle in mpg.");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash2 = in.nextLine();
                System.out.println("\nYou input " + trash2 + " as your fuel efficiency");
                System.out.println("Please provide an actual number for your car's fuel efficiency in Miles Per Gallon.");
            }
        } while(!done);

        do {
            System.out.println("Finally, please enter the current cost of gas per gallon in your area.");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash3 = in.nextLine();
                System.out.println("\nYou input " + trash3 + " as your local gas price");
                System.out.println("Please provide an actual number for your area's local gas price.");
            }
        } while(!done);

            hundredMileCost = (100/fuelEfficiency) * gasPrice;
            maxDistance = tankSize * fuelEfficiency;

            System.out.println("It looks like it would cost you $" + hundredMileCost + " to drive 100 miles.");
            System.out.println("The max distance you can drive your car with a full tank of gas would be " + maxDistance + " miles.");

        }
    }
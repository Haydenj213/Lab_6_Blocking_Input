import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double temperatureF = 0.0;
        double temperatureC = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Hello! Please input your temperature in Degrees Fahrenheit.");
            if (in.hasNextDouble()) {
                temperatureF = in.nextDouble();
                in.nextLine();
                temperatureC = (temperatureF - 32) * 5 / 9;
                System.out.println("Your temperature in Degrees Celsius is " + temperatureC + "° C");
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou input " + trash + " as your temperature. ");
                System.out.println("Please enter a valid temperature in Degrees Fahrenheit.");
            }
        } while(!done);
    }
}
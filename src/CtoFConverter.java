import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double temperatureF = 0.0;
        double temperatureC = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Hello! Please input your temperature in Degrees Celsius.");
            if (in.hasNextDouble()) {
                temperatureC = in.nextDouble();
                in.nextLine();
                temperatureF = (temperatureC * 9/5) + 32;
                System.out.println("Your temperature in Degrees Fahrenheit is " + temperatureF + "° F");
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou input " + trash + " as your temperature. ");
                System.out.println("Please enter a valid temperature in Degrees Celsius.");
            }
        } while(!done);
    }
}
package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven:");
        double miles = input.nextDouble();
        System.out.println("Amount of Gas Consumed(gallons):");
        double gas = input.nextDouble();
        input.close();

        double milesPerGallon = miles / gas;
        System.out.println("Your miles per gallon are  " + milesPerGallon);
    }
}

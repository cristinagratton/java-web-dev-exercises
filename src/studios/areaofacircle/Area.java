package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius of Circle:");
        double radius = input.nextDouble();
        if (radius < 0) {
            System.err.println("enter a valid number");
        }
        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);
    }
}

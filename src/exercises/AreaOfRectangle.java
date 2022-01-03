package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of rectangle:");
        double length = input.nextDouble();
        System.out.println("Width of rectangle:");
        double width = input.nextDouble();
        input.close();

        double area = width * length;
        System.out.println("The area of the rectangle is " + area);
    }
}

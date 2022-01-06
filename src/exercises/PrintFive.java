package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintFive {
    public static void five(ArrayList<String> par) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of word: ");
        double length = input.nextDouble();
        for (String word : par) {
            if (word.length() == length ) {
                System.out.println(word);
            }
        }
    }
}

package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap <Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;

        System.out.println("Enter your students (or Enter 0):");

        //get student id and names
        do {

            System.out.print("Student ID: ");
            newID = input.nextInt();

            if (!newID.equals(0)) {
                System.out.print("Name: ");
                String newName = input.next();
                students.put(newID, newName);

                input.nextLine();
            }
        } while(!newID.equals(0));

        System.out.println("\nClass roster: ");
        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}

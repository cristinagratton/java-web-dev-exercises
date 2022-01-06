package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList.add(10);
        int sum = 0;
        for (Integer num : numList) {
            if (num%2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceSplit = sentence.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(sentenceSplit));

        Scanner input = new Scanner(System.in);
        System.out.println("Length of word: ");
        double length = input.nextDouble();
        for (String word : wordList) {
            if (word.length() == length ) {
                System.out.println(word);
            }
        }

    }
}

package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numList.add(i+1);
        }

        int sum = EvenSum.sum(numList);
        System.out.println(sum);

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceSplit = sentence.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(sentenceSplit));
        PrintFive.five(wordList);
    }
}

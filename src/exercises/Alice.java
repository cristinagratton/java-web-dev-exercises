package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get " +
                "very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice " +
                "'without picture or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search for word: ");
        String word = input.next();
        input.close();
        String lowerCaseFirst = firstSentence.toLowerCase();
        String lowerCaseWord = word.toLowerCase();
        boolean found = lowerCaseFirst.contains(lowerCaseWord);
        System.out.println(found);
        if (found) {
            int indexFound = lowerCaseFirst.indexOf(lowerCaseWord);
            int lengthFound = lowerCaseWord.length();
            System.out.println("The index of the word is: " + indexFound);
            System.out.println("The length of the word is: " + lengthFound);
            String updatedSentencePartOne = lowerCaseFirst.substring(0, indexFound);
            String updatedSentencePartTwo = lowerCaseFirst.substring(indexFound + lengthFound);
            System.out.println(updatedSentencePartOne + updatedSentencePartTwo);
        }
    }
}

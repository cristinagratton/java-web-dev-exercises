package studios.countingcharacters;

import java.util.*;

public class counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Quote: ");
        String quote = input.nextLine();
        quote = quote.toLowerCase();
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.\n";
        String[] charactersInString = quote.split("");
        HashMap<String, Integer> characterList = new HashMap<>();
        int characterCount = 1;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (String i : charactersInString) {

            if (alphabet.contains(i)) {
                if (characterList.containsKey(i)) {
                    characterList.put(i, characterList.get(i) + 1);
                } else {
                    characterList.put(i, characterCount);
                }
            }


        }

        System.out.println(characterList);
    }
}

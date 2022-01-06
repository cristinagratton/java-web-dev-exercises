package exercises;

import java.util.ArrayList;

public class EvenSum {
    public static int sum(ArrayList<Integer> par) {
        int sum = 0;
        for (Integer num : par) {
            if (num%2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}

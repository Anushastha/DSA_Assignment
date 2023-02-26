package OtherQues;

import java.util.*;

public class Que6b {
    // Map to associate each letter to its corresponding digit
    private static final Map<Character, Integer> LETTER_TO_DIGIT = new HashMap<Character, Integer>() {{
        put('S', 6);
        put('I', 5);
        put('X', 0);
        put('E', 8);
        put('V', 7);
        put('N', 2);
        put('T', 1);
        put('W', 3);
        put('Y', 4);
    }};

    public static boolean isSumEqual(String[] words, String result) {
        // Compute the sum of the numbers represented by each word in the array
        int sum = 0;
        for (String word : words) {
            int value = 0;
            for (char c : word.toCharArray()) {
                value = value * 10 + LETTER_TO_DIGIT.get(c);
            }
            sum += value;
        }

        // Compute the number represented by the targeted word
        int target = 0;
        for (char c : result.toCharArray()) {
            target = target * 10 + LETTER_TO_DIGIT.get(c);
        }

        // Check if the sum of the numbers in the array equals the number represented by the targeted word
        return sum == target;
    }

    public static void main(String[] args) {
        String[] words = {"SIX", "SEVEN", "SEVEN"};
        String result = "TWENTY";
        boolean res = isSumEqual(words, result);
        System.out.println(res);
    }
}
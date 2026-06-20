import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Step 2: Find frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            ch = Character.toLowerCase(ch); // ignore case
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("\nCharacter Frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        // Step 3: Reverse the word
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("\nReversed Word: " + reversed);

        // Step 4: Check if it's a palindrome (ignore case)
        String originalLower = word.toLowerCase();
        String reversedLower = reversed.toLowerCase();
        if (originalLower.equals(reversedLower)) {
            System.out.println("\nThe word is a palindrome.");
        } else {
            System.out.println("\nThe word is NOT a palindrome.");
        }

        scanner.close();
    }
}

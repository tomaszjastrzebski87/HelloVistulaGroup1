import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word to check: ");
        String word = scanner.nextLine().toLowerCase();
        StringBuilder reversedWord = new StringBuilder(word).reverse();

        if (word.contentEquals(reversedWord)) {
            System.out.println("Entered word is a palindrome.");
        } else {
            System.out.println("Entered word is not a palindrome.");
        }
    }
}

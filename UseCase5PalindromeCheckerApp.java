import java.util.Stack;

/**
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * 
 * Use Case 5: Stack Based Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome using a Stack 
 * data structure which follows the LIFO principle.
 * 
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * 
 * This maps stack behavior to reversal Logic.
 * 
 * @author Developer
 * @version 5.0
 */
public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            char reversedChar = stack.pop();
            
            if (c != reversedChar) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: Success! It is a palindrome.");
        } else {
            System.out.println("Result: Failure! It is not a palindrome.");
        }
    }
}

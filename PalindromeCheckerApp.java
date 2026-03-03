/**
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * 
 * Use Case 4: Character Array Based Validation
 * 
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 * 
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * 
 * This reduces extra memory usage.
 * 
 * @author Developer
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";
        
        char[] charArray = input.toCharArray();
        
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Mismatch found, exit early
            }
            start++; // Move forward from start
            end--;   // Move backward from end
        }

        System.out.println("Input Array: " + java.util.Arrays.toString(charArray));
        if (isPalindrome) {
            System.out.println("Result: Success! '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: Failure! '" + input + "' is not a palindrome.");
        }
    }
}

/**
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * 
 * Use Case 3: Reverse String Based Palindrome Check
 * 
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with 
 * the original value.
 * 
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * 
 * This introduces transformation-based validation.
 * 
 * @author Developer
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Predefined input for validation
        String input = "radar";
        String reversed = "";

        System.out.println("Original String: " + input);

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            // Building the reversed version of the string
            reversed += input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Compares original and reversed strings
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Validation: SUCCESS. The string is a palindrome.");
        } else {
            System.out.println("Validation: FAILURE. The string is NOT a palindrome.");
        }
    }
}

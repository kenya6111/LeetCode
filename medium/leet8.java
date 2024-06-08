package medium;

public class leet8 {
    public static int myAtoi(String s) {
        // Step 1: Remove leading whitespace
        s = s.trim();

        // If string is empty after removing whitespace, return 0
        if (s.isEmpty()) {
            return 0;
        }

        // Initialize variables
        int sign = 1;
        int result = 0;
        int index = 0;
        int n = s.length();

        // Step 2: Check the sign
        char firstChar = s.charAt(index);
        if (firstChar == '-') {
            sign = -1;
            index++;
        } else if (firstChar == '+') {
            index++;
        }

        // Step 3: Iterate over the characters of the string
        while (index < n) {
            char currentChar = s.charAt(index);

            // Stop if the current character is not a digit
            if (!Character.isDigit(currentChar)) {
                break;
            }

            int digit = currentChar - '0';

            // Check for overflow and underflow conditions
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        // Return the final result with the appropriate sign
        return result * sign;
    }

    
public static void main(String[] args){
    System.out.println("aaa");

    System.out.println(myAtoi("42")); // Output: 42
    System.out.println(myAtoi("   -042")); // Output: -42
    System.out.println(myAtoi("1337c0d3")); // Output: 1337
    System.out.println(myAtoi("0-1")); // Output: 0
    System.out.println(myAtoi("words and 987")); // Output: 0

 }

}

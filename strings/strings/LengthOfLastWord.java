/**
 * Problem: Length of Last Word
 * Link: https://leetcode.com/problems/length-of-last-word/
 *
 * Approach:
 * - Start from the end of the string
 * - Count characters until a space is found after counting some letters
 * - Return the count of the last word
 *
 * Time Complexity: O(n) -> iterate through the string once
 * Space Complexity: O(1) -> no extra space used
 */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean foundChar = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    break; // last word found
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s)); // Output: 5
    }
}

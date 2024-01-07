class Solution {
    public String removeConsecutiveCharacter(String S) {
        // Get the length of the input string
        int n = S.length();
        
        // Initialize an empty string to store the result
        String res = "";
        
        // Iterate through each character in the input string
        for (int i = 0; i < n; i++) {
            // Check if the current character is equal to the next character
            if (i < n - 1 && S.charAt(i) == S.charAt(i + 1)) {
                // If consecutive characters are the same, skip to the next iteration
                continue;
            } else {
                // If consecutive characters are different, append the current character to the result
                res = res + S.charAt(i);
            }
        }
        
        // Return the final result after removing consecutive duplicate characters
        return res;
    }
}

public class RunLengthEncoder {

    public static void main(String args[]) {

        // Test case 1 - Expected: w4a3d1e1x6
        String str1  = "wwwwaaadexxxxxx";
        System.out.println(encode(str1));
        
        // Test case 2 - Expected: a4b3c3
        String str2  = "aaaabbbccc";
        System.out.println(encode(str2));
        
        // Test case 3 - Expected: ""
        String str3  = "";
        System.out.println(encode(str3)); 
        
        // Test case 4 - Expected: a1b3c1d4
        String str4  = "abbbcdddd";
        System.out.println(encode(str4)); 
    }
  
    public static String encode(String input) {

        String result = "";
        
        // Check for empty string
        if (input == null || input.length() == 0)
            return result;
        
        // Counter for number of times the current character repeats
        int numberOfRepetitions = 1;
        
        // Iterate through the string starting from the 2nd character
        for (int i = 1; i < input.length(); i++) {
            // If the current character is the same as the previous one, increase the counter
            if (input.charAt(i) == input.charAt(i - 1)) {
                numberOfRepetitions++;
            } 
            // If the current character is different, append the previous char and its count
            else {
                result = result + input.charAt(i - 1) + numberOfRepetitions;
                // Reset counter for the new character
                numberOfRepetitions = 1;
            }
        }
        
        // Append the last character and its count
        result = result + input.charAt(input.length() - 1) + numberOfRepetitions;
        
        return result;
    }
}

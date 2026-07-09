// Last updated: 7/9/2026, 10:15:01 AM
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert int array to String array
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        
        // Sort using custom comparator
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                // We sort in descending order of concatenation
                return order2.compareTo(order1); 
            }
        });
        
        // Handle the edge case where the largest number is "0"
        if (numStrs[0].equals("0")) {
            return "0";
        }
        
        // Build the final string
        StringBuilder result = new StringBuilder();
        for (String str : numStrs) {
            result.append(str);
        }
        
        return result.toString();
    }
}
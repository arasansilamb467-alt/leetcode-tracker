// Last updated: 7/9/2026, 10:15:20 AM
class Solution {

    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        int result = 0;

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        if (i < s.length() &&
            (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // Read digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Overflow check
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 &&
                 digit > Integer.MAX_VALUE % 10)) {

                return (sign == 1)
                        ? Integer.MAX_VALUE
                        : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        return result * sign;
    }
}
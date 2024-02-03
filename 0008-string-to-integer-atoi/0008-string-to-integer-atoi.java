class Solution {
    public int myAtoi(String s) {
           if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int result = 0;
        int i = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
    }

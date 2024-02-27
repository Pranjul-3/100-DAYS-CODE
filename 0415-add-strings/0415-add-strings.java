class Solution {
    public String addStrings(String num1, String num2) {
         int l = num1.length() - 1;
        int l2 = num2.length() - 1;
        int x = 0;
        int carry = 0;
        StringBuilder answer = new StringBuilder(); 
        while (l >= 0 || l2 >= 0 || carry > 0) {
            int digit1 = (l >= 0) ? Character.getNumericValue(num1.charAt(l)) : 0;
            int digit2 = (l2 >= 0) ? Character.getNumericValue(num2.charAt(l2)) : 0;

            x = digit1 + digit2 + carry;

            carry = x / 10;
            x %= 10;

            answer.insert(0, x); 
            if (l >= 0) l--;
            if (l2 >= 0) l2--;
        }

        return answer.toString();
    }
}
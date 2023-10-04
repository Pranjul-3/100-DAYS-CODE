import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;

		String x = s.trim();

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ' ')
				len = 0;
			else
				len++;
		}

		return len;
        
    }
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING");
    
		String input = sc.nextLine();
		Solution obj = new Solution();
		System.out.println("The length of last word is "
						+ obj.lengthOfLastWord(input));
	}


}
class Solution {
    public int[] plusOne(int[] digits) {
        int n =digits.length;
         int a[]= new int[digits.length+1];
        for (int i=n-1; i>= 0; i--) {
	if (digits[i]<9) {
		digits[i]=digits[i]+1;
		return digits;
	}
	digits[i]=0;
}
a[0]=1;
return a;
    }
}
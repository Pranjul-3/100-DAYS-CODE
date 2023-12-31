class Solution {
    public int maxNumberOfBalloons(String text) {
		int[] arr = new int[5];
		for(char c : text.toCharArray()) {
			switch (c) {
				case 'b' : arr[0]++; break;
				case 'a' : arr[1]++; break;
				case 'n' : arr[2]++; break;
				case 'l' : arr[3]++; break;
				case 'o' : arr[4]++; break;
			}
		}
		int min1 = Math.min(Math.min(arr[0], arr[1]), arr[2]);
		int min2 = Math.min(arr[3], arr[4]);
		return Math.min(min1, min2 / 2);
    }
}
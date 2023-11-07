class Solution {
    public int getWinner(int[] arr, int k) {
        int w=arr[0],c=0;
        for (int i = 1; i < arr.length; i++) 
            {
                if(c==k)
                {
                    return w;
                }
                else if(w>arr[i])
                {
                    c++;
                }
                else
                {
                    w=arr[i];
                    c=1;
                }
            }
        return w;
    }
}
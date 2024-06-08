class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        boolean[] a = new boolean[n];
        for(int i = 2; i<Math.sqrt(n); i++){
            if(a[i]==false){
                for(int j = i*i; j<n; j+=i){
                    a[j]=true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i<n; i++){
            if(a[i]==false){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public String getPermutation(int n, int k) {
       ArrayList<Integer> arr = new ArrayList<>();
        int fact = 1;
        for(int i = 1;i<n;i++){
            arr.add(i);
            fact*=i;
        }
        k = k-1;
        String s = "";
        arr.add(n);
        while(true){
            s += ""+arr.get(k/fact);
            arr.remove(Integer.valueOf(arr.get(k/fact)));
            if(arr.size() == 0){
                break;
            }
            k = k%fact;
            fact = fact/arr.size();
        }
        return s;  
    }
}
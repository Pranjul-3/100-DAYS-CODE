class Solution {
    public String[] findRelativeRanks(int[] score) {
         String[] ans1 = new String[score.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for(int i=0; i<score.length; i++){
             if(max < score[i]){
                 max = score[i];
             }
        }

          int[] arr = new int[max+1];

        for(int i =0; i<score.length; i++){
            arr[score[i]]++;
        }
        
        int j = 1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != 0){
                map.put(i,j++);
            }
        }

        for(int i=0; i<score.length; i++){
               
               int pos = map.get(score[i]);
               if(pos == 1){
                   ans1[i] = "Gold Medal";
               }else if(pos == 2){
                    ans1[i] = "Silver Medal";
               }else if(pos == 3){
                   ans1[i] = "Bronze Medal";
               }else{
                   ans1[i] = "" + pos;
               }
        }

        return ans1;
        
    }
}
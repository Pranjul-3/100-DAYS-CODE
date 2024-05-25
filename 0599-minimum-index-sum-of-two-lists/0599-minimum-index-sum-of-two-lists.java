class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>H=new LinkedHashMap<>();
        for(int i=0;i<list1.length;i++){
            H.put(list1[i],i);
        }
        
        ArrayList<String>A=new ArrayList<>();
        int sum=Integer.MAX_VALUE;
        // int least=0;

        for(int i=0;i<list2.length;i++){
          if(H.containsKey(list2[i])){
              int tempsum=i+H.get(list2[i]);
              if(tempsum<sum){
                  sum=tempsum;
            }
          }
        }
          for(int i=0;i<list2.length;i++){
          if(H.containsKey(list2[i])){
              int tempsum=i+H.get(list2[i]);
              if(tempsum==sum){
                  A.add(list2[i]);
            }
          }
        }
        String[]ans=new String[A.size()];

        for(int i=0;i<A.size();i++){
            ans[i]=A.get(i);
        }

        return ans;
    }
}
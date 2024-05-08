class Solution {
    static List<List<Integer>> ans;

    static void helper(int arr[], int idx, List<Integer> curr){
        if(idx>=arr.length){
            ArrayList<Integer> a = new ArrayList<>(curr);
            ans.add(a);
            return;
        }

        helper(arr,idx+1,curr);
        curr.add(arr[idx]);
        helper(arr,idx+1,curr);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        helper(nums,0,new ArrayList<>());
        return ans;
    }
}
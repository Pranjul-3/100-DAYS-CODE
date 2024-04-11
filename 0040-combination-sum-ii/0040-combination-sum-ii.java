class Solution {
  List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,target,0,new ArrayList<>());
        return ans;
    }
    public void backtracking(int [] candidates,int target,int rejected, ArrayList<Integer> list){
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=rejected;i<candidates.length;i++){
            if(i>rejected && candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            backtracking(candidates,target-candidates[i],i+1,list);
            list.remove(list.size()-1);
        }
    }
}
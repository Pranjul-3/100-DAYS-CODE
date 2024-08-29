/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
         public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        order(root,0,ans);
        return ans;
    }
    public void order(TreeNode root,int index,List<List<Integer>> li){
        if(root!=null){
            if(index==li.size()){
                li.add(new ArrayList<>());
            }
            order(root.left,index+1,li);
            li.get(index).add(root.val);
            order(root.right,index+1,li);
        }
    }
}
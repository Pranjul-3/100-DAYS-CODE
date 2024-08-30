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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        
        int level = 0;

        while (!queue.isEmpty()) {
            
            int size = queue.size();
            
            List<Integer> ls = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                
                TreeNode t = queue.poll();
                ls.add(t.val);

                if (t.left != null) {
                    queue.offer(t.left);
                }

                if (t.right != null) {
                    queue.offer(t.right);
                }

            }
           if(level%2==0){
                ans.add(ls);
            }
            else {
                ans.add(ls.reversed());
            }
            level+=1;
        }
        return ans;
    }
}
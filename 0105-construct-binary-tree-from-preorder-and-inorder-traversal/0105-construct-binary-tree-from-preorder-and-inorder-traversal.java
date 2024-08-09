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
   int[] preorderlst;
    int[] inorderlst;
    
    HashMap<Integer, Integer> inordernum2index = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        this.preorderlst = preorder;
        this.inorderlst = inorder;
        
        for (int i = 0; i < n; i++) {
            inordernum2index.put(inorder[i], i);
        }
        TreeNode output = buildTreeAux(0, n, 0, n);
        return output;

    }

    public TreeNode buildTreeAux(int lb, int ub, int lb2, int ub2) {

        if (lb == ub) {return null;}

        int rootval = preorderlst[lb];
        int inorderRootindex = inordernum2index.get(rootval);
        int lt1 = inorderRootindex - lb2;
        int lt2 = ub2 - inorderRootindex;
        TreeNode root = new TreeNode(rootval);
        root.left = buildTreeAux(lb +1, lb + lt1 + 1, lb2, lb2+lt1);
        root.right = buildTreeAux(lb+lt1+1, ub, lb2 + lt1 + 1, ub2);
        return root;
    }

}
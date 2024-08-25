class Solution {
    // An ArrayList to store the values of the nodes in in-order traversal
    ArrayList<Integer> arr = new ArrayList<>();
    
    // Main function to check if the tree is a valid BST
    public boolean isValidBST(TreeNode root) {
        // Perform in-order traversal and collect node values
        helper(root);
        // Check if the collected values are in strictly increasing order
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) >= arr.get(i)) {
                return false; // Not a valid BST
            }
        }
        return true; // Valid BST
    }
    
    // Helper function to perform in-order traversal
    public ArrayList<Integer> helper(TreeNode root) {
        if (root == null) return arr; // Base case: if the node is null, return the array
        helper(root.left); // Traverse the left subtree
        arr.add(root.val); // Visit the node and add its value to the array
        helper(root.right); // Traverse the right subtree
        return arr; // Return the array
    }
}
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
    
    int ans;
    
    public int helper (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftExcess = helper (root.left), rightExcess = helper (root.right);
        ans = ans + Math.abs (leftExcess) + Math.abs (rightExcess);
        return leftExcess + rightExcess + root.val - 1;
    }
    
    public int distributeCoins(TreeNode root) {
        ans = 0;
        helper (root);
        return ans;
    }
}
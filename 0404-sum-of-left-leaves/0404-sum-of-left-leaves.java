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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root,0);
        return sum;
    }
    public int dfs(TreeNode root,int dir){
         if(root==null) return 0;
        dfs(root.left,-1);
        if((root.left==null && root.right==null)&& dir == -1) sum+=root.val;
        dfs(root.right,1);
        return sum;
    }
}
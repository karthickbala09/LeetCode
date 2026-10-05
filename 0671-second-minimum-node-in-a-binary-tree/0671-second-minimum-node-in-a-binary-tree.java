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
    int res = -1;
    TreeSet<Integer> set = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        System.out.println(set);
        int i=0;
        if (set.size()==1) return -1;
        for(int n:set){
            i++;
            if(i==2){
                res = n;
                break;
            }
        }
        return res;

    }
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        set.add(root.val);
        dfs(root.right);
    }
}
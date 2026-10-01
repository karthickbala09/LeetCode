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
    StringBuilder sub = new StringBuilder();
    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return list;
    }

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        int len = sub.length();

        if (root.left == null && root.right == null) {
            sub.append(root.val);
            list.add(sub.toString());
        } else {
            sub.append(root.val + "->");
        }

        dfs(root.left);
        dfs(root.right);

        sub.delete(len, sub.length());
    }

}
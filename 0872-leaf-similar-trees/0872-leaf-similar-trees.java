class Solution {
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, l1);
        dfs(root2, l2);

        return l1.equals(l2);
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        dfs(root.left, list);
        dfs(root.right, list);
    }
}
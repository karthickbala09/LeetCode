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
    HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        dfs(root);
        for(int key :map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                list.clear();
                list.add(key);
            }
            else if(map.get(key)==max){
                list.add(key);
            }
        }
           int arr[] = new int[list.size()];
           int ind =0;
           for(int n:list) {
            arr[ind++] = n;
           }
        
        return arr;
    }
    public void dfs(TreeNode root){
        if(root==null) return ;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        dfs(root.left);
        dfs(root.right);
    }
}
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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            int l=minDepth(root.left);
        int r=minDepth(root.right);
        return 1+Math.max(l,r);
        }
        else if(root.right==null){
            int l=minDepth(root.left);
        int r=minDepth(root.right);
        return 1+Math.max(l,r);
        }
        else{
            int l=minDepth(root.left);
        int r=minDepth(root.right);
        return 1+Math.min(l,r);
        }
        
    }
}
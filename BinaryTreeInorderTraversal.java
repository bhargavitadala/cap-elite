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
class Solution 
{
    
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        
        if(root == null)
            return list;

        TreeNode ptr = root;

        traversal(ptr);

        return list;
    }

    
    public void traversal (TreeNode root)
    {
        
        if(root == null)
            return;

        traversal(root.left);

    
        list.add(root.val);

        //now recur on the right node
        traversal(root.right);
    }
}
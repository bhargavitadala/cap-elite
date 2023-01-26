class Solution {
	List<List<Integer>> levelOrder_helper(TreeNode root){
		List<List<Integer>>answer = new ArrayList<>();

		if(root == null)
		   return answer;

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while(q.size() != 0){
			int size = q.size();
			List<Integer> ans = new ArrayList<>();
			while(size-- != 0){
				TreeNode front = q.remove(); //got poped
				if(front.left != null){
					q.add(front.left);
				}
				if(front.right != null){
					q.add(front.right);
				}

				ans.add(front.val);
			}
		   answer.add(ans);
		}
		return answer;
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		return levelOrder_helper(root);
	}
}

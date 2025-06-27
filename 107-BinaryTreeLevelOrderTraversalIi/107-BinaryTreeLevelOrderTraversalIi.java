// Last updated: 6/27/2025, 11:57:07 AM
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return result;
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> ans = new ArrayList<>();
            int level = q.size();
            for (int i = 0; i < level; i++) {

                TreeNode temp = q.peek();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                ans.add(q.peek().val);
                q.remove();
            }
            result.add(ans);
        }
        Collections.reverse(result);
        return result;
    }
}
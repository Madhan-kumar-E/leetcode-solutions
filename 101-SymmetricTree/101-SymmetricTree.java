// Last updated: 6/27/2025, 11:57:08 AM
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return isMirror(root.left, root.right);
    }
    boolean isMirror(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;
        return isMirror(left.left, right.right)&&isMirror(left.right, right.left);
    }
}
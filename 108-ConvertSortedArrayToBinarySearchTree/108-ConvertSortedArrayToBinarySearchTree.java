// Last updated: 6/27/2025, 11:57:05 AM
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, start, mid - 1);
        root.right = helper(nums, mid + 1, end);

        return root;
    }
}
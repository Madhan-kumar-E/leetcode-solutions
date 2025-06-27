// Last updated: 6/27/2025, 11:56:45 AM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int k=(nums.length*(nums.length+1))/2;
        return k-sum;
    }
}
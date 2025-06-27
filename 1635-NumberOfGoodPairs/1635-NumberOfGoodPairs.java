// Last updated: 6/27/2025, 11:56:28 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int a=0; a<nums.length; a++){
            for(int b=a+1; b<nums.length; b++){
                if(nums[a]==nums[b]){
                    count++;
                }
            }
        }
        return count;
    }
}
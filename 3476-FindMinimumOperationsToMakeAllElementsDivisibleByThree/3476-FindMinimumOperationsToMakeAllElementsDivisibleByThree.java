// Last updated: 6/27/2025, 11:56:19 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count+=1;
            }
        }
        return count;
        
    }
}
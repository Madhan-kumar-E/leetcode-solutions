// Last updated: 6/27/2025, 11:57:24 AM
class Solution {
    public int maxSubArray(int[] nums) {
       int res=0;
       int  max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            res +=nums[i];
            max= Math.max(max,res);
            if(res<0){
                res = 0;
            }
            
        } 
        return max; 
}
}
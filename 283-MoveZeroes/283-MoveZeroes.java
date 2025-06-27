// Last updated: 6/27/2025, 11:56:43 AM
class Solution {
  public void moveZeroes(int[] nums) {
    int i = 0;
    for (final int num : nums)
      if (num != 0)
        nums[i++] = num;

    while (i < nums.length)
      nums[i++] = 0;
  }
}
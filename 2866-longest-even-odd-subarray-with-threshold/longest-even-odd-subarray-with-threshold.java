class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) 
    {
        int best = 0, len = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] > threshold) len = 0; 
            else if (len > 0 && nums[i] % 2 != nums[i - 1] % 2) len++;
            else  len = (nums[i] % 2 == 0) ? 1 : 0;
            best = Math.max(best, len);
        }
        return best;
    }
}
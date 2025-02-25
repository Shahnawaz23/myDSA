package leetcode;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        // Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int size = Integer.MAX_VALUE;
        int sum = 0;

        int n = nums.length;
        while(j<n) {
            sum += nums[j];
            j++;
            while(sum >= target) {
                int currentSize = j - i;
                size = Math.min(currentSize, size);
                sum -= nums[i];
                i++;
            }
        }
        return (size == Integer.MAX_VALUE) ? 0 : size;
    }
}

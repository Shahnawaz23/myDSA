package leetcode;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        k = k% nums.length;;
        //first half
        reverse(nums,0,nums.length-k-1);
        //second half
        reverse(nums,nums.length-k, nums.length-1);
        // all
        reverse(nums,0, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

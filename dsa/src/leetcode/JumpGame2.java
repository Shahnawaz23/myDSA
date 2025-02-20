package leetcode;

public class JumpGame2 {
    public int jump(int[] nums) {

        int jump = 0, r =0, l = 0;
        while(r < nums.length-1) {
            int farthest = 0;
            for(int i = l; i<=r; i++) {
                farthest = Math.max(i+nums[i], farthest);
            }

            l = r + 1;
            r = farthest;
            jump += 1;
        }

        return jump;


//        int jumps = function(nums, 0,0);
//        return jumps;
    }

    public static int function(int[] nums, int index, int jump) {           //time complexity 2^N
        if(index >= nums.length-1) {
            return jump;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<=nums[index]; i++) {
            min = Math.min(min, function(nums, index + i, jump + 1));
        }
        return min;
    }

}

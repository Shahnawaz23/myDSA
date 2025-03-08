package leetcode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] index = new int[2];
        int n = nums.length;
        // for(int i = 0; i<n-1; i++) {
        //     for(int j = i + 1; j<n; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             index[0] = i;
        //             index[1] = j;
        //             return index;
        //         }
        //     }
        // }

        // return index;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++) {
            int rem = target - nums[i];
            if(map.containsKey(rem)) {
                return new int[] {map.get(rem),i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}

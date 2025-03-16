package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;

        int i = 0;
        while(i<n) {
            int start = i;
            int end = i;
            while(end < n -1 && nums[end + 1] == nums[end] + 1) {
                end++;
            }
            if(end > start) {
                list.add(Integer.toString(nums[start]) + "->" + Integer.toString(nums[end]));
            } else {
                list.add(Integer.toString(nums[start]));
            }
            i = end + 1;
        }
        return list;
    }
}

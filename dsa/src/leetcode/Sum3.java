package leetcode;

import java.util.*;

public class Sum3 {

    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

//        Set<List<Integer>> st = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            Set<Integer> set = new HashSet<>();
//            for (int j = i + 1; j < n; j++) {
//                int sum = -(nums[i] + nums[j]);
//                if (set.contains(sum)) {
//                    List<Integer> temp = Arrays.asList(nums[i], nums[j], sum);
//                    Collections.sort(temp); // Sort the triplet
//                    st.add(temp); // Add to set
//                }
//                set.add(nums[j]); // Add current number to set
//            }
//        }
//
//        // Convert set to list and return
//        return new ArrayList<>(st);


        //optimal
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i<n; i++) {
            int j = i+1;
            int k = n - 1;
            if(i>0 && nums[i] == nums[i-1]) continue;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return list;
    }
}

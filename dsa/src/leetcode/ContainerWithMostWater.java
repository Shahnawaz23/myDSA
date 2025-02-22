package leetcode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxWater = 0;
        int n = height.length;
        int l = 0, r = height.length - 1;
        int minHeight = 0;
        while (l < r) {
            int length = r - l;

            if (height[l] < height[r]) {
                minHeight = height[l];
                l++;
            } else {
                minHeight = height[r];
                r--;
            }

            int area = minHeight * length;
            maxWater = Math.max(maxWater, area);
        }

        //BruteForce
        // for(int i = 0; i < n - 1; i++) {
        //     for(int j = i + 1; j<n; j++) {
        //         int length = j - i;
        //         int h1 = height[i];
        //         int h2 = height[j];
        //         int minHeight = Math.min(h1, h2);
        //         int water = length * minHeight;
        //         maxWater = Math.max(maxWater,water);
        //     }

        return maxWater;
    }
}


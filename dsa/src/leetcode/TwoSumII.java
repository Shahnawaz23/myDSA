package leetcode;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int n = numbers.length;

        //Brute force
        // for(int i = 0; i<n-1; i++) {
        //     for(int j = i + 1; j<n; j++) {
        //         if(numbers[i] + numbers[j] == target) {
        //             index[0] = i+1;
        //             index[1] = j+1;
        //             return index;
        //         }
        //     }
        // }

        // Better
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i<n; i++) {
        //     int num1 = numbers[i];
        //     int num2 = target - num1;
        //     if(map.containsKey(num2)) {
        //         index[0] = i+1;
        //         index[1] = map.get(num2) + 1;
        //         Arrays.sort(index);
        //         return index;
        //     } else {
        //         map.put(num1, i);
        //     }
        // }


        //optimal
        int l = 0, r = numbers.length - 1;
        while(l < r) {
            int sum = numbers[l] + numbers[r];
            if(sum == target) {
                index[0] = l + 1;
                index[1] = r + 1;
                return index;
            } else if(sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return index;
    }
}

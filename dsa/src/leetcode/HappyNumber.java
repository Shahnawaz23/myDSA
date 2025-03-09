package leetcode;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1) {
            int sum = 0;
            while(n>0) {
                int dig = n % 10;
                n = n /10;
                sum += (dig * dig);
            }
            n = sum;
            if(set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
        return true;
    }
}

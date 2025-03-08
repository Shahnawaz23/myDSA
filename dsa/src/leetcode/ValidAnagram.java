package leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int m = s.length();
        int n = t.length();

        if(m != n) {
            return false;
        }

        // for(int i = 0; i<n; i++) {
        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);
        //     if(!map.containsKey(ch1)) {
        //         map.put(ch1, 1);
        //     } else {
        //         map.put(ch1, map.get(ch1) + 1);
        //     }
        // }

        // for(int i = 0; i<n; i++) {
        //     char ch2 = t.charAt(i);
        //     if(map.containsKey(ch2)) {
        //         if(map.get(ch2)> 1) {
        //             map.put(ch2, map.get(ch2) - 1);
        //         } else {
        //             map.remove(ch2);
        //         }
        //     } else {
        //         return false;
        //     }
        // }

        // return true;

        int[] count = new int[26];
        for(int i = 0; i<n; i++) {
            int ch1 = s.charAt(i);
            int ch2 = t.charAt(i);
            count[ch1 - 'a']++;
            count[ch2 - 'a']--;
        }

        for(int c : count) {
            if(c != 0) {
                return false;
            }
        }
        return true;
    }
}

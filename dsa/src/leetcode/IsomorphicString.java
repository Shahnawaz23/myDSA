package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (reverseMap.containsKey(ch2)) {
                    return false;
                }
                map.put(ch1, ch2);
                reverseMap.put(ch2, ch1);
            }
        }

        return true;
    }
}

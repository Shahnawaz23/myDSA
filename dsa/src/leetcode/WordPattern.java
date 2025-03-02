package leetcode;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        for(int i = 0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = words[i];
            if(map.containsKey(ch)) {
                if(map.get(ch).equals(str)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if(map.containsValue(str)){
                    return false;
                }
                map.put(ch, str);
            }
        }
        return true;
    }
}

package leetcode;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();

        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i<n; i++) {
        //     char ch = magazine.charAt(i);
        //     if(map.containsKey(ch)) {
        //         map.put(ch,map.get(ch) + 1);
        //     } else {
        //         map.put(ch, 1);
        //     }
        // }

        // for(int i = 0; i<m; i++) {
        //     char  ch = ransomNote.charAt(i);
        //     if(map.containsKey(ch)) {
        //         if(map.get(ch) > 1) {
        //             map.put(ch,map.get(ch) - 1);
        //         } else {
        //             map.remove(ch);
        //         }
        //     } else {
        //         return false;
        //     }
        // }
        // return true;

        int[] count = new int[26];
        for(int ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        for(int ch : ransomNote.toCharArray()) {
            if(count[ch - 'a'] == 0) {
                return false;
            }
            count[ch - 'a']--;
        }
        return true;
    }
}

package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
//        String str = "";
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) {
                ch = Character.toLowerCase(ch);
                str.append(ch);
            }

        }

        int l = 0;
        int r = str.length()-1;
        while(l<r) {
            int ch1 = str.charAt(l);
            int ch2 = str.charAt(r);
            if(ch1 != ch2) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

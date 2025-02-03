package strings;

import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        substring(str);
    }

    public static void substring(String str) {

        for(int i = 0; i<str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                String ss = str.substring(i,j);
                if(isPalindrome(ss)) {
                    System.out.print(ss+" ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(String ss) {
        int i = 0;
        int j = ss.length() -1;
        while (i<=j) {
            if(ss.charAt(i) != ss.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }

        }
        return true;
    }
}

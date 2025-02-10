package strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        sb.append(str);
        toggleCase(sb);
    }

    public static void toggleCase(StringBuilder sb) {
        for(int i = 0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                char uch = (char) ('A' + ch - 'a');
                sb.setCharAt(i,uch);
            } else if(ch >= 'A' && ch <= 'Z') {
                char lch = (char)('a'+ ch - 'A');
                sb.setCharAt(i,lch);
            }
        }

        System.out.println(sb);
    }
}

package strings;

import java.util.Scanner;

public class StringWithASCIIDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(difference(str));
    }

    public static String difference(String str) {

        StringBuilder sbr = new StringBuilder();

        sbr.append(str.charAt(0));

        for(int i = 1; i<str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = curr - prev;
            sbr.append(gap);
            sbr.append(curr);
        }
        return sbr.toString();
    }
}

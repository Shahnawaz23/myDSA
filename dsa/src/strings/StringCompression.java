package strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        compression1(str);
        compression2(str);
    }

    public static void compression1(String str) {
        String s = String.valueOf(str.charAt(0));
        for(int i = 1; i<str.length(); i++) {
            char currentChar = str.charAt(i);
            char prevChar = str.charAt(i-1);
            if(prevChar != currentChar) {
                s += currentChar;
            }
        }
        System.out.println(s);
    }

    public static void compression2(String str) {
        String s = String.valueOf(str.charAt(0));
        int count = 1;
        for(int i = 1; i<str.length(); i++)  {
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i-1);

            if(currChar == prevChar) {
                count++;
            } else {
                if(count == 1) {
                    s += currChar;
                } else {
                    s = s + count + currChar;
                    count=1;
                }
            }
        }
        if(count > 1) {
            s += count;
        }
        System.out.println(s);

    }
}

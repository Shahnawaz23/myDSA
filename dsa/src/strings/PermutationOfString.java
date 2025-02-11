package strings;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        stringPermutation(str);
    }

    public static void stringPermutation(String str) {
        int n = str.length();
        int fact = factorial(n);

        for (int i = 0; i<fact; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int j = n; j>= 1; j--) {
                int rem = temp % j;
                int qot = temp / j;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp = qot;
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i<=n; i++) {
            result *= i;
        }

        return result;
    }
}

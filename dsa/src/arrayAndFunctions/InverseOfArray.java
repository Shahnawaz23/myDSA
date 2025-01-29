package arrayAndFunctions;

import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        inverse(arr);
    }

    public static void inverse(int[] arr) {

        int[] rev = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            int v = arr[i];
            rev[v] = i;
        }

        for(int val : rev) {
            System.out.println(val);
        }
    }
}

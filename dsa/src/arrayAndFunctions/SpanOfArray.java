package arrayAndFunctions;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(span(arr));
    }

    public static int span(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}

package arrayAndFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n; i++) {
            arr[i] = sc.nextInt();
        }

        barChart(arr);
    }

    public static void barChart(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for(int floor = max; floor >= 1; floor--) {
            for(int i = 0; i< arr.length; i++) {
                if(arr[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

package searchingAlgo;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int find = sc.nextInt();

        System.out.print(search(arr, find));
    }


    public static int search(int[] arr, int find) {
        int first = 0;
        int last = arr.length -1;
        while(first <= last) {
            int mid = (first + last) / 2;
            if(arr[mid] < find) {
                first = mid + 1;
            } else if(arr[mid] > find) {
                last = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

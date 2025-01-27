package arrayAndFunctions;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        System.out.println(index(arr,element));
    }

    public static int index(int[] arr, int element) {

        for(int i =0; i< arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }

        return -1;
    }
}

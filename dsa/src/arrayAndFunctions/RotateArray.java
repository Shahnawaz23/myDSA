package arrayAndFunctions;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr,k);
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if(k < 0) {
            k = k + arr.length;
        }

        if(k == arr.length || k == 0) {
            display(arr);
            return;
        }
        //firstPart
        reverse(arr, 0, arr.length - k-1);
        //secondPart
        reverse(arr, arr.length - k , arr.length - 1);
        //All
        reverse(arr, 0, arr.length-1);

        display(arr);
    }

    public static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    public static void display(int[] arr) {
        for(int val : arr) {
            System.out.print(val+ " ");
        }
    }
}

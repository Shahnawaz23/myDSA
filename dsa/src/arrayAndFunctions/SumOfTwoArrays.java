package arrayAndFunctions;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0;i<n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0;i<n2; i++) {
            arr2[i] = sc.nextInt();
        }

        sumOfTwoArrays(arr1,arr2);
    }

    public static void sumOfTwoArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length,arr2.length);

        int carry = 0;
        int[] result = new int[maxLength];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;

        while (k >= 0) {
            int d = carry;
            if(i >= 0) {
                d += arr1[i];
            }

            if(j >= 0) {
                d += arr2[j];
            }

            carry = d / 10;
            result[k] = d % 10;
            i--;
            j--;
            k--;

        }


        if(carry != 0) {
            System.out.print(carry+" ");
        }

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

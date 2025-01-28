package arrayAndFunctions;

import java.util.Scanner;

public class SubtractionOfTwoArrays {
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

        //arr2 will be grater
        subtractionOfTwoArrays(arr1,arr2);
    }

    public static void subtractionOfTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr2.length];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = result.length-1;
        int carry = 0;
        while(k >= 0) {
            int d = 0;
            int a1 = i >= 0 ? arr1[i] : 0;
            if(arr2[j] + carry >= a1) {
                d = arr2[j] + carry - a1;
                carry = 0;
            } else {
                d = arr2[j] + carry + 10 - a1;
                carry = -1;
            }
            result[k] = d;
            i--;
            j--;
            k--;
        }

        boolean leadingZero = true;
        for(int val : result) {
            if(val == 0 && leadingZero) {
                continue;
            }
            leadingZero = false;
            System.out.print(val+ " ");
        }
        if(leadingZero) {
            System.out.println(0);
        }

    }
}

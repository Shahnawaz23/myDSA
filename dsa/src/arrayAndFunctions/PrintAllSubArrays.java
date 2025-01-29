package arrayAndFunctions;

import java.util.Scanner;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        subArrays(arr);
    }

    public static void subArrays(int[] arr) {
//        for(int i = 0; i<arr.length; i++) {
//            for (int j = i; j<arr.length; j++) {
//                for (int k = i; k<=j; k++) {
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
//            }
//        }

        for(int i = 0; i<arr.length; i++) {
            StringBuilder subArray = new StringBuilder();
            for(int j = i; j<arr.length; j++) {
                subArray.append(arr[j]).append(" ");
                System.out.println(subArray.toString().trim());
            }
        }
    }
}

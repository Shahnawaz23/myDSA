package arrayAndFunctions;

import java.util.Scanner;

public class PrintSubSetOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        subSet(arr);
    }

    public static void subSet(int[] arr) {
        int limit = (int) Math.pow(2,arr.length);

        for(int i = 0; i<limit; i++) {
            String set = "";
            int temp = i;
            for(int j = arr.length -1; j>=0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if(rem == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] +"\t"+ set;
                }
            }
            System.out.println(set);
        }
    }
}


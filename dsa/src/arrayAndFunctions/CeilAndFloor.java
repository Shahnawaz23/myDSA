package arrayAndFunctions;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        findCielAndFloor(arr, data);
    }

    public  static void findCielAndFloor(int[] arr, int data) {

    }
}

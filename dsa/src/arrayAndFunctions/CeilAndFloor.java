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
        int l = 0;
        int h = arr.length - 1;
        int ceil = 0;
        int floor = 0;
        while(l <= h) {
            int mid = (l + h) / 2;
            if(data < arr[mid]) {
                h = mid - 1;
                ceil = arr[mid];
            } else  if(data > arr[mid]) {
                l = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}

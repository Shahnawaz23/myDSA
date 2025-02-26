package leetcode;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];
        int m = arr.length;


        for(int i = 0; i<n; i++) {
            int val = citations[i];
            if(val >= n) {
                arr[n] = arr[n] + 1;
            } else {
                arr[val] = arr[val] + 1;
            }
        }
        int count = 0;
        for(int i = m - 1; i>=0; i--) {
            count += arr[i];
            if(count >= i) {
                return i;
            }
        }
        return 0;
    }
}


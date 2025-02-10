package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
            al.add(sc.nextInt());
        }

        System.out.println(removePrime(al));
    }

    public static ArrayList<Integer> removePrime(ArrayList<Integer> al) {

        for (int i = al.size()-1; i>=0; i--) {
            int val = al.get(i);
            if(isPrime(val)) {
                al.remove(i);
            }
        }
        return al;
    }

    public static boolean isPrime(int n) {

        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

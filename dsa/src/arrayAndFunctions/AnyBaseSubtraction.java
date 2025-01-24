package arrayAndFunctions;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        int base = 7;
        int n1 = 202;
        int n2 = 21;

        System.out.println(anyBaseSubtraction(base, n1, n2));
    }

    public static int anyBaseSubtraction(int base, int n1, int n2) {
        int result = 0;
        int p = 1;
        int borrow = 0;

        while(n1 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2/ 10;

            d1 = d1 - borrow;

            if(d1 < d2) {
                borrow = 1;
                d1 = d1 + base;
            } else {
                borrow = 0;
            }

            int d = d1 - d2;

            result += d * p;
            p = p * 10;
        }
        return result;
    }
}

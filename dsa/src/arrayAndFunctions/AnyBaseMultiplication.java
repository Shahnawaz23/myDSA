package arrayAndFunctions;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        int n1 = 1220;
        int n2 = 31;
        int base = 7;

        System.out.println(getProduct(base,n1, n2));
    }

    public static int getProduct(int base, int n1, int n2) {
        int result = 0;
        int p = 1;
        while(n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int product = getProductOfSingleDigit(base, n1, d2);
            result = getSum(base, result, product * p);
            p = p * 10;
        }
        return result;
    }

    public static int getProductOfSingleDigit(int base, int n1, int d2) {
        int result = 0;
        int carry = 0;
        int p = 1;
        while(n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + carry;
            carry = d / base;
            d = d %base;

            result += d * p;
            p = p * 10;
        }

        return result;
    }

    public static int getSum(int base, int n1, int n2) {
        int result = 0;
        int p = 1;
        int carry = 0;

        while(n1 > 0 || n2 > 0 || carry > 0) {

            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int digit = digit1 + digit2 + carry;
            carry = digit / base;
            digit = digit % base;

            result = result + digit * p;
            p = p * 10;
        }
        return  result;
    }
}

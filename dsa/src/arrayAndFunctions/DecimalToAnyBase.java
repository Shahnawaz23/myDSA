package arrayAndFunctions;

class DecimalToAnyBase {
    public static void main(String[] args) {

        int n = 634;
        int base = 2;

        System.out.println(decimalToAnyBase(n, base));
    }

    public static int decimalToAnyBase(int n, int base) {
        int result = 0;

        int i = 0;
        while (n > 0) {
            int temp = n % base;
            int digit = (int) (temp * Math.pow(10,i));
            result += digit;
            i++;
            n = n / base;
        }

        return result;
    }
}
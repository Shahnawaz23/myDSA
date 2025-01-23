package arrayAndFunctions;

class AnyBaseToDecimal {

    public static void main(String[] args) {
        int n = 1172;
        int base = 8;

        System.out.println(anyBaseToDecimal(n,base));
    }


    static int anyBaseToDecimal(int n, int base) {
        int result = 0;
        int i = 0;
        while (n > 0) {
            int temp = n % 10;
            int digit = (int) ( temp * Math.pow(base,i));
            result += digit;
            i++;
            n /= 10;
        }

        return result;
    }
}

package arrayAndFunctions;

class AnyBaseToAnyBase {
    public static void main(String[] args) {
        int n = 1050;
        int givenBase = 8;
        int requiredBase = 2;

        int decimal = anyBaseToDecimal(n,givenBase);
        int destinationBase = decimalToAnyBase(decimal,requiredBase);
        System.out.println(destinationBase);


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

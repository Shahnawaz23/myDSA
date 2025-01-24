package arrayAndFunctions;

public class AnyBaseAddition {
    public static void main(String[] args) {
        int n1 =  236;
        int n2 = 754;
        int base = 8;

        System.out.println(baseAddition(n1, n2, base));
    }

    public static int baseAddition(int n1, int n2, int base) {

//        StringBuilder str = new StringBuilder();

        int carry = 0;

//        while(n1 > 0 || n2 > 0 || carry > 0) {
//            int digit1 = n1 % 10;
//            int digit2 = n2 % 10;
//
//            int sum = digit1 + digit2 + carry;
//
//            if(sum >= base) {
//                carry = 1;
//                sum = sum % base;
//            } else {
//                carry = 0;
//            }
//
//            str.append(sum);
//
//            n1 = n1/10;
//            n2 = n2/10;
//        }
//
//        str.reverse();

//        String st = str.toString();
//
//        return Integer.parseInt(st);

        int result = 0;
        int p = 1;

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



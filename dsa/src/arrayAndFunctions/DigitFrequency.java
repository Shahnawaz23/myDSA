package arrayAndFunctions;

public class DigitFrequency {
    public static  void main(String args[]) {

        int n = 432425;
        int f = 2;

        System.out.println(frequency(n,f));
    }

    public static int frequency(int n, int f) {
        int count = 0;
        while(n > 0) {
            int temp = n % 10;
            if(temp == f) {
                count++;
            }
            n = n / 10;
        }

        return  count;
    }
}
package leetcode;

public class RomanToInteger {
    public int romanToInt(String s) {
        // HashMap<Character, Integer> hm = new HashMap<>();
        // hm.put('I',1);
        // hm.put('V',5);
        // hm.put('X',10);
        // hm.put('L',50);
        // hm.put('C',100);
        // hm.put('D',500);
        // hm.put('M',1000);

        // int result = hm.get(s.charAt(s.length()-1));
        // for(int i = s.length()-2; i>=0; i--)  {
        //     if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))) {
        //         result -= hm.get(s.charAt(i));
        //     } else {
        //         result += hm.get(s.charAt(i));
        //     }
        // }

        // return result;

        int result = 0;
        int prevValue = 0;

        for(int i = s.length() - 1; i>= 0; i--) {
            int currValue = getValue(s.charAt(i));
            if(prevValue > currValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}

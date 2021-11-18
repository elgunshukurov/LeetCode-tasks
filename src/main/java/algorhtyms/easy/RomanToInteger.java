package algorhtyms.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XL"));
    }

    static int romanToInt(String s) {
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i<n-1 && s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                sum += 4;
                i++;
            } else if (i<n-1 && s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                sum += 9;
                i++;
            } else if (i<n-1 && s.charAt(i)=='X' && s.charAt(i+1)=='L'){
                sum += 40;
                i++;
            } else if (i<n-1 && s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                sum += 90;
                i++;
            } else if (i<n-1 && s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                sum += 400;
                i++;
            } else if (i<n-1 && s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                sum += 900;
                i++;
            } else {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }
}

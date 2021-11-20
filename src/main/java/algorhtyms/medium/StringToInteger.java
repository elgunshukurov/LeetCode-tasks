package algorhtyms.medium;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "76 ii";

        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s) {
        int answer;
        boolean positive = true;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        if (!containsDigit(s)) {
            return 0;
        }

        if (s.contains(" ")) {
            s = s.trim();
        }

        if (digitCheckAtFirstChar(s.charAt(0))) {
            if (s.charAt(0) == 43) {
                s = s.substring(1);
                if (digitCheckAtFirstChar(s.charAt(0))) return 0;
            } else if (s.charAt(0) == 45) {
                positive = false;
                s = s.substring(1);
                if (digitCheckAtFirstChar(s.charAt(0))) return 0;
            } else {
                return 0;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int b = s.charAt(i);
            if (b > 57 || b < 48) {
                s = s.substring(0,i);
                break;
            }
        }

        try {
            answer = Integer.parseInt(s);
            if (!positive) {
                return answer * -1;
            }
        } catch (Exception e) {
            if (positive) {
                return max;
            } else {
                return min;
            }
        }

        return answer;
    }

    static boolean containsDigit(String s) {
        if (s.isBlank()) return false;
        int dc = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                dc ++;
            }
        }

        return dc > 0;
    }

    static boolean digitCheckAtFirstChar(int a) {
        return a > 57 || a < 48;
    }

}

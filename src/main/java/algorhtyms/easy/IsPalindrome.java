package algorhtyms.easy;

public class IsPalindrome {
    public static void main(String[] args) {
        int x = -1231;
        System.out.println(solution(x));

    }

    static boolean solution(int x) {
        if (x<0) return false;
        if (x==0) return true;

        char[] chars = ("" + x).toCharArray();
        boolean res = true;

        for (int i = 0; i < chars.length/2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                res = false;
                break;
            }
        }

        return res;
    }
}

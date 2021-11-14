package algorhtyms.medium;

import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(solution(x));
    }

    static int solution(int x) {
        if (x==0){
            return 0;
        }

        char[] chars = ("" + x).toCharArray();

        StringBuilder sb = new StringBuilder();
        if (x<0){
            sb.append("-");
            for (int i = chars.length-1; i >= 1 ; i--){
                sb.append(chars[i]);
            }
        } else {
            for (int i = chars.length-1; i >= 0 ; i--){
                sb.append(chars[i]);
            }
        }

        String res = sb.toString();

        if (x>0){
            while (res.startsWith("0")){
                res = res.substring(1);
            }
        }else {
            res = res.substring(1);
            while (res.startsWith("0")){
                res = res.substring(1);
            }
            res = "-" + res;
        }

        return Integer.parseInt(res);
    }
}

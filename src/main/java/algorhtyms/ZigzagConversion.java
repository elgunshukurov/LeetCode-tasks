package algorhtyms;

public class ZigzagConversion {
    public static void main(String[] args) {
       String s = "PAYPALISHIRING";

        System.out.println(convert(s,3));

    }

    static String convert(String s, int numRows) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j++) {
                res.append(s.charAt(j)); //?
            }
        }

//        for (int i = 0; i < s.length(); i = i + 4) {
//            res.append(s.charAt(i));
//        }
//        for (int i = 1; i < s.length(); i = i + 2) {
//            res.append(s.charAt(i));
//        }
//        for (int i = 2; i < s.length(); i = i + 4) {
//            res.append(s.charAt(i));
//        }


        return res.toString();
    }
}

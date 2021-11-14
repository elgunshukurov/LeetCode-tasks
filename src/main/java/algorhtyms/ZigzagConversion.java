package algorhtyms;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";

        System.out.println(convert(s, 4));

    }

    static String convert(String s, int numRows) {
        // creating a stringBuilder array for the number of rows
        StringBuilder[] sb = new StringBuilder[numRows];
        // we are dividing the problem in 2 parts
        // 1. vertically moving downwards
        // 2. diagonally moving  upwards
        int length = s.length();
        int i = 0;
        for (i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        i = 0;
        while (i < length) {
            // vertically downward
            for (int j = 0; i < length && j < numRows; j++) {
                sb[j].append(s.charAt(i++));
                System.out.println("vertical:" + j +" -> -"+ sb[j].toString());
            }
            System.out.println("-----");
            // diagonally upward
            for (int j = numRows - 2; j >= 1 && i < length; j--){
                sb[j].append(s.charAt(i++));
                System.out.println("diagonal:" +  j +" -> -"+ sb[j].toString());
            }
        }
        // appending all the strings in different rows
        for (i = 1; i < numRows; i++)
            sb[0].append(sb[i]);
        return sb[0].toString();

    }
}

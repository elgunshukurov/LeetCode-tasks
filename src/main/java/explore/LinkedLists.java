package explore;


import java.util.Arrays;

public class LinkedLists {
    public static void main(String[] args) {
        System.out.println(checkInclusion());
    }

    public static boolean checkInclusion() {
        String s1 = "ab";
        String s2 = "eidbsaooo";

        int i = 0;
        while (i < s2.length()) {
            int k = 0;

            while (k < s1.length()) {
                if (s2.charAt(i) == s1.charAt(k)) {
                    char[] arr2 = s2.substring(i,i+s1.length()).toCharArray();
                    Arrays.sort(arr2);
                    char[] arr1 = s1.toCharArray();
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
                    if (Arrays.equals(arr1, arr2)) return true;
                }
            k++;
            }
        i++;
        }
        return false;
    }
}

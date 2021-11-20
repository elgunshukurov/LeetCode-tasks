package algorhtyms.hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = new int[] {1,2};
        int[] num2 = new int[] {3,4};

        System.out.println(findMedianSortedArrays(num1, num2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length+ nums2.length];

        for (int i = 0, k = 0; i < merged.length; i++,k++) {
            if (i < nums1.length) {
                merged[i] = nums1[k];
            } else if (i == nums1.length) {
                k = 0;
                merged[i] = nums2[k];
            } else {
                merged[i] = nums2[k];
            }
        }

        Arrays.sort(merged);
        double res;

        if (merged.length%2 != 0) {
            res = merged[merged.length/2];
        } else {
            double fir = merged[(merged.length-1)/2];
            double sec = merged[(merged.length+1)/2];
            res = (fir + sec)/2;
        }

        return res;
    }
}

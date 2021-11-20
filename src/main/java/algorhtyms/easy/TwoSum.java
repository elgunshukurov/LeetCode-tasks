package algorhtyms.easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int []{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
//        int[] sol = new int[2];
//
//        int a, b, k=0;
//
//        for (int i = 0; i < nums.length;) {
//            a=nums[k];
//            b=nums[i];
//            if ((a+b)==target && i!=k){
//                sol[0]=k;
//                sol[1]=i;
//                return sol;
//            }
//            if (!((a+b)==target) && i==nums.length-1 && i!=k){
//                k++;
//                i=0;
//            }
//            i++;
//        }
//        return sol;
        for (int i = 1; i < nums.length; i++){
            for (int j = i; j < nums.length;j++){
                if (target == nums[j] + nums[j - i]){
                    return new int[]{j - i, j};
                }
            }
        }
        return null;
    }
}

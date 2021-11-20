package algorhtyms.easy;

import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[] {5};
        int target = -5;

        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) return i;
        }
        return -1;

//        Map<Integer, Integer> map = new HashMap<>();
//        int res = -1, k = 0;
//
//        if (nums[0]==target) return 0;
//
//        while (k< nums.length){
//            map.put(nums[k], k);
//            if (map.containsKey(target)){
//                res = map.get(target);
//                break;
//            }
//            k++;
//        }
//
//        return res;
    }
}

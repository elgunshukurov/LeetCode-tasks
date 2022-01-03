package algorhtyms.medium;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        System.out.println(threeSum(nums));

        String s = "5";
        int a = Integer.parseInt(s);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        if (nums.length<3) return list;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        if (!containsDuplicate(list,integers)){
                            list.add(integers);
                        }
                    }
                }
            }
        }

        return list;
    }

    static int count = 0;
    public static boolean containsDuplicate(List<List<Integer>> list, List<Integer> integers) {
        for (List<Integer> integerList : list) {
            Collections.sort(integerList);
        }
        Collections.sort(integers);

        for (int i = 0; i < integers.size()-1; i++) {
            if (integers.get(i) == 0 && integers.get(i+1) ==0 && count == 0) {
                count ++;
                return false;
            }
        }

        for (List<Integer> integerList : list) {
            if (integerList.containsAll(integers)) {
                return true;
            }
        }
        return false;
    }
}

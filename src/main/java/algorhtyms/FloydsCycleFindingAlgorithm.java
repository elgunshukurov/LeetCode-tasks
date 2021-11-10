package algorhtyms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FloydsCycleFindingAlgorithm {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(1);

        ArrayList<Integer> array = new ArrayList<>(list);

        System.out.println(hasLoop(list));
//        findDuplicateList(list);
//        findDuplicateArray(array);
    }

    private static boolean hasLoop(LinkedList<Integer> list) {
        boolean loop = false;
        int slow = list.get(0);
        int fast = list.get(0);

        while (slow!=0 && fast!=0 && list.get(fast)!=0) {
            slow = list.get(slow);
            fast = list.get(list.get(fast));
            if (slow==fast) {
                System.out.println(slow);
                loop = true;
                break;
            }
        }
        return loop;
    }

    public static void findDuplicateArray(List<Integer> array) {
        int slow = array.get(0);// 2
        int fast = array.get(0);// 2

        do {
            slow = array.get(slow); // 9, 1, 5, 3, 6, 9, 1, 5
            System.out.println("slow = " + slow);
            fast = array.get(array.get(fast)); // 1, 3, 8, 9, 5, 6, 7, 1
            System.out.println("fast = " + fast);
            System.out.println("------------");
        } while (slow!=fast);
//        System.out.println("slow = " + slow);
//        System.out.println("fast = " + fast);
        fast = array.get(0);
        while (slow!=fast){
            slow = array.get(slow);
            System.out.println("slow = " + slow);
            fast = array.get(fast);
            System.out.println("fast = " + fast);
            System.out.println("------------");
        }

        System.out.println(array);
        System.out.println("slow = " + slow);
        System.out.println("fast = " + fast);
    }

    public static void findDuplicateList(List<Integer> list) {
        int slow = list.get(0);// 2
        int fast = list.get(0);// 2

        do {
            slow = list.get(slow); // 9, 1, 5, 3, 6, 9, 1, 5
            System.out.println("slow = " + slow);
            fast = list.get(list.get(fast)); // 1, 3, 8, 9, 5, 6, 7, 1
            System.out.println("fast = " + fast);
            System.out.println("------------");
        } while (slow!=fast);
//        System.out.println("slow = " + slow);
//        System.out.println("fast = " + fast);
        fast = list.get(0);
        while (slow!=fast){
            slow = list.get(slow);
            System.out.println("slow = " + slow);
            fast = list.get(fast);
            System.out.println("fast = " + fast);
            System.out.println("------------");
        }

        System.out.println(list);
        System.out.println("slow = " + slow);
        System.out.println("fast = " + fast);
    }

}

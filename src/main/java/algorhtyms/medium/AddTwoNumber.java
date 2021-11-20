package algorhtyms.medium;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumber {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        List<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(solution(l1,l2));;
    }

    static List<Integer> solution(List<Integer> l1, List<Integer> l2) {
        List<Integer> l3 = new LinkedList<>();
        int a = 0;
        int b = 1;
        for (Integer integer : l1) {
            a = a + integer * b;
            b = b * 10;
        }
        int c = 0;
        int d = 1;
        for (Integer integer : l2) {
            c = c + integer * d;
            d = d * 10;
        }
        int  e = a + c;
        while (e>1){
            l3.add(e%10);
            e = e/10;
        }
        return l3;
    }
}

package algorhtyms.medium;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumber {
    public static void main(String[] args) {
//        System.out.println(addTwoNumbers(new ListNode(23),new ListNode(45)));
    }
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode answerNode = new ListNode(0);
//        ListNode tempNode = answerNode;
//        while (l1 != null || l2 != null) {
//            // If one of list is null considering null as 0, as zero will not have any impact on addition.
//            int l1Val= (l1!=null)?l1.val:0;
//            int l2Val= (l2!=null)?l2.val:0;
//
//            int currSum=l1Val+l2Val+carry;
//            carry=currSum/10;
//
//            ListNode newNode=new ListNode(currSum%10);
//            tempNode.next=newNode;
//
//            if(l1!=null) l1=l1.next;
//            if(l2!=null) l2=l2.next;
//            tempNode=tempNode.next;
//        }
//
//        //If there is a left over carry
//        if(carry>0){
//            ListNode newNode=new ListNode(carry);
//            tempNode.next=newNode;
//            tempNode=tempNode.next;
//
//        }
//        return answerNode.next;    }

//    public static void main(String[] args) {
//        List<Integer> l1 = new LinkedList<>();
//        l1.add(2);
//        l1.add(4);
//        l1.add(3);
//        List<Integer> l2 = new LinkedList<>();
//        l2.add(5);
//        l2.add(6);
//        l2.add(4);
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(solution(l1,l2));;
//    }
//
//    static List<Integer> solution(List<Integer> l1, List<Integer> l2) {
//        List<Integer> l3 = new LinkedList<>();
//        int a = 0;
//        int b = 1;
//        for (Integer integer : l1) {
//            a = a + integer * b;
//            b = b * 10;
//        }
//        int c = 0;
//        int d = 1;
//        for (Integer integer : l2) {
//            c = c + integer * d;
//            d = d * 10;
//        }
//        int  e = a + c;
//        while (e>1){
//            l3.add(e%10);
//            e = e/10;
//        }
//        return l3;
//    }
}

// class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
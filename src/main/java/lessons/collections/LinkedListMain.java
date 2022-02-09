package lessons.collections;

public class LinkedListMain {
    public static void main(String[] args) throws NodeOutOfSizeException {
        MySinglyLinkedList list = new MySinglyLinkedList();

        list.creatingSinglyLinkedList(1);
//        System.out.println(list.head.data);

        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(6);

        list.showNodes();
        System.out.println(list.head.data);

    }
}

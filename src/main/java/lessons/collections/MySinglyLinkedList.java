package lessons.collections;

public class MySinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public void creatingSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        head = node;
        tail = node;
        size = 1;
    }

    public void addNode(int nodeValue) {
        System.out.println("********");
        Node node  = new Node(nodeValue);
        tail.nextElement = node;
        tail = node;
        size++;
    }

    public void nodeInsertion(int nodeValue, int location) throws NodeOutOfSizeException {
        Node node = new Node(nodeValue);
        if (head == null) {
            System.out.println("----");
            creatingSinglyLinkedList(nodeValue);
        }else if (location == 0) {
           node.nextElement = head;
           head = node;
        } else if (location == size) {
            node.nextElement = null;
            tail.nextElement = node;
            tail = node;
        } else if (location > size) {
            throw new NodeOutOfSizeException();
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.nextElement;
                index++;
            }
            Node nextNode = tempNode.nextElement;
            node.nextElement = nextNode;
            tempNode.nextElement = node;
        }
        size++;
    }

    public Node getNode(int target) {
        Node tempNode = head;
        int index = 0;
        while (index < target-1) {
            tempNode = tempNode.nextElement;
            index++;
        }
        return tempNode;
    }

    public void showNodes() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.data);
            tempNode = tempNode.nextElement;
        }
    }

    public int size() {
        return size;
    }


    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Node is empty!");
        } else if (location == 0){
            head = head.nextElement;
            size--;
            if (size == 0){
                tail = null;
            }
        } else if (location == size) {
            Node tempNode = head;
            for (int i = 0; i < size-1; i++) {
                tempNode = tempNode.nextElement;
            }
            tempNode.nextElement = null;
            tail = tempNode;
            size--;
        }
    }
}

package lessons.collections;

public class NodeOutOfSizeException extends Exception{
    public NodeOutOfSizeException() {
        System.err.println("Location is bigger than size of list!");
    }

    public NodeOutOfSizeException(String message) {
        super(message);
    }
}

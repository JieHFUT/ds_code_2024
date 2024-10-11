package linkedlist;

public class LinkedListIsEmptyException extends RuntimeException {

    private static final long serialVersionUID = 18394638428945L;

    public LinkedListIsEmptyException() {

    }
    public LinkedListIsEmptyException(String message) {
        super(message);
    }

    public LinkedListIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}

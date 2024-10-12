package stack;

public class StackIsEmptyException extends RuntimeException {
    private static final long serialVersionUID = 1372654478562986L;

    public StackIsEmptyException() {

    }
    public StackIsEmptyException(String message) {
        super(message);
    }
    public StackIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}

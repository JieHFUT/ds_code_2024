package stack;

public class StackIsFullException extends RuntimeException {

    private static final long serialVersionUID = 137265478127876L;

    public StackIsFullException() {

    }
    public StackIsFullException(String message) {
        super(message);
    }
    public StackIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

}

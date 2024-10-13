package quene;

/**
 * ClassName: CircularQueueIsEmptyException
 * Package: quene
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/13 8:37
 * @Version 1.0
 */
public class CircularQueueIsEmptyException extends RuntimeException {

    private static final long serialVersionUID = 14856492387324L;

    public CircularQueueIsEmptyException() {
        super();
    }
    public CircularQueueIsEmptyException(String message) {
        super(message);
    }
    public CircularQueueIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}

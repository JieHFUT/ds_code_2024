package quene;

/**
 * ClassName: LinkedQueueIsEmptyException
 * Package: quene
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/13 9:10
 * @Version 1.0
 */
public class LinkedQueueIsEmptyException extends RuntimeException {

    private static final long serialVersionUID = 148769423673246L;

    public LinkedQueueIsEmptyException() {
        super();
    }
    public LinkedQueueIsEmptyException(String message) {
        super(message);
    }
    public LinkedQueueIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}

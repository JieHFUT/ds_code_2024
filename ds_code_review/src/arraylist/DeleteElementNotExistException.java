package arraylist;

/**
 * ClassName: DeleteElementNotExistException
 * Package: arraylist
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/10 20:57
 * @Version 1.0
 */
public class DeleteElementNotExistException extends RuntimeException{

    private static final long serialVersionUID = 13458943653920547L;

    public DeleteElementNotExistException(){

    }

    public DeleteElementNotExistException(String message){
        super(message);
    }

    public DeleteElementNotExistException(String message, Throwable cause){
        super(message, cause);
    }
}

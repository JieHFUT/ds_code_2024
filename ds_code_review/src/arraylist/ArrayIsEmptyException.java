package arraylist;

/**
 * ClassName: ArrayIsFullException
 * Package: arraylist
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/10 20:15
 * @Version 1.0
 */
public class ArrayIsEmptyException extends RuntimeException{

    private static final long serialVersionUID = 178432895743856L;

    public ArrayIsEmptyException(){

    }

    public ArrayIsEmptyException(String message){
        super(message);
    }

    public ArrayIsEmptyException(String message, Throwable cause){
        super(message,cause);
    }

}

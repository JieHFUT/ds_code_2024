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
public class ArrayIsFullException extends RuntimeException{

    private static final long serialVersionUID = 178432895743856L;

    public ArrayIsFullException(){

    }

    public ArrayIsFullException(String message){
        super(message);
    }

    public ArrayIsFullException(String message,Throwable cause){
        super(message,cause);
    }

}

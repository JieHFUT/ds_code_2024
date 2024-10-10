package arraylist;

/**
 * ClassName: SelfIllegalAgumentxception
 * Package: arraylist
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/10 19:48
 * @Version 1.0
 */
public class SelfIllegalAgumentxception extends RuntimeException{

    static final long serialVersionUID = 4635789632589473L;

    public SelfIllegalAgumentxception(){
    }

    public SelfIllegalAgumentxception(String message){
        super(message);
    }

    public SelfIllegalAgumentxception(String message, Throwable cause){
        super(message, cause);
    }

}

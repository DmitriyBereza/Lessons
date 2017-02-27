package exception;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class BusinessException extends RuntimeException {

    public BusinessException(){
        super();
    }

    public BusinessException(String message){
        super(message);
    }
}

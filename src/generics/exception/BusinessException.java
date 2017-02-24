package generics.exception;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;

/**
 * Created by Дмитр ий on 13.02.2017.
 */
public class BusinessException extends RuntimeException{
    public BusinessException(){
        System.out.println("Default constructor");
    }

    public BusinessException(String s) {
        super(s);
    }
}

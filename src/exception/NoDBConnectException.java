package exception;


/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class NoDBConnectException extends BusinessException {

    public NoDBConnectException(String message){
        super("DB-01: " + message );
    }
}

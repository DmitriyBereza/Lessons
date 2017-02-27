package exception;

/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class ConnectionNotClosedException extends BusinessException {

    public ConnectionNotClosedException(String message) {
        super("DB-02: " + message);
    }

}

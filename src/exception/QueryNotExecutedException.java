package exception;

import java.text.MessageFormat;

/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class QueryNotExecutedException extends BusinessException {

    public QueryNotExecutedException(){
        super("DB-03: Query not executed");
    }


    public QueryNotExecutedException(String message) {
        super("DB-03: Query not executed, " + message);

    }

    public QueryNotExecutedException(String operation, String tableName) {
        super(MessageFormat.format("DB-03: Query not executed. Can't execute {0} operation for table {1}",operation,tableName));
    }
}

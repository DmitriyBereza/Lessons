package converter;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Дмитр ий on 03.03.2017.
 */
public interface AbstractConverter<T> {

    T fromRS(ResultSet source) throws SQLException;

    String toQuery(T source);
}

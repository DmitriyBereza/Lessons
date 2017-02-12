package generics;

/**
 * Created by Дмитр ий on 10.02.2017.
 */
public interface Printer<T extends Test> {

    String printName(T t);
}

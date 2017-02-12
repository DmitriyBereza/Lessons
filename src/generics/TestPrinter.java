package generics;

/**
 * Created by Дмитр ий on 10.02.2017.
 */
public class TestPrinter implements Printer<Test> {
    @Override
    public String printName(Test test) {
        return test.getName();
    }
}

package generics;

import generics.exception.BusinessException;

public class Book {
    private String name;

    public String getName() {
        return name;
    }

    private int status ;

    public void setName(String name) throws Exception {
        throw new BusinessException();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

package dao;

import java.util.List;

public interface AbstractDao<T> {
    void init();

    T selectByName(String name);

    List<T> selectAll();

    void insert(T t);

    void update(T t);

    void delete(T t);

    void close();

}

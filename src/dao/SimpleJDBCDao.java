package dao;

import exception.ConnectionNotClosedException;
import exception.NoDBConnectException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class SimpleJDBCDao<T> implements AbstractDao<T>{
    protected Connection connection = null;


    @Override
    public void init()  {
        try{
           // Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newspaper", "root", "root");
        }catch (Exception e){
            throw new NoDBConnectException(e.getMessage());
        }
        System.out.println("Connection acquired");
    }

    @Override
    public void close() {
        if (connection == null){
            throw new ConnectionNotClosedException("Can't close not opened conection");
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new ConnectionNotClosedException(e.getMessage());
        }
    }


    @PreDestroy
    public void tearDown(){

        close();
    }
}

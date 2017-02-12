package com.company;

import java.sql.Connection;
import java.util.*;

public class Main {


    private long l = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.createDate(1L);
        main.newOne(2L);
        main.another();

        List<Connection> newConnections = new ArrayList<>();
        List<Connection> oldConnection = new ArrayList<>();
        for (Connection  connection: oldConnection) {
            if (!newConnections.contains(connection)){
                oldConnection.remove(connection);
            }
        }
        for (Connection connection : newConnections) {
            if (!oldConnection.contains(connection)){
                oldConnection.add(connection);
            }
        }
    }

    private void another() {
        System.out.println(this.l);
    }

    private void newOne(long l) {
        this.l = l;
    }

    private Date createDate(long l){
        Date date = new Date();
        date.setTime(this.l);
        return date;
    }

}
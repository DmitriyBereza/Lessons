package com.company;

/**
 * Created by Дмитр ий on 08.02.2017.
 */
public interface Second {

    default String checkTheArticle(String text){
        return "I'm default method";
    };
}

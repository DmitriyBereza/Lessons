package com.company;

public interface Censor {

    default String checkTheArticle(String text){
        return "I'm default method";
    };

    String checkTheArticle1(String text);
    String checkTheArticle2(String text);
    String checkTheArticle3(String text);

}

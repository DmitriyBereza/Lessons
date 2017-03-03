package dao;

import entity.Article;

import java.util.List;

/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDao();
        List<Article> articles = articleDao.selectAll();
        articles.forEach(System.out::println);
        System.out.println("Rows amount: "+ articles.size());


    }
}

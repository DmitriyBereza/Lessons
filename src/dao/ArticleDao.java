package dao;

import entity.Article;
import exception.QueryNotExecutedException;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class ArticleDao extends SimpleJDBCDao<Article> {

    public List<Article> selectAll() {
        String query = "SELECT * FROM ARTICLE";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            throw new QueryNotExecutedException("selectAll", "article");
        }
        return new ArrayList<>();
    }

    @Override
    public Article selectByName(String name) {
        return null;
    }

    @Override
    public void insert(Article article) {

    }

    @Override
    public void update(Article article) {

    }

    @Override
    public void delete(Article article) {

    }
}

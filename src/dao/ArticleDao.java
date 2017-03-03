package dao;

import converter.ArticleConverter;
import entity.Article;
import exception.QueryNotExecutedException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ArticleDao extends SimpleJDBCDao<Article> {

    private ArticleConverter articleConverter = new ArticleConverter();

    public List<Article> selectAll() {
        List<Article> result = new ArrayList<>();
        String query = "SELECT * FROM ARTICLE";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                result.add(articleConverter.fromRS(resultSet));
            }
        } catch (SQLException e) {
            throw new QueryNotExecutedException("selectAll", "article");
        }
        return result;
    }

    @Override
    public Article selectByName(String name) {
        return null;
    }

    @Override
    public void insert(Article article) {
        String query = MessageFormat.format("INSERT INTO ARTICLE(text,title) values ({0},{1})", article.getText(), article.getAuthor());
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
            System.out.println("Article inserted");
        } catch (SQLException e) {
            throw new QueryNotExecutedException("insert", "article");
        }
    }

    @Override
    public void update(Article article) {

    }

    @Override
    public void delete(Article article) {

    }
}

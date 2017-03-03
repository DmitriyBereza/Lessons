package converter;

import entity.Article;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Дмитр ий on 03.03.2017.
 */
public class ArticleConverter implements AbstractConverter<Article>{

    public Article fromRS(ResultSet source) throws SQLException {
        Article article = new Article();
        article.setTitle(source.getString("title"));
        article.setText(source.getString("text"));
        article.setId(source.getLong("id"));
        return article;
    }

    @Override
    public String toQuery(Article source) {
        throw new NotImplementedException();
    }


}

package dao;

/**
 * Created by Дмитр ий on 06.03.2017.
 */
public enum ArticleDaoHolder {

    INSTANCE;

    private ArticleDao articleDao = new ArticleDao();

    public AbstractDao getArticleDao(){
        return articleDao;
    }

}

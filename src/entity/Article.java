package entity;

/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class Article {

    private long id;

    private String title;

    private Author author;

    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return new StringBuilder("Article with id ").append(id).append(", title: ").append(title).append(",text: ").append(text).append("\n").toString();
    }
}

package uz.micros.jstore.entity.blog;

/**
 * Created by java on 21.05.14.
 */
import java.util.Date;
import java.util.List;

public class Post {
    private String subject;
    private String text;
    private Date data;
    private String author;
    private List<Comment> comments;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

package uz.micros.jstore.entity.blog;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true, nullable = false)
    private String subject;

    @Column(columnDefinition = "varchar(4096)", nullable = false)
    private String text;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private String author;

    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
    private Set<Comment> comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public String getShortText(){
        return text != null && text.length() > 0
                ? (text.length() > 100 ? text.substring(0, 99) + "..." : text)
                : "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}

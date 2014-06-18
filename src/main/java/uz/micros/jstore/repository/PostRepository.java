package uz.micros.jstore.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uz.micros.jstore.entity.blog.Post;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void addPost(Post post){

    }

    public Post getPost(int id){
        return null;
    }

    public void savePost(Post post){

    }

    public void deletePost(int id){

    }

    @Transactional
    public List<Post> getPosts() {
        Session session = sessionFactory.getCurrentSession();


        return session.createQuery("from Post").list();

    }
}

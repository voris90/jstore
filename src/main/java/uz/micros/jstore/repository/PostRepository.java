package uz.micros.jstore.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.micros.jstore.entity.blog.Post;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface PostRepository  extends JpaRepository<Post, Integer> {



}

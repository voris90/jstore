package uz.micros.jstore.service.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.micros.jstore.entity.blog.Blog;
import uz.micros.jstore.entity.blog.Comment;
import uz.micros.jstore.entity.blog.Post;
import uz.micros.jstore.repository.PostRepository;

import java.util.*;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post get(int id) {
        return postRepository.findOne(id);
    }

    public void delete(int id) {
        postRepository.delete(id);
    }

    public Post save(Post post) {
        if (post.getId() == 0) {
            post.setDate(new Date());
            post.setAuthor("Voris");
        }else {
            Post existing = get(post.getId());

            post.setDate(existing.getDate());
            post.setAuthor(existing.getAuthor());

        }
        return postRepository.saveAndFlush(post);
    }
}

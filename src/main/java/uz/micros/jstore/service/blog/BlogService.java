package uz.micros.jstore.service.blog;

import org.springframework.stereotype.Service;
import uz.micros.jstore.entity.blog.Blog;
import uz.micros.jstore.entity.blog.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {

    public Blog getBlog(){


        Blog blog = new Blog();
        blog.setTitle("Jstore corporate SUPER Blog");

        List<Post> posts = new ArrayList<>();

        for(int k=0; k < 3; k++){

            Post post = new Post();
            post.setSubject("Post" + k);
            posts.add(post);
        }

        blog.setPosts(posts);

        return blog;
    }

}

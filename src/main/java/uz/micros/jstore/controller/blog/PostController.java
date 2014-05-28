package uz.micros.jstore.controller.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import uz.micros.jstore.entity.blog.Post;
import uz.micros.jstore.service.blog.PostService;

/**
 * Created by java on 28.05.14.
 */
@Controller
@RequestMapping(value = "/blog/posts")
public class PostController {

    @Autowired
    private PostService service;

    @RequestMapping("/{id}/**")
    public ModelAndView getPost(@PathVariable int id) {

        Post post = service.get(id);

        return new ModelAndView("blog/post").addObject("post", post);
    }

}

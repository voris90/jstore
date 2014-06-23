package uz.micros.jstore.controller.blog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import uz.micros.jstore.entity.blog.Comment;
import uz.micros.jstore.entity.blog.Post;
import uz.micros.jstore.service.blog.PostService;

import java.util.stream.Stream;

@Controller
@RequestMapping("/blog/posts")
public class PostController {

    @Autowired
    private PostService service;

    @RequestMapping("/{id}/**")
    public ModelAndView getPost(@PathVariable int id) {

        Post post = service.get(id);

        if (post != null) {

            Comment comment = new Comment();
            comment.setPost(post);

            return new ModelAndView("blog/post")
                    .addObject("post", post)
                    .addObject("newComment", comment);
        } else {

            return new ModelAndView("redirect:/blog" );
        }
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable int id){
        Post post = service.get(id);

        if (post != null) {
            return new ModelAndView("blog/editPost")
                    .addObject("newPost", post);
        } else {

            return new ModelAndView("NotFound");
        }

    }
    @RequestMapping("/delete/{id}")
    public String delete (@PathVariable  ("id") int id){
        service.delete(id);

        return "redirect:/blog";

    }
    @RequestMapping("/create")
    public ModelAndView create(){

        return new ModelAndView("blog/editPost")
                .addObject("newPost", new Post());

    }
    @RequestMapping(method = RequestMethod.POST)

    public String save(@ModelAttribute Post post){
        post = service.save(post);

        return  "redirect:/blog/posts/" + post.getId();
    }
}

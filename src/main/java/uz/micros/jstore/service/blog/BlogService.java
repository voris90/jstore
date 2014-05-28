package uz.micros.jstore.service.blog;

import org.springframework.stereotype.Service;
import uz.micros.jstore.entity.blog.Blog;
import uz.micros.jstore.entity.blog.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlogService {

    public Blog getBlog() {


        Blog blog = new Blog();
        blog.setTitle("Jstore corporate SUPER Blog");

        List<Post> posts = new ArrayList<>();

        for (int k = 0; k < 3; k++) {

            Post post = new Post();
            post.setId(k + 100);
            post.setSubject("Post" + (k + 1));
            post.setDate(new Date());
            post.setText("\"Мы только что вернулись из микрорайона Артем. В тот момент, когда раздались новые взрывы и стала поступать информация о том, что вновь есть пострадавшие, мы отправились туда, и по дороге рядом с нашей машиной буквально упал один из снарядов, к счастью никто из членов съемочной группы не пострадал\", — рассказал в эфире телеканала \"Россия-24\" спецкор ВГТРК Сергей Арсеничев.\n" +
                    "\n" +
                    "РИА Новости http://ria.ru/world/20140528/1009652023.html#ixzz3317pyAnU");

            posts.add(post);
        }

        blog.setPosts(posts);

        return blog;
    }

}

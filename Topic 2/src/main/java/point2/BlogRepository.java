package point2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 4/7/2018.
 */
public class BlogRepository {

    private static Integer id = 0;
    private List<Blog> blogs;

    private static BlogRepository instance;

    private BlogRepository(){
        blogs = new ArrayList<Blog>();
    }

    public static BlogRepository getRepository(){
        if(instance != null){
            instance = new BlogRepository();
        }
        return instance;
    }

    public Blog add(Blog blog){
        id++;
        blog.setId(id);
        blogs.add(blog);
        return blog;
    }

    public List<Blog> get5Recent(){
        return blogs;
    }

    public List<Blog> findAll(){
        return blogs;
    }
}

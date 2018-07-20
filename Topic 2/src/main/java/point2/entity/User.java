package point2.entity;

import point2.entity.Blog;
import point2.entity.Comment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 30/6/2018.
 */
public class User {

    private String name;
    private List<Blog> blog;

    public User(String name){
        this.name = name;
        this.blog = new ArrayList<Blog>();
    }

    public Blog createBlog(Blog blog){
        return null;
    }

    public Blog postAComment(Blog blog, Comment comment){
        return null;
    }

    public Comment deleteAComment(Blog blog, Comment comment){
        return null;
    }


}

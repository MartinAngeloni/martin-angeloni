package point2.entity;

import java.util.List;

/**
 * Created by martin on 30/6/2018.
 */
public class Blog {

    private Integer id;
    private String name;
    private User creator;
    private List<Comment> comments;

    public Blog(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blog)) return false;

        Blog blog = (Blog) o;

        if (id != null ? !id.equals(blog.id) : blog.id != null) return false;
        if (name != null ? !name.equals(blog.name) : blog.name != null) return false;
        if (creator != null ? !creator.equals(blog.creator) : blog.creator != null) return false;
        return comments != null ? comments.equals(blog.comments) : blog.comments == null;
    }
}

package point2.entity;

/**
 * Created by martin on 30/6/2018.
 */
public class Comment {

    private Integer id;
    private String massage;
    private Blog blog;

    public Comment(String massage){
        this.massage = massage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment that = (Comment) o;

        return massage != null ? massage.equals(that.massage) : that.massage == null;
    }

    @Override
    public int hashCode() {
        return massage != null ? massage.hashCode() : 0;
    }
}

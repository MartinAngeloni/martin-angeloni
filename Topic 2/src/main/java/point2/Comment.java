package point2;

/**
 * Created by martin on 30/6/2018.
 */
public class Comment {

    private String massage;

    public Comment(String massage){
        this.massage = massage;
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

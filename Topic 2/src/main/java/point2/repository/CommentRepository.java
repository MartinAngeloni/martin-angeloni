package point2.repository;

import point2.entity.Blog;
import point2.entity.Comment;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 19/7/2018.
 */
public class CommentRepository {

    private static Integer id = 0;
    private static List<Comment> comments;
    private static CommentRepository instance;

    private CommentRepository(){
        comments = new ArrayList<Comment>();
    }

    public static CommentRepository getRepository(){
        if(instance == null){
            instance = new CommentRepository();
        }
        return instance;
    }

    public List<Comment> getComments(){
        return comments;
    }

    public Comment addComment(Comment comment){
        id++;
        comment.setId(id);
        comments.add(comment);
        return comment;
    }

    public boolean deleteComment(Comment comment){
        comments.remove(comment);
        return true;
    }

    public List<Comment> get5RecentEntries(){
        return comments;
    }

}

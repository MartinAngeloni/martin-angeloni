import org.junit.Before;
import org.junit.Test;
import point2.entity.Blog;
import point2.repository.BlogRepository;
import point2.entity.Comment;
import point2.entity.User;
import point2.repository.CommentRepository;
import point2.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by martin on 4/7/2018.
 */
public class TDDExercise2 {

    private User userMock;
    private Comment commentMock;

    private BlogRepository blogRepository;
    private UserRepository userRepositoryMock;
    private CommentRepository commentRepositoryMock;

    private Blog blogMock1;
    private Blog blogMock2;
    private Blog blogMock3;
    private Blog blogMock4;
    private Blog blogMock5;
    private Blog blogMock6;

    private List<Blog> blogList;
    private List<Blog> fiveRecent;
    private List<Comment> fiveRecentCommentFile;

    @Before
    public void setUp(){
        blogRepository = mock(BlogRepository.class);
        userRepositoryMock = mock(UserRepository.class);
        commentRepositoryMock = mock(CommentRepository.class);

        blogMock1 = mock(Blog.class);
        blogMock2 = mock(Blog.class);
        blogMock3 = mock(Blog.class);
        blogMock4 = mock(Blog.class);
        blogMock5 = mock(Blog.class);
        blogMock6 = mock(Blog.class);

        blogList = mock(ArrayList.class);
        fiveRecent = mock(ArrayList.class);
        fiveRecentCommentFile = mock(ArrayList.class);

        userMock = mock(User.class);
        commentMock = mock(Comment.class);
    }

    @Test
    public void secondTDDExercise2(){

        //blog created
        when(blogRepository.add(blogMock1)).thenReturn(blogMock1);
        Blog blogFound = blogRepository.add(blogMock1);
        assertEquals(blogMock1, blogFound);
        when(blogMock1.getId()).thenReturn(1);
        assertEquals(new Integer(1), blogMock1.getId());
        
        when(blogRepository.findAll()).thenReturn(blogList);
        assertEquals(blogList, blogRepository.findAll());
        //blogList = blogRepository.findAll();
        when(blogList.size()).thenReturn(1);
        assertEquals(1, blogList.size());

        //create 6 entry
        when(blogRepository.add(blogMock2)).thenReturn(blogMock2);
        Blog blogFound2 = blogRepository.add(blogMock2);
        assertEquals(blogMock2, blogFound2);
        when(blogRepository.add(blogMock3)).thenReturn(blogMock3);
        Blog blogFound3 = blogRepository.add(blogMock3);
        assertEquals(blogMock3, blogFound3);
        when(blogRepository.add(blogMock4)).thenReturn(blogMock4);
        Blog blogFound4 = blogRepository.add(blogMock4);
        assertEquals(blogMock4, blogFound4);
        when(blogRepository.add(blogMock5)).thenReturn(blogMock5);
        Blog blogFound5 = blogRepository.add(blogMock5);
        assertEquals(blogMock5, blogFound5);
        when(blogRepository.add(blogMock6)).thenReturn(blogMock6);
        Blog blogFound6 = blogRepository.add(blogMock6);
        assertEquals(blogMock6, blogFound6);

        when(blogRepository.findAll().size()).thenReturn(10);
        assertEquals("10 entry was created",10, blogRepository.findAll().size());

        //return 5 most recent entries
        when(blogRepository.get5Recent()).thenReturn(fiveRecent);
        fiveRecent = blogRepository.get5Recent();
        assertEquals("The list return 5 files",fiveRecent, blogRepository.get5Recent());

        when(blogRepository.get5Recent().get(4)).thenReturn(blogMock5);
        Blog blog5 = blogMock5;
        assertEquals(blog5, blogRepository.get5Recent().get(4));

        when(blogRepository.get5Recent().get(5)).thenReturn(blogMock6);
        Blog blog6 = blogMock6;
        assertEquals(blog6, blogRepository.get5Recent().get(5));

        //post new Comment
        when(commentRepositoryMock.addComment(commentMock)).thenReturn(commentMock);
        Comment comment = commentRepositoryMock.addComment(commentMock);
        assertEquals(commentRepositoryMock.addComment(commentMock), commentMock);

        //delete a comment
        when(commentRepositoryMock.deleteComment(commentMock)).thenReturn(true);
        assertEquals("The comment was deleted",true, commentRepositoryMock.deleteComment(commentMock));

        //get 5 most recent entries
        when(commentRepositoryMock.get5RecentEntries()).thenReturn(fiveRecentCommentFile);
        fiveRecentCommentFile = commentRepositoryMock.get5RecentEntries();
        assertEquals("Get a list of 5 recent file",fiveRecentCommentFile, commentRepositoryMock.get5RecentEntries());

        when(commentRepositoryMock.get5RecentEntries().size()).thenReturn(5);
        assertEquals("The list has 5 objects",5, commentRepositoryMock.get5RecentEntries().size());

    }
}

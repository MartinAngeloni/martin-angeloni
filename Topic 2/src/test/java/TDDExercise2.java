import org.junit.Before;
import org.junit.Test;
import point2.Blog;
import point2.BlogRepository;
import point2.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by martin on 4/7/2018.
 */
public class TDDExercise2 {

    private User userMock;

    private User creatorMock;

    private BlogRepository blogRepository;

    private Blog blogMock1;
    private Blog blogMock2;
    private Blog blogMock3;
    private Blog blogMock4;
    private Blog blogMock5;
    private Blog blogMock6;
    private Blog blogMock7;
    private Blog blogMock8;
    private Blog blogMock9;
    private Blog blogMock10;

    private List<Blog> blogList;
    private List<Blog> fiveRecent;

    @Before
    public void setUp(){
        blogRepository = mock(BlogRepository.class);

        blogMock1 = mock(Blog.class);
        blogMock2 = mock(Blog.class);
        blogMock3 = mock(Blog.class);
        blogMock4 = mock(Blog.class);
        blogMock5 = mock(Blog.class);
        blogMock6 = mock(Blog.class);
        blogMock7 = mock(Blog.class);
        blogMock8 = mock(Blog.class);
        blogMock9 = mock(Blog.class);
        blogMock10 = mock(Blog.class);

        blogList = mock(ArrayList.class);
        fiveRecent = mock(ArrayList.class);
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

        //create 10 entry
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
        when(blogRepository.add(blogMock7)).thenReturn(blogMock7);
        Blog blogFound7 = blogRepository.add(blogMock7);
        assertEquals(blogMock7, blogFound7);
        when(blogRepository.add(blogMock8)).thenReturn(blogMock8);
        Blog blogFound8 = blogRepository.add(blogMock8);
        assertEquals(blogMock8, blogFound8);
        when(blogRepository.add(blogMock9)).thenReturn(blogMock9);
        Blog blogFound9 = blogRepository.add(blogMock9);
        assertEquals(blogMock9, blogFound9);
        when(blogRepository.add(blogMock10)).thenReturn(blogMock10);
        Blog blogFound10 = blogRepository.add(blogMock10);
        assertEquals(blogMock10, blogFound10);

        when(blogRepository.findAll().size()).thenReturn(10);
        assertEquals("10 entry was created",10, blogRepository.findAll().size());

        //return 5 most recent file
        when(blogRepository.get5Recent()).thenReturn(fiveRecent);
        fiveRecent = blogRepository.get5Recent();
        assertEquals("The list return 5 files",fiveRecent, blogRepository.get5Recent());

        when(blogRepository.get5Recent().get(4)).thenReturn(blogMock5);
        Blog blog5 = blogMock5;
        assertEquals(blog5, blogRepository.get5Recent().get(4));

        when(blogRepository.get5Recent().get(5)).thenReturn(blogMock6);
        Blog blog6 = blogMock6;
        assertEquals(blog6, blogRepository.get5Recent().get(5));

        when(blogRepository.get5Recent().get(6)).thenReturn(blogMock7);
        Blog blog7 = blogMock7;
        assertEquals(blog7, blogRepository.get5Recent().get(6));

        when(blogRepository.get5Recent().get(7)).thenReturn(blogMock8);
        Blog blog8 = blogMock8;
        assertEquals(blog8, blogRepository.get5Recent().get(7));

        when(blogRepository.get5Recent().get(8)).thenReturn(blogMock9);
        Blog blog9 = blogMock9;
        assertEquals(blog9, blogRepository.get5Recent().get(8));

        when(blogRepository.get5Recent().get(9)).thenReturn(blogMock10);
        Blog blog10 = blogMock10;
        assertEquals(blog10, blogRepository.get5Recent().get(9));



    }
}

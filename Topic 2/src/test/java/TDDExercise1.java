import org.junit.Before;
import org.junit.Test;
import point1.File;
import point1.RecentFile;
import static org.junit.Assert.*;

/**
 * Created by martin on 30/6/2018.
 */
public class TDDExercise1 {

    private File file;
    private File file2;
    private File file3;
    private File file4;
    private File file5;
    private File file6;

    @Before
    public void setUp(){
        file = new File("file1");
        file2 = new File("file2");
        file3 = new File("file3");
        file4 = new File("file4");
        file5 = new File("file5");
        file6 = new File("file6");
    }

    @Test()
    public void firstTDDExercise1(){

        //empty for the first time
        assertTrue("Verify if the list is empty", RecentFile.listRecentFile().isEmpty());

        //open = added
        file.open();
        assertEquals("The file is already added", 1, RecentFile.listRecentFile().size());

        //no duplicated file, bumped to top
        file2.open();
        file.close();
        file.open();
        assertEquals("File 2 is the first", file2, RecentFile.listRecentFile().get(0));
        assertEquals("File 1 is the last", file, RecentFile.listRecentFile().get(1));
        assertEquals("No duplicate items", 2, RecentFile.listRecentFile().size());

        //list full == oldest item removed (file2)
        file3.open();
        assertEquals(file3, RecentFile.listRecentFile().get(2));
        file4.open();
        assertEquals(file4, RecentFile.listRecentFile().get(3));
        file5.open();
        assertEquals(file5, RecentFile.listRecentFile().get(4));
        file6.open();
        assertEquals("Length of the list is 5", 5, RecentFile.listRecentFile().size());
        assertEquals("The oldest file was removed", true, !RecentFile.listRecentFile().contains(file2));
        assertEquals("The file 6 is now the last in the list", file6, RecentFile.listRecentFile().get(4));
        assertEquals("The file 2 is now the first in the list", file, RecentFile.listRecentFile().get(0));
    }
}

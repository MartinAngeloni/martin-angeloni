import org.junit.Before;
import org.junit.Test;
import point1.File;
import point1.RecentFile;

/**
 * Created by martin on 30/6/2018.
 */
import static org.junit.Assert.*;

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
        assertTrue("Verify if the list is empty", RecentFile.listRecenFile().isEmpty());

        //open = added
        file.open();
        assertEquals("The file is already added", 1, RecentFile.listRecenFile().size());

        //no duplicated file
        file2.open();
        file.close();
        file.open();
        assertEquals("File 1 is the first", file, RecentFile.listRecenFile().get(0));
        assertEquals("File 2 is the last", file2, RecentFile.listRecenFile().get(1));
        assertEquals("No duplicate items", 2, RecentFile.listRecenFile().size());

        //list full == oldest item removed
        file3.open();
        file4.open();
        file5.open();
        file6.open();
        assertEquals("Length of the list is 5", 5, RecentFile.listRecenFile().size());
        assertEquals("The oldest file was removed", true, !RecentFile.listRecenFile().contains(file));
        assertEquals("The file 2 is now the first in the list", file2, RecentFile.listRecenFile().get(0));
        assertEquals("The file 6 is now the last in the list", file6, RecentFile.listRecenFile().get(4));
    }

    @Test
    public void secondTDDExercise2(){
        //crear 1 blog
        //guardarlo
        //verificar que exista

        //borrarlo
        //vericiar que fue borrado

        //crear 10 blogs
        //mostrar 5 recientes

    }




}

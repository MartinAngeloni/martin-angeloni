package point1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 30/6/2018.
 */
public class RecentFile {

    private static List<IRecentFile> list;

    private RecentFile(){
    }

    public static List listRecentFile(){
        if(list == null) {
            list = new ArrayList<IRecentFile>();
        }
        return list;
    }
}

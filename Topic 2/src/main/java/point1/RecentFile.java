package point1;

import point1.IRecentFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 30/6/2018.
 */
public class RecentFile {


    private static List<IRecentFile> list;

    private RecentFile(){

    }


    public static List listRecenFile(){
        if(list == null) {
            list = new ArrayList<IRecentFile>();
        }
        return list;
    }


}

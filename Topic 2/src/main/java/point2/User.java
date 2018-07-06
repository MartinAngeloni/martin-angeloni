package point2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 30/6/2018.
 */
public class User {

    private String name;
    private List<Blog> blog;

    public User(String name){
        this.name = name;
        this.blog = new ArrayList<Blog>();
    }
}

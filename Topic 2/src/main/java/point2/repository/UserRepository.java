package point2.repository;

import point2.entity.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 19/7/2018.
 */
public class UserRepository {

    private static Integer id = 0;
    private static List<User> users;
    private static UserRepository instance;

    private UserRepository(){
        if(users == null){
            users = new ArrayList<User>();
        }
    }

    public static UserRepository getInstance(){
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }


}

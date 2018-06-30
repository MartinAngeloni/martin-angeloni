package utils; /**
 * Created by martin on 28/6/2018.
 */

//just one instance of this class
public class SingleConnection {

    //for connect with database just once
    private static Connection connection;

    //a private constructor of Singleton
    private SingleConnection(){
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        SingleConnection.connection = connection;
    }
}

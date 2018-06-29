
/**
 * Created by martin on 28/6/2018.
 */
import utils.Connection;
import utils.ConnectionBuilder;
import utils.ProxyConnection;
import utils.SingleConnection;


public class Main {

    public static void main (String arg[]){

        //create the builder connection
        ConnectionBuilder connectionBuilder = new ConnectionBuilder();
        //the builder connection created the specific database connection
        Connection connection = connectionBuilder.createMongoDBConnection("stringConnectionForMongoDB");
        //set the singleton for all request
        SingleConnection.setConnection(connection);

        //proxy
        ProxyConnection proxyConnection = new ProxyConnection();
        //the proxy use the singleton for connect to database if not is connected
        proxyConnection.connect();
        System.out.println("Connection State: " + (connection.isConnected() ? "connected":"disconnected"));

        //contrary
        proxyConnection.disconnect();
        System.out.println("Connection State: " + (connection.isConnected() ? "connected":"disconnected"));

    }

}

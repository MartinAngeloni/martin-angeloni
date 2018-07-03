package utils;

/**
 * Created by martin on 28/6/2018.
 */
public class ProxyConnection implements IConnected{

    private Connection connection;

    @Override
    public boolean connect() {
        connection = SingleConnection.getConnection();
        if(connection == null || !connection.isConnected()){
            connection.connect();
        }
        return false;
    }

    @Override
    public boolean disconnect() {
        connection = SingleConnection.getConnection();
        if(connection == null || connection.isConnected()){
            connection.disconnect();
        }
        return false;
    }
}

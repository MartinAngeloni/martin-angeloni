package utils;

import java.util.List;
import java.util.Map;

/**
 * Created by martin on 28/6/2018.
 */
public abstract class Connection implements IConnected{

    private String connectionString;
    private boolean connected;
    private boolean error;

    public abstract List<Map<String, Object>> executeQuery(String query); //select
    public abstract int executeNonQuery(String query); //update

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public abstract boolean connect();

    public abstract boolean disconnect();

    public boolean isConnected(){
        return connected;
    }

}

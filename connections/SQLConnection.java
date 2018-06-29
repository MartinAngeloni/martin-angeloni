package connections;

import utils.Connection;

import java.util.List;
import java.util.Map;

/**
 * Created by martin on 28/6/2018.
 */
public class SQLConnection extends Connection {

    public SQLConnection(String stringConnection){
        setConnectionString(stringConnection);
    }

    @Override
    public List<Map<String, Object>> executeQuery(String query) {
        return null;
    }

    @Override
    public int executeNonQuery(String query) {
        return 0;
    }

    @Override
    public boolean connect() {
        setConnected(true);
        if(!isError()){
            return true;
        }
        return false;
    }

    @Override
    public boolean disconnect() {
        setConnected(false);
        if(!isError()){
            return true;
        }
        return false;
    }
}

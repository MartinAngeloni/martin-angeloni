package utils;

import connections.MongoDBConnection;
import connections.OracleConnection;
import connections.SQLConnection;

/**
 * Created by martin on 28/6/2018.
 */
public class ConnectionBuilder {

    public Connection createSQLConnection(String stringConection){
        Connection connection = new SQLConnection(stringConection);
        return connection;
    }

    public Connection createMongoDBConnection(String stringConection){
        Connection connection = new OracleConnection(stringConection);
        return connection;
    }

    public Connection createOracleConnection(String stringConnection){
        Connection connection = new MongoDBConnection(stringConnection);
        return connection;
    }

}

package com.Factory;

public class ConnectionFactory {
    private String type;

    public ConnectionFactory(String type) {
        this.type = type;
    }

    public Connection createConnection(){
        Connection con=null;
        if(type.equalsIgnoreCase("oracle"))
            con=new MyOracleConnection();
        else if (type.equalsIgnoreCase("mysql")) {
            con=new MySQLServerConnection();
        }
        else if (type.equalsIgnoreCase("securemysql")) {
            con=new MySQLServerConnection();
        }
        else if (type.equalsIgnoreCase("secureoracle")) {
            con=new MySQLServerConnection();
        }
        return con;

    }
}

package com.local.ihor.repository;

import com.local.ihor.StockExchange;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseTable implements Closeable {

    Connection connection;
    private String tableName;

    public BaseTable(String tableName) throws SQLException {
        this.tableName = tableName;
        this.connection = StockExchange.getConnection();
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed())
                connection.close();

        } catch (SQLException e) {
            System.out.println("Connection closing error!");
        }
    }

    public void executeSqlStatement(String sql, String description) throws SQLException {
        reopenConnection();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        statement.close();
        if (description != null)
            System.out.println(description);

    }

    public void executeSqlStatement(String sql) throws SQLException {
        executeSqlStatement(sql, null);
    }

    public void reopenConnection() throws SQLException {
        if (connection == null || connection.isClosed()){
            connection = StockExchange.getConnection();
        }

    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}

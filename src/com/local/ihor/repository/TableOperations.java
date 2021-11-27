package com.local.ihor.repository;

import java.sql.SQLException;

public interface TableOperations {
    void createTable() throws SQLException;
    void  createForeignKeys() throws SQLException;
}

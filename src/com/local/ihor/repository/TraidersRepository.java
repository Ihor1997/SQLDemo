package com.local.ihor.repository;

import com.local.ihor.model.BaseModel;

import java.sql.SQLException;

public class TraidersRepository extends BaseTable implements TableOperations {
    public TraidersRepository() throws SQLException {
        super("traiders");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS traiders(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "freqTick INTEGER NOT NULL," +
                "cash DECIMAL(15,2) NOT NULL DEFAULT 1000," +
                "changeProbability INTEGER NOT NULL," +
                "about VARCHAR(255) NULL)", "Created table " + getTableName());

    }

    @Override
    public void createForeignKeys() throws SQLException {

    }
}

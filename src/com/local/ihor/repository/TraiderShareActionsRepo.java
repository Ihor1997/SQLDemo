package com.local.ihor.repository;

import java.sql.SQLException;

public class TraiderShareActionsRepo extends BaseTable implements TableOperations {

    public TraiderShareActionsRepo() throws SQLException {
        super("traiders_share_actions");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS traiders_share_actions(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "operation INTEGER NOT NULL," +
                "amount DECIMAL NOT NULL)", "Created table " + getTableName());
        ;

    }

    @Override
    public void createForeignKeys() throws SQLException {

    }
}

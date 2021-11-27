package com.local.ihor.repository;

import javafx.scene.control.Tab;

import java.sql.SQLException;

public class ShareRateRepository extends BaseTable implements TableOperations {

    public ShareRateRepository() throws SQLException {
        super("share_rates");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS share_rates("+
                "id BIGINT AUTO_INCREMENT PRIMARY KEY,"+
                "operData DATETIME NOT NULL,"+
                "SHARE BIGINT NOT NULL,"+
                "rate DECIMAL(15,2) NOT NULL)", "Have been created table " + getTableName());

    }

    @Override
    public void createForeignKeys() throws SQLException {

        super.executeSqlStatement("ALTER TABLE share_rates ADD FOREIGN KEY (share) REFERENCES shares(id)");

    }
}

package com.local.ihor;

import com.local.ihor.model.Share;
import com.local.ihor.repository.ShareRateRepository;
import com.local.ihor.repository.SharesRepository;
import com.local.ihor.repository.TraiderShareActionsRepo;
import com.local.ihor.repository.TraidersRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchange {

    public static final String DB_URL = "jdbc:h2:/Users/ihortiurdo/IdeaProjects/SQLDemo/db/stockExchange";
    public static final String DB_DRIVER = "org.h2.Driver";

    private SharesRepository sharesRepository;
    private ShareRateRepository shareRateRepository;
    private TraidersRepository traidersRepository;
    private TraiderShareActionsRepo traiderShareActionsRepo;

    public static void main(String[] args) {
        try {
           StockExchange stockExchange = new StockExchange();
           stockExchange.createTablesAndForeignKeys();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("JDBC driver not found!");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("SQL Error!");
        }

    }

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(DB_URL);
    }

    public StockExchange() throws ClassNotFoundException, SQLException {
        Class.forName(DB_DRIVER);
        this.sharesRepository = new SharesRepository();
        this.shareRateRepository = new ShareRateRepository();
        this.traidersRepository = new TraidersRepository();
        this.traiderShareActionsRepo = new TraiderShareActionsRepo();
    }

    private void createTablesAndForeignKeys() throws SQLException {
        sharesRepository.createTable();
        sharesRepository.createForeignKeys();
        shareRateRepository.createTable();
        shareRateRepository.createForeignKeys();
        traidersRepository.createTable();
        traidersRepository.createForeignKeys();
        traiderShareActionsRepo.createTable();
        traiderShareActionsRepo.createForeignKeys();
    }
}

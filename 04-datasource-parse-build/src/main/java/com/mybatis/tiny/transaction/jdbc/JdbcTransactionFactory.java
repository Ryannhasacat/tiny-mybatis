package com.mybatis.tiny.transaction.jdbc;

import com.mybatis.tiny.session.TransactionIsolationLevel;
import com.mybatis.tiny.transaction.Transaction;
import com.mybatis.tiny.transaction.TransactionFactory;
import com.mysql.jdbc.Connection;

import javax.sql.DataSource;

public class JdbcTransactionFactory implements TransactionFactory {

    @Override
    public Transaction newTransaction(Connection connection) {
        return new JdbcTransaction(connection);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new JdbcTransaction(dataSource, level, autoCommit);
    }
}

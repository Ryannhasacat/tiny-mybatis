package com.mybatis.tiny.datasource;

import javax.sql.DataSource;
import java.util.Properties;

public interface DataSourceFactory {

    void setProperties(Properties props);

    DataSource getDataSource();
}

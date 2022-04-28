package java.com.mybatis.tiny.session.defaults;


import java.com.mybatis.tiny.session.Configuration;
import java.com.mybatis.tiny.session.SqlSession;
import java.com.mybatis.tiny.session.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }


    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}

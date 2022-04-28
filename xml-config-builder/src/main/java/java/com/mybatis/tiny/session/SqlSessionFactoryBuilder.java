package java.com.mybatis.tiny.session;

import java.com.mybatis.tiny.builder.xml.XMLConfigBuilder;
import java.com.mybatis.tiny.session.defaults.DefaultSqlSessionFactory;
import java.io.Reader;

public class SqlSessionFactoryBuilder {


   public SqlSessionFactory build(Reader reader){
       XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
       return build(xmlConfigBuilder.parse());
   }

    public SqlSessionFactory build(Configuration config) {
        return new DefaultSqlSessionFactory(config);
    }
}

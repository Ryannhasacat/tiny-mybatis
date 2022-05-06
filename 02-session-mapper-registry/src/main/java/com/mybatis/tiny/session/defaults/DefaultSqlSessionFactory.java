package com.mybatis.tiny.session.defaults;

import com.mybatis.tiny.binding.MapperRegistry;
import com.mybatis.tiny.session.SqlSession;
import com.mybatis.tiny.session.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }


    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}

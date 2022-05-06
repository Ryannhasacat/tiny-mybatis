package com.test;


import com.mybatis.tiny.io.Resources;
import com.mybatis.tiny.session.SqlSession;
import com.mybatis.tiny.session.SqlSessionFactory;
import com.mybatis.tiny.session.SqlSessionFactoryBuilder;
import com.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ApplicationTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test_SqlSessionFactory() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsReader("mybatis-config-datasource.xml"));

        SqlSession sqlSession = sqlSessionFactory.openSession();

        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        String user = userDao.queryUserInfoById(1L);

        logger.info("测试结果：{}", user);


    }


}

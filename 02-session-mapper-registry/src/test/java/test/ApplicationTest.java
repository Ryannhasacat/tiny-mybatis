package test;


import com.mybatis.tiny.binding.MapperRegistry;
import com.mybatis.tiny.session.SqlSession;
import com.mybatis.tiny.session.SqlSessionFactory;
import com.mybatis.tiny.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.dao.IUserDao;

public class ApplicationTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test_MapperProxyFactory() {
        // 1. 注册 Mapper
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("test.dao");

        // 2. 从 SqlSession 工厂获取 Session
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取映射器对象
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);

        String res = mapper.queryUserName("10001");

        logger.info("测试结果：{}", res);


    }
}

package com.ccrt6.utils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zh
 * @Title:工具类
 * @date 2022/6/2818:24
 */
//sqlSessionFactory --> sqlSession
public class MybatisUtils {
    private static SqlSessionFactory build;
    
//    使用mybatis第一步
//    获取sqlSessionFactory对象
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
            build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//        既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
//        SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。
    public static SqlSession getSqlSession(){
        return build.openSession();

    }


}

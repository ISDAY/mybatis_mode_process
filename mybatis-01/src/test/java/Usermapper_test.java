import com.ccrt6.bean.Userinfo;
import com.ccrt6.mapper.UserMapper;
import com.ccrt6.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author zh
 * @Title: Usermapper_test
 * @Package com.ccrt6.mapper
 * @Description: Usermapper_test的测试类
 * @date 2022/6/28/20:48
 */
public class Usermapper_test {

    @Test
    public void testFindUserById(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Userinfo userById = mapper.findUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }
}

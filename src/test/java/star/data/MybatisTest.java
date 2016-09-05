//package star.data;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Date;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import star.domain.User;
//
//public class MybatisTest {
//
//	@Test
//	public void test() throws IOException{
//		String resource = "star/data/mybatis-config.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//		SqlSessionFactory factory = builder.build(inputStream);
//		SqlSession session = factory.openSession();
//		User user = new User();
//		user.setUsername("star");
//		user.setAge(8);
//		user.setCreateTime(new Date());
//		session.insert("star.data.UserMapper.insert",user);
//		session.commit();
//		session.close();
//	}
//}

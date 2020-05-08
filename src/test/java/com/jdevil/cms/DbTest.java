package com.jdevil.cms;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/config/context-*.xml",
		"file:src/main/webapp/WEB-INF/spring/**/*.xml"
})
public class DbTest {
	
	private static final Logger logger = LoggerFactory.getLogger(DbTest.class);
	//private static final String DRIVER = "com.mysql.jdbc.Driver";
	//private static final String URL = "jdbc:mysql://localhost:3306/test";
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/test";
	private static final String USER = "root";
	private static final String PWD = "test";
	
	@Resource(name = "dataSource")
	private DataSource dataSource;
	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
	/*@Test
	public void dataSourceConnectionTest() throws Exception {
		try (Connection conn = dataSource.getConnection()) {			
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void sqlSessionTest() throws Exception{
		try (SqlSession sqlSessionTemplate = sqlSessionFactory.openSession()) {
			System.out.println("sqlSessionTemplate : " + sqlSessionTemplate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	@Test
	public void simpleConnectionTest() throws Exception {
		logger.info("simpleConnectionTest() 시작");
		Class.forName(DRIVER);
		try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package org.npe.lucene.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BatchDAO {
	
/*	private static SqlSessionFactory sqlMapper;
	
	static{
		try{
			Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String getTime() throws Exception {
		try(SqlSession session = sqlMapper.openSession()){
			
			return session.selectOne("org.npe.mapper.BatchMapper.getTime");
		}
	}*/
	
	private static final String ORACLE_JDBC_DRIVER_ORACLE_DRIVER = "com.mysql.jdbc.Driver";
	private static final String ORG_APACHE_COMMONS_DBCP_POOLING_DRIVER = "org.apache.commons.dbcp.PoolingDriver";
	private static final String JDBC_APACHE_COMMONS_DBCP_POOL = "jdbc:apache:commons:dbcp:/pool";
	
	protected Connection con;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	enum SQL {
		
		SELECT("select now()");
		
		String value;
		
		SQL(String value) {
			this.value = value;
		}
	}

	public String getTime() throws Exception {
		
		Class.forName(ORACLE_JDBC_DRIVER_ORACLE_DRIVER);
		Class.forName(ORG_APACHE_COMMONS_DBCP_POOLING_DRIVER);
		String jdbcDrive = JDBC_APACHE_COMMONS_DBCP_POOL;	
		
		this.con = DriverManager.getConnection(jdbcDrive);

		pstmt = con.prepareStatement(SQL.SELECT.value);
				
		rs = pstmt.executeQuery();
		rs.next();
				
		String time = rs.getString(1);
		
		rs.close();
		pstmt.close();
		con.close();
		
		return time;
	}

}
